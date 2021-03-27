package com.example.start01.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This class demonstrates the use of dependency injection
 * @author Vishal K
 *
 */
public class DependencyInjectionApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext config = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FootBallCoach footBallCoach = config.getBean("footBallCoach", FootBallCoach.class);
		
		System.out.println("Football Daily Workout : "+ footBallCoach.dailyWorkout());
		System.out.println("Today's fortune : "+ footBallCoach.getFortune());
	}
}
