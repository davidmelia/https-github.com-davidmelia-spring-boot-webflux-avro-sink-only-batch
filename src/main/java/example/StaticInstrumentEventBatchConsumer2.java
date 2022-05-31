package example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

// @Component
@AllArgsConstructor
@Slf4j
public class StaticInstrumentEventBatchConsumer2 {

  private Map<String, Message<byte[]>> cache = new HashMap<>();

  @Bean
  public Function<Flux<Message<byte[]>>, Mono<Void>> fxRatesBatch() {
    return events -> events.flatMapSequential(event -> {
      return Mono.just(event).doOnNext(p -> log.info("Processing Batch: {}", p)).doOnNext(p -> {

        cache.put("event", p);
      })
          .then();
    }, 1).then();
  }

  public Map<String, Message<byte[]>> getCache() {
    return cache;
  }
  

}
