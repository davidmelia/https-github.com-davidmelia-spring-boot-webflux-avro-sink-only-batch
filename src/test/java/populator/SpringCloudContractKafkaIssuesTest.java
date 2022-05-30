package populator;

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
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {TestApplication.class}, webEnvironment = WebEnvironment.MOCK)
@Import(TestChannelBinderConfiguration.class)
@AutoConfigureStubRunner(stubsMode = StubsMode.CLASSPATH, ids = {"uk.co.dave:fx-producer:+:stubs"})
@TestPropertySource(properties = "spring.cloud.stream.bindings.fxRates-in-0.consumer.use-native-decoding=false")
public class SpringCloudContractKafkaIssuesTest {
  @Autowired
  private StubTrigger stubTrigger;


  @Test
  public void testAvroFxRateEvent_FailsBecauseAckIsNull() {
    stubTrigger.trigger("triggerFxRateEventOnScheduledEvent");
  }

  
}
