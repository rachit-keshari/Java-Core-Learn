package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Studentval implements Comparable<Studentval>
{
	private int rollno;
	int marks;
	private String name;
	public Studentval(int rollno,String name ,int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Studentval [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTo(Studentval s)
	{
		return name.length()>s.name.length()?1:-1;
	}
	
}

public class CollectionDemo1 {
 
	public static void main(String[] args) {
	    List<Studentval> stud= new ArrayList<>();
            	    
	    stud.add(new Studentval(12,"Ram",48));
	    stud.add(new Studentval(13,"Raju",23));
	    stud.add(new Studentval(14,"Mohan",52));
	    stud.add(new Studentval(15,"Priyanka",43));

	    Collections.sort(stud,(i,j)->i.marks>j.marks?1:-1);
	    
	    for(Studentval x:stud)
	    System.out.println(x);
	}
}












