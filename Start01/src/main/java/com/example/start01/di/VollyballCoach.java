package com.example.start01.di;

import com.example.start01.di.NewCoach;
import com.example.start01.di.definition.FortuneService;

/**
 * Reads coachName and coachEmail from properties files
 * @author Evosys
 *
 */
public class VollyballCoach implements FortuneService, NewCoach {

	private String coachName;	
	private String coachEmail;
	private FortuneService fortuneService;
	
	public VollyballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String dailyWorkout() {
		return "Play "
				+ "vollyball for 2 hours a day";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getDailyFortune();
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
