package xyz.pakwo.simple.server.client;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

public class CounterClient {

	private WebClient client = WebClient.create("http://localhost:8080");
	private Flux<Object> response = client.get()
			.uri("/count")
			.accept(MediaType.APPLICATION_JSON)
			.retrieve()
			.bodyToFlux(Object.class);
	
	public String getResponse() {
		response.subscribe(s -> {
			System.out.println(s.toString());
		});
		
		return "Counting in progress, you'll get the update once done!";
	}
}
