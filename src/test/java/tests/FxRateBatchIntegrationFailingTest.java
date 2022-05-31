package tests;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import example.MyApplication;
import example.StaticInstrumentEventBatchConsumer;
import java.io.IOException;
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
  public void testBatch() throws InterruptedException, Exception, DatabindException, IOException {
    staticInstrumentEventBatchConsumer.getCache().clear();
    stubTrigger.trigger("triggerAvroFxRateEvent");
    Thread.sleep(1000);
    Message<?> cachedEvent = staticInstrumentEventBatchConsumer.getCache().get("event");
    // OK so cachedEvent should be a List<AvroFxRateEvent> but is actually a byte[] array which
    // represents a single AvroFxRateEvent
    AvroFxRateEvent event = new ObjectMapper().readValue((byte[]) cachedEvent.getPayload(), AvroFxRateEvent.class);
    Assertions.assertNotNull(event);
    Assertions.assertEquals("GBP", event.getFrom());
    Assertions.fail(
        "the event should be a List<AvroFxRateEvent> but is actually a AvroFxRateEvent as batch-mode doesn't seem to be supported by either Spring Cloud Contract or Spring Cloud Stream Test Binder.");

    //
  }
  
}
