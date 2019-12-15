package com.love2code.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String GetFortune() {
		return ("You will have a sad day :-(");
	}

}
