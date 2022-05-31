package tests;

import example.MyApplication;
import example.StaticInstrumentEventBatchConsumer;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.cloud.contract.stubrunner.StubTrigger;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties.StubsMode;
import org.springframework.cloud.stream.binder.test.TestChannelBinderConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.messaging.Message;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRateEvent;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {MyApplication.class}, webEnvironment = WebEnvironment.NONE)
@Import(TestChannelBinderConfiguration.class)
@AutoConfigureStubRunner(stubsMode = StubsMode.CLASSPATH, ids = {"uk.co.dave:fx-producer:+:stubs"})
@TestPropertySource(properties = "spring.cloud.stream.bindings.fxRates-in-0.consumer.use-native-decoding=false")
public class FxRateBatchIntegrationFailingTest {
  @Autowired
  private StubTrigger stubTrigger;

  @Autowired
  private StaticInstrumentEventBatchConsumer staticInstrumentEventBatchConsumer;
  

  @Test
  public void testBatch() throws InterruptedException {
    staticInstrumentEventBatchConsumer.getCache().clear();
    stubTrigger.trigger("triggerAvroFxRateEvent");
    Thread.sleep(1000);
    Message<List<AvroFxRateEvent>> event = staticInstrumentEventBatchConsumer.getCache().get("event");
    Assertions.assertNotNull(event);
    Assertions.assertEquals(1, event.getPayload().size());
    Assertions.assertEquals("GBP", event.getPayload().get(0).getFrom());
  }
  
}
