package com.love2code.springdemo;

public class SwimCoach implements Coach {

	private FortuneService theFortuneService;
	
	public SwimCoach(FortuneService fs) {
		
		theFortuneService = fs;
	}
	
	@Override
	public String GetDailyWorkout() {
		return "Swim 10 lengths";
	}

	@Override
	public String GetDailyFortune() {
		return theFortuneService.GetFortune();		
	}

}
