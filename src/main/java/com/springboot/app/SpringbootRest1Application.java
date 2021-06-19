package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2

public class SpringbootRest1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRest1Application.class, args);
	}

}
