package com.example.start01.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * This represents dependency injection with setting default literal values
 * @author Evosys
 *
 */
public class DependencyInjectionLiteralValApp {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext config = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			
			ChessCoach coach = config.getBean("chessCoach", ChessCoach.class);
			System.out.println("Chess Coach Name  :"+ coach.getCoachName());
			System.out.println("Chess Coach Email : "+ coach.getCoachEmail());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
