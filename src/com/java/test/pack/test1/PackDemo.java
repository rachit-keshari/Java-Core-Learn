package com.java.test.pack.test1;

import com.java.test.pack.test1.Student;

public class PackDemo {

	public static void main(String[] args) {
       Student obj = new Student();
       obj.rollno=4;
       obj.marks=99; // protected are accessable in same packages
       System.out.println(obj.rollno);
       System.out.println(obj.marks);
	}
	
}
