package com.example.learning02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.start01.defination.Coach;

public class Start01Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext config = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = config.getBean("cricketCoach", Coach.class);
		System.out.println("Daily work out: "+ coach.dailyWorkout());
	}

}
