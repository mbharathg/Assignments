package com.cg.spc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main(String[] args)
	{
		ApplicationContext factory=new AnnotationConfigApplicationContext(Appconfig.class);
		Samsung s10=factory.getBean(Samsung.class);
		s10.process();
	}
}
