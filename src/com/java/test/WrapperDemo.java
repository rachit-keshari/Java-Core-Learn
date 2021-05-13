package com.java.test;
import java.lang.*;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int i=5;                    // Primitive datatype
		Integer i1=new Integer(i);  // Boxing -Wrapper 
		int j=i1.intValue();        //unboxing- Wrapper
		
		Integer i2=6; // Autoboxing, autowrapping
		int k=i2;     // Autounboxing, autounwrapping
		
		String str = "123";
		int n = Integer.parseInt(str);
		System.out.println(n);
		
		
        
	}

}
