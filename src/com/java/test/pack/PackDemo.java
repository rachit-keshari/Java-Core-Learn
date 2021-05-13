package com.java.test.pack;

import com.java.test.pack.test1.Student;

public class PackDemo {

	public static void main(String[] args) {
       Student obj = new Student();
       obj.rollno=4;
       
//       obj.marks=99; protected are not accessable in different packages
       System.out.println(obj.rollno);
       
	}
	
}
