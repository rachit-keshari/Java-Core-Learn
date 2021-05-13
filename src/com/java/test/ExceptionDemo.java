package com.java.test;



public class ExceptionDemo {

	public static void main(String[] args) {
         
		try {
		    
			int a=(Integer) null;
			int o[] = new int[6];
			o[4] = 8;
			int i=7;
			int j=0;
			int k=i/j;
			System.out.println("o/p is: "+k);
			
			// multiple catch introduces in 1.7 
		} catch(ArithmeticException e) { 
			
			System.err.println("Cannot divide by zero....");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Stay in your limit.....");
		} catch(Exception e) {
		     System.err.println("Somthing went wrong....");	
		}
		finally // always exicute code no matter error occure
		{
			System.out.println("Bye");
		}
		
		
 	}

}
