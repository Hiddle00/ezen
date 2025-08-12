package com.test06_19;

public class Account_19 
{
	private int balance; //잔고
	final static int MIN_BALANCE = 0; //
	final static int MAX_BALANCE = 1000000;

	public int getBalance()  {  return balance;  }
	
	
	public void setBalance(int balance) 
	{
		if(balance < MIN_BALANCE || balance > MAX_BALANCE)
		{
			return;
		}
		this.balance = balance;  
	}
	
	
}
