package com.cg.SAOP.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class Myaspect 
{
	//adviser
	@Before("execution(* com.cg.SAOP.services.PaymentServiceImpl.makePayment())")
	public void printBefore() 
	{
		System.out.println("Payment Started");
	}
	
	@After("execution(* com.cg.SAOP.services.PaymentServiceImpl.makePayment())")
	public void printAfter() 
	{
		System.out.println("Payment Done");
	}
	
}
