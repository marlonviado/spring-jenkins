package com.marlonviado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@Slf4j
public class SpringJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
		log.info("Application is running...");
	}

}
