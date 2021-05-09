package com.example.start01.di;

import com.example.start01.di.definition.FortuneService;

public class HockeyCoach implements FortuneService, NewCoach {

	public FortuneService fortuneService;
	
	@Override
	public String dailyWorkout() {
		return "Play hockey for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getDailyFortune();
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
