package xyz.pakwo.simple.server.service;

import java.time.Duration;

import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;

@Component
public class CounterService {
	
	private static final long DELAY = 1l; //delay in second
	
	public Flux<Object> countingNumber(int max) {

		return Flux.create(emitter -> {
			emitter.next(counting(max));
			emitter.complete();
		}).delaySequence(Duration.ofSeconds(DELAY));

	}

private String counting(int max) {
	int i = 0;
	while(i < max) {
//		System.out.println("counting " + i);
		i++;
	}
	
	return "Completed to count from  0 to " + i;
}
}
