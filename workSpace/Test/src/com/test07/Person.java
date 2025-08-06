package com.test07;

public class Person 
{
	private String name; //이름
	private int    age;  //나이
	
	
	public Person() {}
	public Person(String name, int age) 
	{
		this.name = name;
		this.age  = age;
	}
	
	public void introduce()
	{
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
	}
}
