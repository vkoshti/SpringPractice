package com.example.start01.di;

import java.util.Random;

import com.example.start01.di.definition.FortuneService;

/**
 * Implements fortune service, which makes people happy by providing daily fortunes
 * @author Evosys
 *
 */
public class HappyFortuneService implements FortuneService {
	
	private String[] fortunes = {
			"You're going to rock today",
			"You will hear some good news",
			"This is your day"
	};

	@Override
	public String getDailyFortune() {
		Random random = new Random();
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}

}
