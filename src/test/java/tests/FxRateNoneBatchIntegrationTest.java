package tests;

import example.MyApplication;
import example.StaticInstrumentEventConsumer;
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
public class FxRateNoneBatchIntegrationTest {
  @Autowired
  private StubTrigger stubTrigger;

  @Autowired
  private StaticInstrumentEventConsumer staticInstrumentEventConsumer;
  

  @Test
  public void testNoneBatch() throws InterruptedException {
    staticInstrumentEventConsumer.getCache().clear();
    stubTrigger.trigger("triggerAvroFxRateEvent");
    Thread.sleep(1000);
    Message<AvroFxRateEvent> event = staticInstrumentEventConsumer.getCache().get("event");
    Assertions.assertNotNull(event);
    Assertions.assertEquals("GBP", event.getPayload().getFrom());
  }
  
}
