package com.baciu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan
@EntityScan
@EnableJpaRepositories("com.baciu.repository")
@SpringBootApplication
public class RatePlace {

	public static void main(String[] args) {
		SpringApplication.run(RatePlace.class);
	}
}
