package com.example.springbeanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationApplication {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")){
			TennisCoach t = context.getBean("tennisCoach", TennisCoach.class);
			t.getDailyWorkout();
			
			//Default component name
			CricketCoach c = context.getBean("cricketCoach", CricketCoach.class);
			c.getDailyWorkout();
			
		}
	}

}
