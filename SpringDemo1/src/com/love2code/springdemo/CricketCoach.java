package com.love2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	//no argument constructor
	public CricketCoach() {
		System.out.println("Cricketcoach: inside zero-arg constructor");
	}	
	
	//Setters	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Cricketcoach fortuneService setter");
		this.fortuneService = fortuneService;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside Cricketcoach emailAddress setter");
		this.emailAddress = emailAddress;
	}
	public void setTeam(String team) {
		System.out.println("Inside Cricketcoach team name setter");
		this.team = team;
	}

	//Getters
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	
	//Instance methods
	@Override
	public String getDailyWorkout() {
		return "Workout: Whip some bails off";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.GetFortune();				
	}	
	
	@Override
	public String getRandomDailyFortune() {
		return fortuneService.GetRandomFortune();
	}
}
