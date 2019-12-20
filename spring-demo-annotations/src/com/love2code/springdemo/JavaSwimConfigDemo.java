package com.love2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaSwimConfigDemo {

	public static void main(String[] args) {

		//We are using entirely Java to configure spring, no XML at all is involved in this app
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig2.class);
				
		//Beans are singleton in scope by default
		var bean = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(bean.GetDailyWorkout());
		System.out.println(bean.GetDailyFortune());		
		System.out.println(bean.getEmail());
		System.out.println(bean.getTeam());
				
		context.close();

	}

}
