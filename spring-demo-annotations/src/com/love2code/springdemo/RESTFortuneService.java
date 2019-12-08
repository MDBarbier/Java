package com.love2code.springdemo;

import org.springframework.stereotype.Component;

/* Note regarding default bean names
 * 
 * Spring changes the first letter to lower case i.e. RandomFortuneService -> randomFortuneService
 * 
 * However, if more than the first letter is a capital is does not change it.
 * 
 * So this class would be RESTFortuneService * 
 * 
 * */

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String GetFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
