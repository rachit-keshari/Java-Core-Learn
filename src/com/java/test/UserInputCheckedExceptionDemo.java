package com.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//BufferedReader
//Scanner

public class UserInputCheckedExceptionDemo {

	public static void main(String[] args) throws Exception {
		
		int n = 0;
		System.out.println("Enter a no :");
		BufferedReader br = null;
		
		try {
		br=new BufferedReader(new InputStreamReader(System.in));
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
		n = Integer.parseInt(br.readLine());
		
		}
		catch(Exception e) {
		     System.out.println(e.fillInStackTrace());	
		}
		finally
		{
			br.close();
			System.out.println("closed");
		}
		
		//or can simply use try with resource which will close the resource
		/*try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
		        n = Integer.parseInt(br.readLine()); 
		  }
		 */
		
		
		System.out.println( "n= "+n);
		
	}
}
