package com.java.test;

class A1
{
	int i=9;
	public void show() {
		System.out.println("in A1");
	}
}

class B1 extends A1
{
	int i=3;
	public void show() {
		super.show();
		System.out.println("in B1 "+super.i);
	}
	public void config()
	{
		System.out.println("config");
	}
}

class C1 extends A1
{
	public void show() {
		
		System.out.println("in C1");
	}
}

public class OverridingDemo {

	//compile time & run time
	public static void main(String[] args) {
		
		A1 obj1 = new B1();
		obj1.show(); //runtime polymorphism
//		obj1.config(); we can't call sub class method with A1 obj
        
		obj1= new C1();
		obj1.show(); //Dynamic method dispatch
		
	}

}
