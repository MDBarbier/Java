package com.love2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String GetFortune() {
		
		return "Fortune: Ask again later...";
		
	}

}
