package com.java.test;


class A2{
	
	final float pi=3.14f; //constant
	public void show()
	{
		System.out.println("in show A");
	}
}

class B2 extends A2
{
	public void show()
	{
		System.out.println("in show B");
	}
	
}

public class FinalDemo {

	public static void main(String[] args) {
	    
		A2 obj=new A2();
        System.out.println(obj.pi);
	}

}
