package com.java.test;

public class Student {
	
	public static int P=94;
	private int x;
	private int y;
	
	public static void fun() {
		System.out.println("you are going to inc p:"+P);
		P++;
	}

	public int add(int a,int b,int c)
	{
	    return a+b+c;	
	}
	
	public Student(int x, int y) {
		super();
		this.x = x;//current object
		this.y = y;//current object
	}
	
	public Student()
	{
		super();
		this.x=5;
		this.y=5;
	}

	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + "]";
	}
}
