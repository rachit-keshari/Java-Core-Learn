package com.java.test.pack.test1;

public class Student {

	int age =27;            //by default private
	public int rollno=7;   // can be accesses any were
	private String name="Ramu"; // can only be accessed with in the class
	protected int marks =90; // can be accessed with in same package
	                         // or in another package provided as sub class 
}
