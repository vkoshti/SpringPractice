package com.example.springbeanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springbeanscope.coachs.CricketCoach;
import com.example.springbeanscope.coachs.FootballCoach;

public class SpringBeanScopeApplication {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			
			//get bean
			//cricket coach is singleton scoped object
			CricketCoach cricketCoach1 = context.getBean("cricketCoach", CricketCoach.class);
			CricketCoach cricketCoach2 = context.getBean("cricketCoach", CricketCoach.class);
			
			//compare two objects
			if (cricketCoach1==cricketCoach2) {
				System.out.println("CricketCoach : Yeah, we are same...");
			}else {
				System.out.println("CricketCoach : Naah, we are not same");
			}
			
			//get FootballCoach bean
			//FootballCoach is prototyped scoped object
			FootballCoach footballCoach1 = context.getBean("footballCoach", FootballCoach.class);
			FootballCoach footballCoach2 = context.getBean("footballCoach", FootballCoach.class);
			
			//compare two objects
			if (footballCoach1==footballCoach2) {
				System.out.println("FootballCoach : Yeah, we are same...");
			}else {
				System.out.println("FootballCoach : Naah, we are not same");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
