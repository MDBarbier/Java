package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAnnotationsDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//hockeyCoach is set to prototype
		var bean = context.getBean("hockeyCoach", Coach.class);		
		var bean2 = context.getBean("hockeyCoach", Coach.class);
		
		//tennis coach does not have a scope specified so the default singleton scope applies
		var bean3 = context.getBean("tennisCoach", Coach.class);
		var bean4 = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (bean == bean2);
		
		System.out.println("Pointing to the same object? " + result);
		System.out.println("Memory location for bean: " + bean);
		System.out.println("Memory location for bean2: " + bean2);
		
		boolean result2 = (bean3 == bean4);
		
		System.out.println("Pointing to the same object? " + result2);
		System.out.println("Memory location for bean3: " + bean3);
		System.out.println("Memory location for bean4: " + bean4);
		
		context.close();

	}
}
