package com.sachin.lms.registrationserviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RegistrationServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationServiceApiApplication.class, args);
	}

}
