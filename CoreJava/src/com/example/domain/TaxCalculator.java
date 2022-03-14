package com.example.domain;
 
public class TaxCalculator 
{
	public static void calculateTax(double t)
	{
		boolean bt=true;
		if(t>=100000&&bt)
		{
			System.out.println("tax amount is:"+t*8/100);
		}	
		else if(t>=50000||t<=100000&&bt)
		{
		System.out.println("tax amount is:"+t*6/100);
		}
		else if(t>=30000||t<=50000&&bt)
			{
			System.out.println("tax amount is:"+t*5/100);
			}
		else if(t>=10000||t<=30000&&bt)
			{System.out.println("tax amount is:"+t*4/100);
			
			}
		else
			{
				System.out.println("Tax Not Eligible Exception");
			}
		
		
	}
	public static void main(String[] args)
	{
	String empname="Bharath";
	double empSal=10000;
	boolean isIndian=true;
	if(isIndian!=true)
		System.out.println("Country not valid Exception");
	else
	 calculateTax(empSal);
	}
	
}
