package com.test07;

public class Student extends Person
{
	private String studentId; //�й�
	
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
		System.out.println("���θ� �����մϴ�.");
	}
}
