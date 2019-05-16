package com.my.springboot6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.my.springboot6.controller")
@SpringBootApplication
public class Springboot6Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot6Application.class, args);
	}
}
