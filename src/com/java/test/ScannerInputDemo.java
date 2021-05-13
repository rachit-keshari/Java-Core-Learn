package com.java.test;

import java.util.Scanner;

public class ScannerInputDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		byte b = sc.nextByte();
		short s = sc.nextShort();
		int n = sc.nextInt();
		long l =sc.nextLong();
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		sc.nextLine();
		String str = sc.nextLine();
	
		System.out.println("b= "+b);
		System.out.println("s= "+s);
		System.out.println("n= "+n);
		System.out.println("l= "+l);
		System.out.println("f= "+f);
		System.out.println("d= "+d);
		System.out.println("Str= "+str);
	}

}
