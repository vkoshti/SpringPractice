package com.example.learning02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Learning02Application{
	
	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder builder) { return
	 * builder.sources(Learning02Application.class); }
	 */

	public static void main(String[] args) {
		SpringApplication.run(Learning02Application.class, args);
	}

}
