package com.example.springbeanscope;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach {
	public void getDailyWorkout() {
		System.out.println("Play tennis");
	}
}
