package com.example.start01.di;

import com.example.start01.di.definition.FortuneService;

/**
 * Implements fortune service, which makes people happy by providing daily fortunes
 * @author Evosys
 *
 */
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "You will hear a good news today";
	}

}
