package com.love2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String GetFortune() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(10);
		
		return "A bird will poop on your head in " + randomNumber + " seconds. Look out!";
	}

}
