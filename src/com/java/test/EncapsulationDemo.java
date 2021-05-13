package com.java.test;

class Student1 // Binding data with methods: Encapsulation 
{
	private int rollno;
	private String name;
	
	//Getter and Setter Methods
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
	   	
		Student1 s1 = new Student1();
		s1.setName("Mohan");
		s1.setRollno(34);
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		
	}

}
