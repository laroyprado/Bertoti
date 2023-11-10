package com.projetobancodedados.Bertoti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication
public class BertotiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BertotiApplication.class, args);
	}

	@SpringBootApplication
	public static class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {
		@Override
		public void onApplicationEvent(ContextRefreshedEvent event) {
			System.out.println("Server is running");
		}
	}
}
