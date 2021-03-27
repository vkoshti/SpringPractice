package com.example.learning02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.start01.definition.Coach;

public class Start01Application {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext to read file configuration
		ClassPathXmlApplicationContext config = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get a bean by passing the unique object identifier
		Coach coach = config.getBean("basketBallCoach", Coach.class);
		System.out.println("Daily work out: "+ coach.dailyWorkout());
	}

}
