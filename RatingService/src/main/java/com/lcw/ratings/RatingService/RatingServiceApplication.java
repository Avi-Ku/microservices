package com.lcw.ratings.RatingService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableEurekaClient
public class RatingServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(RatingServiceApplication.class, args);
		System.out.println("This is our first Application in microservices");
	}

}
