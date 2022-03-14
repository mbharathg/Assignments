 package com.cg.work;
 public class Employee
 {
	private int empid;
	private String name;
	private String ssn;
	private double salary;
	public Employee(int i,String n,String ss,double s)
	{
		empid=i;
		name=n;
		ssn=ss;
		salary=s;
	}
	public int getEmpid()
	{
		return empid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getSsn()
	{
		return ssn;
	}
	public double getSalary()
	{
		return salary;
	}
	public void raiseSalary(double increase)
	{
		increase=2*salary;
	}
 }