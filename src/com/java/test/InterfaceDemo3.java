package com.java.test;


interface Demo1
{
	int num=8;//we can create variables in interface but they are constants(final)
	void abc();
	default void show() {     //we can define methods in Interface Java 8
 		System.out.println("in Demo Show");  //default keyword to define methods
	}
	static void disp() {     //we can make static methods in Interface Java 8
 		System.out.println("Hello");  //with static keyword
	}
}

interface MyDemo1
{
	default void show() {     
 		System.out.println("in MyDemo Show"); 
    }
}

class DemoImpl1 implements Demo1,MyDemo1
{
	@Override
	public void abc() {
       System.out.println("in abc");	
       
	}

	@Override
	public void show() {
	   Demo1.super.show();
	}
}

public class InterfaceDemo3 {

	public static void main(String[] args) {
		
        Demo1 obj = new DemoImpl1();
        obj.show();
        Demo1.disp(); // can access static methods using Interface name
        System.out.println(Demo1.num);        
	}

}
