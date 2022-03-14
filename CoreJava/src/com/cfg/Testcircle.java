package com.cfg;

public class Testcircle 
{
	public static void main(String[] args)
	{
		circle c1=new circle(2.0,"blue");
		System.out.println("Radius is"+c1.getradius());
		System.out.println("Area is"+c1.getarea());
		System.out.println("Color is"+c1.getcolor());
		System.out.println("-----------------------------");
		circle c2=new circle(2.0,"red");
		System.out.println("Radius is"+c2.getradius());
		System.out.println("Color is"+c2.getcolor());
		System.out.println("Area is"+c2.getarea());
		System.out.println("-----------------------------");
		circle c3=new circle();
		System.out.println("Radius is"+c3.getradius());
		System.out.println("Color is"+c3.getcolor());
		System.out.println("Area is"+c3.getarea());
		
	}
}
