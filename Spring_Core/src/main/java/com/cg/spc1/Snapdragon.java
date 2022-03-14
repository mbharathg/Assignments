package com.cg.spc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Mobileprocessor
{
	@Autowired
	public void process()
	{
		System.out.println("world best cpu");
	}

	 
}
