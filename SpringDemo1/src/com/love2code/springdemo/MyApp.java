package com.love2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new HockeyCoach();
		System.out.println(theCoach.getDailyWorkout());
		
		Coach theCoach2 = new TrackCoach();
		System.out.println(theCoach2.getDailyWorkout());
	}

}
