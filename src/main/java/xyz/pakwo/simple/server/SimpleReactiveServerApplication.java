package xyz.pakwo.simple.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import xyz.pakwo.simple.server.client.CounterClient;

@SpringBootApplication
public class SimpleReactiveServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleReactiveServerApplication.class, args);
		
		CounterClient client = new CounterClient();
		System.out.println(client.getResponse());
	}

}
