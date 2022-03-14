package com.cg.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Account_Test {
	Account a=new Account(101,"Bharath",12023);
	Account b=new Account(102,"Mahesh");

	@Test
	public void testGetId() 
	{
		 assertEquals(a.getId(),101);
	}
	@Test
	public void testGetName() 
	{
		 assertEquals(a.getName(),"Bharath");
	}
	@Test
	public void testGetName1() 
	{
		 assertEquals(b.getName(),"Mahesh");
	}
	@Test
	public void testGetSalary() 
	{
		 assertEquals(a.getSalary(),12023);
	}

}
