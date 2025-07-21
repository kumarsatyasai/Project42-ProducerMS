package com.nt;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class Project42ProducerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project42ProducerMsApplication.class, args);
	}

}
