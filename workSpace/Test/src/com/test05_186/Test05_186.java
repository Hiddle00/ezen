package com.test05_186;
import Person;

public class Test05_186
{

	public static void main(String[] args) 
	{
		Person hong = new Person();
		hong.setName() = "È«±æµ¿";
		
		Person chun = new Person();
		chun.name = "¼ºÃáÇâ";
		
		Person[] a = null;
		a = new Person[2];
		
		a[0] = hong;
		a[1] = chun;
		
		System.out.println(hong.name);
		System.out.println(a[0].name);
	}

}
