package com.java.test;

/*Inner class
 *   member class eg Inner1
 *   static class eg Inner2
 *   anonymous class
 * 
 * */

class Outer //Outer.class
{
	static int a;
	public void show() {
		System.out.println("in show");
	}
	
	class Inner1 //Outer$Inner.class //member class
	{
		public void display() {
			System.out.println("in display of Inner1");
		}
	}
	
	static class Inner2 //Outer$Inner.class //static class
	{
		public void display() {
			System.out.println("in display of Inner2");
		}
	}
	
	
}

public class InnerDemo {  //InnerDemo.class

	//variable, method, class
	
	public static void main(String[] args) {
		
		Outer obj=new Outer();
		obj.show();
        
		Outer.Inner1 obj1=obj.new Inner1(); //creating obj of Inner1
		obj1.display();
		
        Outer.Inner2 obj2=new Outer.Inner2();//creating obj of Inner2
        obj2.display();

	}
}
