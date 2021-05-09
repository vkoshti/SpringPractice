package com.example.springbeanscope;

import org.springframework.stereotype.Component;

/**
 * Default Component name, classname start with first letter as lower case
 * @author Vishal
 *
 */
@Component
public class CricketCoach {
	public void getDailyWorkout() {
		System.out.println("Play cricket");
	}
}
