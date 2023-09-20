package com.devops.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {
	
	@GetMapping("/docker")
	public String getDocker() {
		return "Hi, I am creating a freestyle Jenkins pipeline to build "
				+ "and deploy a spring boot API/Web App using Docker.";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
