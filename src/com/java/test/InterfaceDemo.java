package com.java.test;

/*Types of interfaces
 * 
 * 1)Normal Interface
 * 2)Single Abstract Method(SAM)--> Functional Interface from Java 8
 *                              --> Lambda Expression - Scala
 * 3)Marker Interface-->eg Serializable()
 * 
 * */

interface Writer{
      void show();
      void display();
}

class Pen implements Writer{
	@Override
	public void show() {
		System.out.println("I am a Pen");
	}
  
	@Override
	public void display() {
		
	}
}

class Pencil implements Writer{
	@Override
	public void show() {
		System.out.println("I am a Pencil");
	}

	@Override
	public void display() {
		
	}
}

class Kit{
	
	public void show(Writer w) {
		w.show();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
           
		Kit k=new Kit();
		Writer p=new Pen();       //we can create reference of interface 
		Writer pc=new Pencil();   // and can store objects in them
		
		k.show(pc);
		k.show(p);
   
	}

}
