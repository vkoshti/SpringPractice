package com.example.springbeanscope.coachs;

import com.example.springbeanscope.coach.def.Coach;

/**
 * This will be used as singleton class scope
 * @author Evosys
 *
 */
public class CricketCoach implements Coach {

	@Override
	public String getDailyCoachService() {
		return "run 500 meter everyday";
	}

}
