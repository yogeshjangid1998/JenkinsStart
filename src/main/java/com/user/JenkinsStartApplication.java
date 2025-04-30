package com.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsStartApplication {

	private final Logger logger = LoggerFactory.getLogger(JenkinsStartApplication.class);

	@PostConstruct
	public void print() {
		logger.info("This logger is printed.....***********************");
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsStartApplication.class, args);
	}

}
