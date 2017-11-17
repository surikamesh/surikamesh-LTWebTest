package com.LT;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class UserDao {

	public static Map<String, String> locDetails = new HashMap<String, String>();
	
	public static String getUserId(){
		
		return Calendar.getInstance().get(Calendar.HOUR_OF_DAY) + String.valueOf(Calendar.getInstance().get(Calendar.MINUTE));
	
	}

}