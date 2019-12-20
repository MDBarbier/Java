package com.love2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService theFortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

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
