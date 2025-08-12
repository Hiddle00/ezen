package com.test07;

public class Student extends Person
{
	private String studentId; //학번
	
	public Student()
	{
		super();
	}
	
	public Student(String name, int age, String studentId)
	{
		super(name, age);
		this.studentId = studentId;
	}
	
	public void study()
	{
		System.out.println("공부를 시작합니다.");
	}
}
