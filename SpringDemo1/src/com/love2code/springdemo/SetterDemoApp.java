package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {	
	
	public static void main(String[] args) {
		
		//load spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the spring bean
		var theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//execute methods on bean
		System.out.println(theCricketCoach.getRandomDailyFortune());
		System.out.println(theCricketCoach.getDailyWorkout());
		System.out.println(theCricketCoach.getEmailAddress());
		System.out.println(theCricketCoach.getTeam());
		
		//close the context
		context.close();
	}

}
