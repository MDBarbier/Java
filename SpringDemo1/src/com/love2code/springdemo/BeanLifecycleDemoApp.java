package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		
		/* Note that the destroy method will not get called if we set our bean scope to prototype 
		 * In that case, Spring hands over the object then washes it's hands of it*/
		
		//Load the configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		//Load the beans
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		theCoach.getDailyWorkout();
		
		context.close();
	}

}
