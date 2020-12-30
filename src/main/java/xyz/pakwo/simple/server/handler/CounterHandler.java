package xyz.pakwo.simple.server.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;
import xyz.pakwo.simple.server.service.CounterService;

@Component
public class CounterHandler {
	
	@Autowired
	private CounterService counterService;
	
	public Mono<ServerResponse> count(ServerRequest request) {
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
				.body(counterService.countingNumber(1000), Object.class);
	}
}
