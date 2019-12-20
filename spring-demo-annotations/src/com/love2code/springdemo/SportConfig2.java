package com.love2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//We are not doing component scanning in this one, just relying on the beans manually declared
@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig2 {

	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}	
	
	@Bean
	public Coach swimCoach() {
		
	return new SwimCoach(sadFortuneService());
	}
}
