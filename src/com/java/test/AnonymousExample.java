package com.java.test;

interface Cake
{
	void showPrice();
}

class A3
{
	public void show()
	{
		System.out.println("in A3 show");
	}
}


public class AnonymousExample {

	public static void main(String[] args) {
		
	 A3 obj = new A3() {           // Anonymous class with no name 
		                           // for one time use
		 public void show() {          
				System.out.println("I'm the best");
			}	 
	 };
	 obj.show();

	 Cake ck=new Cake() {     // Anonymous class with interface 
                                // for one time use
		 int p=500;
		 public void showPrice()
		 {
			 System.out.println("the price of cake is: "+p);
		 }
	 };
	 ck.showPrice();
	}
	

}
