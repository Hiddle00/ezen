package com.test06_20;
import java.util.Scanner;

public class BankApplication 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String[] Account = new String[100];
		Account account = new Account();
		
		
		account.menu();
		int value = scanner.nextInt();
		switch(value) 
		{
		case 1 : account.createNew();
			break;
		}
	}

}
