package example;

import java.util.function.Function;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import uk.co.dave.consumer.fxrate.consumer.avro.AvroFxRateEvent;

@Component
@AllArgsConstructor
@Slf4j
public class StaticInstrumentEventConsumer {

  @Bean
  public Function<Flux<Message<AvroFxRateEvent>>, Mono<Void>> fxRates() {
    return events -> events.flatMapSequential(event -> {
      return Mono.just(event).doOnNext(p -> log.info("Processing: {}", p))
          .then();
    }, 1).then();
  }
  
}
