package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//Load spring configuration file ("Application context")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		//Retrieve bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());		
		System.out.println(theCoach.getDailyFortune());
		
		//Close the context
		context.close();

	}

}

