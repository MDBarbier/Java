package com.love2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("theTennisCoach") //Specifying an explicit bean id
@Component
public class TennisCoach implements Coach {

	//Constructor injection
	/*@Autowired //spring auto-scans for an implementation class of the specified type when this bean is instantiated, i.e. fortune service
	public TennisCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}*/
	
	//Constructor injection with qualified implementation
	/*@Autowired //spring auto-scans for an implementation class of the specified type when this bean is instantiated, i.e. fortune service
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}*/
	
	public TennisCoach()
	{
		
	}	
	
	@PostConstruct
	public void startupCode()
	{
		System.out.println("---Inside startupCode");
	}
	
	@PreDestroy //This will not get called on prototype scope beans
	public void cleanupCode()
	{
		System.out.println("---Inside cleanupCode");
	}
	
	//This is field injection, uses Reflection. You then don't need a setter. 
	@Autowired
	@Qualifier("happyFortuneService") //When you have more than 1 matching implementation you must qualify which one to use
	private FortuneService fortuneService;
	
	
	@Override
	public String GetDailyWorkout() {
		return "Practice dropshots at the net";		
	}

	@Override
	public String GetDailyFortune() {
		return fortuneService.GetFortune();
	}

	//This is an example of setter injection as an alternative to constructor injection
	//This can be done with any method not just a setter method
	//	@Autowired
	//	public void setFortuneServce(FortuneService fortuneService)
	//	{
	//		this.fortuneService = fortuneService;
	//	}
}
