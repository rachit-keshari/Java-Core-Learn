package com.java.test;

public class StaticDemo {
    private String name;
    private int salary;
    private int eid;
    public static String ceo;
	
    static
    {
       ceo="Nikita";
       System.out.println("in Static");
    }
    
    public StaticDemo() {
    	name="Default";
    	salary=1000;
    	eid=50;
    }
    
    public StaticDemo(String name, int salary, int eid) {
		super();
		this.name = name;
		this.salary = salary;
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", eid=" + eid +", ceo=" + ceo + "]";
	}
    
    
    
    
}
