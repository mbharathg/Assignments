package com.cg.SAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.SAOP.services.PaymentService;
public class App
{
	public static void main( String[] args )
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cg/SAOP/config.xml");
		PaymentService payment = context.getBean("payment", PaymentService.class);
		//Auto, print:PaymentStarted
		payment.makePayment();
	}
}	
	