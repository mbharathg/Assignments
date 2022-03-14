package com.cg.spc1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.cg.spc1")
public class Appconfig
{
	@Bean
	public Samsung getphone()
	{
		return new Samsung();
	}
	@Bean
	public  Mobileprocessor getProcess()
	{
		return new Snapdragon();
	}
	
}
