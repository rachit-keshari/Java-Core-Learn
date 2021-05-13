package com.java.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String,String> mp=new HashMap<>();
//		Map<String,String> mp=new Hashtable<>(); 
		
		/* we can also use Hashtable, it is Synchronized for thread safty */
		
		mp.put("name", "Raju");
		mp.put("actor","Amir");
		mp.put("ceo","Rajni");
		mp.put("actor","Akshya");
		
		Set<String> keys = mp.keySet();
		
		for(String str:keys)
		System.out.println(str+" = "+mp.get(str));
		
	}
}
