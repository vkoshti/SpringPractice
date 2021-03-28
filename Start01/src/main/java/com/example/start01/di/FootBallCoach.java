package com.example.start01.di;

import com.example.start01.definition.Coach;
import com.example.start01.di.definition.FortuneService;

public class FootBallCoach implements NewCoach{
	private FortuneService fortuneService;
	public FootBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String dailyWorkout() {
		return "Play Football";
	}
	
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getDailyFortune();
	}
	
}
