package com.bridgelabz.fundooregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FundooregistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FundooregistryApplication.class, args);
	}

}
