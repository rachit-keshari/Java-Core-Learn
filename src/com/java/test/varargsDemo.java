package com.java.test;

class Calc
{
	public int add(int...n) //{1,5,6,7} varargs
	{ 
		int sum=0;
		for(int a:n)
			sum+=a;
		return sum;
	}
	
}

public class varargsDemo {	

	public static void main(String[] args) {
		Calc c=new Calc();
		System.out.println(c.add(1,5,6,7));
		System.out.println(c.add(10,10,10,10,10,10));
		System.out.println(c.add(1,5));

	}

}
