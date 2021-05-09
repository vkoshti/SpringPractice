package com.example.start01.di;

import com.example.start01.di.definition.FortuneService;

public class ChessCoach implements FortuneService, NewCoach {

	private String coachName;
	private String coachEmail;
	
	@Override
	public String dailyWorkout() {
		return "Play chess for 2 hours a day";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getCoachEmail() {
		return coachEmail;
	}

	public void setCoachEmail(String coachEmail) {
		this.coachEmail = coachEmail;
	}

}
