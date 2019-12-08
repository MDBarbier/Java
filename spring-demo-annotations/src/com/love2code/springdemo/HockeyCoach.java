package com.love2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //prototype creates a new instance each time you call it
public class HockeyCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	@Override
	public String GetDailyWorkout() {
		return "20 Slapshots and 20 Wrist shots";		
	}

	@Override
	public String GetDailyFortune() {
		return fortuneService.GetFortune();
	}

}
