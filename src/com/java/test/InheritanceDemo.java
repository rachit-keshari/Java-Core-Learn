package com.java.test;

class Calculator  //Java:Super, OOPs:Parent , C++:Base
{
	public int add(int x,int y)
	{ return x+y; }
}


class CalcAdv extends Calculator //Java:Sub, OOPs:Child, C++:Derived //IS-A
{
	public int sub(int x,int y)
	{ return x-y; }
	
}

class VeryCalcAdv extends CalcAdv //multilevel inheritance 
{
	public int mul(int x,int y)
	{ return x*y; }
	
}

public class InheritanceDemo {   //HAS-A

	public static void main(String[] args) {
		
		VeryCalcAdv c1=new VeryCalcAdv();
		int ans1 =c1.add(6,4);
		int ans2 =c1.sub(6,4);
		int ans3 =c1.mul(6,4);
		
		
		System.out.println("ans1= "+ans1);
		System.out.println("ans2= "+ans2);
		System.out.println("ans3= "+ans3);
	}

}
