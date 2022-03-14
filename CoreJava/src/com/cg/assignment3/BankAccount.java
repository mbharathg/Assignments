package com.cg.assignment3;

public class BankAccount 
{
	public static void withdraw(double withdamt, double balance)
{


		if(withdamt <= balance && withdamt > 20000)
		{
			System.out.println("Withdraw done Successfully");
			balance=balance-withdamt;

		}
		else if( withdamt < 0) 
		{
			throw new InvalidEntryException("InvalidEntry Fund RuntimeException");

		}
		else if (withdamt > balance && withdamt > 20000) 
		{
			throw new InsufficientFundsException("Insufficient Fund RuntimeException");

		}
		else if(withdamt < 20000)
		{
			throw new WithdrawLimitException("WithdrawLimitException RuntimeException");
		}


	}

	class InvalidEntryException extends RuntimeException 
	{
		public InvalidEntryException(String message) 
		{
			super(message);
		}
	}

	class InsufficientFundsException extends RuntimeException 
	{
		public InsufficientFundsException(String message) 
		{
			super(message);
		}
	}

	class WithdrawLimitException extends RuntimeException 
	{
		public WithdrawLimitException(String message)
		{
			super(message);
		}
	}
}
