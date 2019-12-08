package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		System.out.println("TEST");
		
		//Read Spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get the bean from the Spring container
		var coachBean = context.getBean("someCoach", Coach.class);
		
		//Call a method on the bean
		System.out.println(coachBean.getDailyWorkout());
		
		//Close the context
		context.close();
	}

}
