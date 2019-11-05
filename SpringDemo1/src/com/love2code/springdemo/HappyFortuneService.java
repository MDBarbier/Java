package com.love2code.springdemo;

import java.util.concurrent.ThreadLocalRandom;

public class HappyFortuneService implements FortuneService {

	private String[] fortuneArray = new String[]{"Maybe...", "Ask again later...", "It is unclear at this time...", "It is certain", "You shall go to the ball!"};
	
	@Override
	public String GetFortune() {
		
		return "Fortune: Ask again later...";
		
	}

	@Override
	public String GetRandomFortune() {
		var randomNumber = ThreadLocalRandom.current().nextInt(0, fortuneArray.length);
		return fortuneArray[randomNumber];		
	}
}
