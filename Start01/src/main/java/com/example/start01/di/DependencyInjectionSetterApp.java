package com.example.start01.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This application illustrates use of dependency injection for setter method
 * @author Vishal
 *
 */
public class DependencyInjectionSetterApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext config = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		NewCoach coach = config.getBean("hockeyCoach", NewCoach.class);
		
		System.out.println("Daily workout for hockey : "+ coach.dailyWorkout());
		
		System.out.println("Daily fortune for hockey : " + coach.getDailyFortune());
		
		config.close();
	}
}
