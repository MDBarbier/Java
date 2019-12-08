package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsTestApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//Beans are singleton in scope by default
		var bean = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(bean.GetDailyWorkout());
		System.out.println(bean.GetDailyFortune());
				
		var bean2 = context.getBean("hockeyCoach", Coach.class);
		
		System.out.println(bean2.GetDailyWorkout());
		System.out.println(bean2.GetDailyFortune());
		
		context.close();

	}

}
