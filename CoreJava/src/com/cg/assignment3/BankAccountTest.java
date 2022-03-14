package com.cg.assignment3;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import javax.activity.InvalidActivityException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.cg.assignment3.BankAccount.InsufficientFundsException;
class BankAccountTest 
{

	int i;
	double bal1[]= {55000.0,100000.0,25000.0,55000.0,85000.0};
	double bal2[]= {20000.0,18000.0,19000.0,17500.0,19900.0};



	(doubles = {10000, 17300, 15000,18999,19999})  
	void testdrawLimitExpectedException(double w)
	{

		for(i=0;i<bal1.length;i++) 
		{

			assertThrows(WithdrawLimitException.class,()->BankAccount.withdraw(w,bal1[i]));
		}		
	


	(doubles = {21000, 30000, 50000, 39000,85000,60000})  
	void testInsuffExpectedException(double w) 
	{

		for(i=0;i<bal2.length;i++)
		{

			assertThrows(InsufficientFundsException.class,()->BankAccount.withdraw(w,bal2[i]));
			
		}

	

	(doubles = {-10000, -17300, -15000,-18999,-99,-19999,-900}) 
	void InvalidEntryException(double w)
	{

		for(i=0;i<bal1.length;i++)
		{
			 
			assertThrows(InvalidActivityException.class,()->BankAccount.withdraw(w,bal1[i]));
			assertThrows(InvalidActivityException.class,()->BankAccount.withdraw(w,bal2[i]));
		}		
	}

}
