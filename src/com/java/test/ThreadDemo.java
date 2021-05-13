package com.java.test;

class Hi implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi "+ Thread.currentThread().getPriority());
		    try{Thread.sleep(500);} catch(Exception e) {}
		}
	}
}

class Hello implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello "+ Thread.currentThread().getPriority());
		    try{Thread.sleep(500);} catch(Exception e) {}
		}
	}
}


public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
          Runnable obj1=new Hi();
          Runnable obj2=new Hello();
          
          Thread t1=new Thread(obj1);
          Thread t2=new Thread(obj2);
          Thread t3=new Thread(()->{ //Lambda Expression Anonymous class
        	  for(int i=0;i<5;i++) { 
        		  System.out.println("abc "+ Thread.currentThread().getPriority());
        		  try{Thread.sleep(500);} catch(Exception e) {}
        		  }
          },"abc Thread");
          
          System.out.println(t1.getName());
          System.out.println(t2.getName());
          t1.setName("Hi Thread");
          t2.setName("Hello Thread");
         
          System.err.println("t1= "+t1.getName()+" t2= "+t2.getName()+" t3= "+t3.getName());
          System.out.println(t1.getPriority());
          System.out.println(t2.getPriority());
          t1.setPriority(Thread.MIN_PRIORITY);  // val of 1
          t2.setPriority(Thread.NORM_PRIORITY); // val of 5
          t3.setPriority(Thread.MAX_PRIORITY);  // val of 10
          
          
          t1.start();
          try{Thread.sleep(10);} catch(Exception e) {}
          t2.start();
          try{Thread.sleep(10);} catch(Exception e) {}
          t3.start();
          
          t1.join();
          
          System.out.println(t1.isAlive());
          System.out.println("Bye");
  	}
}
