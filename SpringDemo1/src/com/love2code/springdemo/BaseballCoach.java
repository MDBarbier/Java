package com.love2code.springdemo;

public class BaseballCoach implements Coach 
{
	private FortuneService fortuneService;

	@Override 
	public String getDailyWorkout() {
		
		return "Workout: Spend 30 minutes on batting practice";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.GetFortune();
	}	
	
	//Constructor with DI accepting an instance of FortuneService interface
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}	
	
}
