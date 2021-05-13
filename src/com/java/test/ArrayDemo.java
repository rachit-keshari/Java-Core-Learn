package com.java.test;

public class ArrayDemo {
    
	public static void main(String[] args) {
		
       int num[]= new int[4];
       String str[]=new String[10];
       
       char ch='A';
       for(int i=0;i<4;i++) {
    	   num[i]=i+1;
    	   str[i]=Character.toString(ch);
           ch++;
       }
    	   
       for( int i=0;i<4;i++) {
    	   System.out.println(num[i] + str[i]);
       }
       
       int d[][]= {
    		   {1,2,3,4},         //jagged array
    		   {5,6},
    		   {7,8,9,10,11,13,14},
       };
       
       for(int i=0;i<d.length;i++)   //jagged array traversal
       {
    	   for(int j=0;j<d[i].length;j++)
    	   {
    		  System.out.print(d[i][j]+" ");   
    	   }
    	   System.out.println();
       }
       
       for(int k[]:d)   //enhanced for loop (for each loop) for jagged array 
       {
    	   for(int m:k)
    	   System.out.print(m+" ");
    	   System.out.println();
       }
       
	}
}

