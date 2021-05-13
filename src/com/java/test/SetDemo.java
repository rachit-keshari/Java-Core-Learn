package com.java.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	
	public static void main(String[] args) {
		
//		Set<Integer> val = new HashSet<>();
		Set<Integer> val = new HashSet<>();
		val.add(34);
		val.add(23);
		val.add(78);
		System.out.println(val.add(97));
		
		for(int x:val)
			System.out.println(x);
	}
}
