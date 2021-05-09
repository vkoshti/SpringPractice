package com.example.start01.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.start01.di.VollyballCoach;

/**
 * This application class represents reading and setting literal values from
 * properties file rather than hard-coding at applicationContext.xml file
 * See <b>VollyballCoach</b> and <b>sports.properties</b> file
 * @author Evosys
 *
 */
public class DependencyInjectionSetterPropFile {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext config = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			
			VollyballCoach coach = config.getBean("vollyballCoach", VollyballCoach.class);
			System.out.println("Vollyball Coach Name  :"+ coach.getCoachName());
			System.out.println("Vollyball Coach Email : "+ coach.getCoachEmail());
			System.out.println("Your today's fortune : "+ coach.getDailyFortune());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
