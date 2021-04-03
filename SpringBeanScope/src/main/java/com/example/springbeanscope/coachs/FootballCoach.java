package com.example.springbeanscope.coachs;

import com.example.springbeanscope.coach.def.Coach;

/**
 * This will be used as prototype scope - new instance for every request
 * @author Evosys
 *
 */
public class FootballCoach implements Coach {

	@Override
	public String getDailyCoachService() {
		return "Practice football everyday";
	}

}
