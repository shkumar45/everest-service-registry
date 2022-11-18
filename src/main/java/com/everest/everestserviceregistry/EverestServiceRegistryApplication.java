package com.everest.everestserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EverestServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EverestServiceRegistryApplication.class, args);
	}

}
