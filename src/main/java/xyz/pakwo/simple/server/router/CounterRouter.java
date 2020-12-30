package xyz.pakwo.simple.server.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import xyz.pakwo.simple.server.handler.CounterHandler;

@Configuration
public class CounterRouter {
	
	@Bean
	public RouterFunction<ServerResponse> route(CounterHandler handler) {
		return RouterFunctions
				.route(RequestPredicates.GET("/count")
				.and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), handler::count);
				
	}
}
