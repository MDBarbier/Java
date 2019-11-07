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
	
	@Override
	public String getRandomDailyFortune() {
		return fortuneService.GetRandomFortune();
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	//zero argument constructor
	public TrackCoach() {}	
	
	
	//add an init method
	public void doStartupTasks()
	{
		System.out.println("TrackCoach: Performing startup tasks...");
	}
	
	//add a destroy method
	public void doDestroyTasks()
	{
		System.out.println("TrackCoach: Performing destroy tasks...");
	}
}
