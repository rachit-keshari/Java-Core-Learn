package com.java.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class CollectionDemo {

	public static void main(String[] args) {
		
		List<Integer> val = new ArrayList<>(); //1.7 //Mutable(we can change the values)
		val.add(40); 
		val.add(63);
		val.add(92);
		val.add(2,27); 
		
//		Comparator<Integer> c=(x,y)->x%10>y%10?1:-1;    //can also do this with lambda function
		
		Comparator<Integer> c=new Comparator<Integer>() {
			public int compare(Integer x,Integer y)
			{
				if(x%10>y%10)
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(val,c);
//		Collections.reverse(val);
//		Collections.shuffle(val);
		
		
		
		System.out.println(val);
		
//		Iterator it = val.iterator();
//		
//		while(it.hasNext())
//		System.out.println(it.next());
		
		for(int i=0;i<val.size();i++)
			System.out.println(val.get(i));
		
		for(Object o:val)
			System.out.println(o);
		
//		for(Integer x:val)
//			System.out.println(x);
	}
}
