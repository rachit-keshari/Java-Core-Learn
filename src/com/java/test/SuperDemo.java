package com.java.test;

class A
{
	public A() { System.out.println("in A"); }
	public A(int x) {
		System.out.println("in A int");
	}
}

class B extends A
{
	public B() { 
		super(); 
		System.out.println("in B"); 
	}
	
	public B(int x) {
		super(x);
		System.out.println("in B int");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B(4); // it calls the constructor of Super class too
	}
}
