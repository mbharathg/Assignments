package com.cfg;

public class Employee 
{
	
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private int s;
	public Employee(int Id,String FirstName,String LastName,int Salary)
	{
		id=Id;
		firstName=FirstName;
		lastName=LastName;
		salary=Salary;
	}
	public int getId()
	{
		return id;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getName()
	{
		return lastName+""+firstName;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int s)
	{
		salary=s;
	}
	public int getAnnualSalary()
	{
		return salary*12;
	}
	public int raiseSalary(int percent)
	{
		salary=salary*12*percent/100-100;
		return salary;
	}
	public String toString()
	{
		return "Employee[id="+id+",name="+firstName+lastName+",salary="+salary+"]";
	}
    
	public static void main(String[] args)
	{
		Employee e=new Employee(1,"Bharath","V",100);
		 
		e.setSalary(100);
		System.out.println("Salary is:"+e.getSalary());
		System.out.println("Annual Salary is:"+e.getAnnualSalary());
		System.out.println("Raise is :"+e.raiseSalary(10));
	}
}
