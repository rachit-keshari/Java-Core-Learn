package com.java.test;

public class ExceptionDemo1 {
     public static void main(String[] args) {
    	
    	 try {
 			int i=7;
 			int j=9;
 			int k=i/j;
 			if(k==0)
 				throw new RachitException("The value got 0....");
 			System.out.println("o/p is: "+k);
 			 
 		} catch(RachitException e) { 
 			
 			System.err.println("Error: "+e.getMessage());
 		
 		} catch(Exception e) { 
 			
 			System.err.println("Error: "+e.getMessage());
 		}
 		finally {
 			System.out.println("Exception Handled successfully");
 		}
 		
 		
	}
}

