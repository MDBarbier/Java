package com.love2code.springdemo;

import org.springframework.stereotype.Component;

@Component("someCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your serves";
	}

}
