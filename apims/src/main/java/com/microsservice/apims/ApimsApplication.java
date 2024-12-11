package com.microsservice.apims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//iniciar
public class ApimsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApimsApplication.class, args);
	}

}
