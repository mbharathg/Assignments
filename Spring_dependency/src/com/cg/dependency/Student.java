package com.cg.dependency;

public class Student 
{
	private int id;
	private String name;
 
	public Student(int id, String name) 
	{
		
		this.id = id;
		this.name = name;
	}

	public void displayInfo()
	{
		System.out.println("Name is:"+name);
		System.out.println("Id is:"+id);
	}
}
