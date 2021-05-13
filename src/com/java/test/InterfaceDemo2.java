package com.java.test;

/*Types of interfaces
 * 
 * 1)Normal Interface
 * 2)Single Abstract Method(SAM)--> Functional Interface from Java 8
 *                              --> Lambda Expression - Scala
 * 3)Marker Interface-->eg Serializable()
 * 
 * */

@FunctionalInterface
interface Abc{
	void show();
}

// Abstract class -> Define and Declare
// Interface -> declare -> 1.7
// 1.8 define methods in Interface

@FunctionalInterface
interface Demo
{
	void abc();
	default void show() {     //we can define methods in Interface Java 8
 		System.out.println("in Show");  //default keyword to define methods
	}
}

class DemoImpl implements Demo
{
	@Override
	public void abc() {
       System.out.println("in abc");		
	}	
	
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
	    
		Abc obj =()->{ System.out.println("I am the best");  };
        obj.show();
        
        Demo obj1 = new DemoImpl();
        obj1.abc();
        obj1.show();   
	}
}
