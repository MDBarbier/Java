package com.love2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {

		//We are using entirely Java to configure spring, no XML at all is involved in this app
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
				
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
