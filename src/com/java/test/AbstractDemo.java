package com.java.test;

abstract class Human
{
	public abstract void eat();
	public void walk() {
		System.out.println("Walking.../\\../\\..");
	}
}

class Man extends Human 
{
	public void eat() {
		System.out.println("I am eating.");
	}
}

class Printer
{
	public void show(Number i) //Number is a abstract class implemented
	{                           // by both Integer & Double Wrapper classes
		System.out.println( "Value: "+i);
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
	
		Human obj=new Man();
		obj.walk();
		obj.eat();
		
		System.out.println();
		Printer p1 = new Printer();
		p1.show(54);
		p1.show(54.786);
	}

}
