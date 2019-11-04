package com.love2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {

		return "Workout: Run 5k lazy boy";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.GetFortune();
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	//zero argument constructor
	public TrackCoach() {}	

}
