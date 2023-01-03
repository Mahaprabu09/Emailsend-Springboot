package com.Springboot.SentEmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SentEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentEmailApplication.class, args);
		System.out.println("Spring boot Email sending app");
	}

}
