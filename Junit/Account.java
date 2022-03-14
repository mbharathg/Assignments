package com.cg.Junit;

public class Account
{
private int id;
private String name;
private double salary;
public Account(int id,String name,double salary)
{
	this.id=id;
	this.name=name;
	this.salary=salary;
}
public  Account(int id,String name)
{
	this.id=id;
	this.name=name;
}
 public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String toString1() 
{
	return "Account [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
public String toString() 
{
	return "Account [id=" + id + ", name=" + name + "]";
}
  

}
