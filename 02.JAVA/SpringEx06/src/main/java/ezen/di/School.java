package ezen.di;

public class School 
{
	private Person person;
	
	public School()
	{
	}
	
	public void setPerson(Person person)
	{
		this.person = person;
	}
	
	public void Print()
	{
		System.out.println("이름 : " + this.person.getName());
		System.out.println("나이 : " + this.person.getAge());
		System.out.println("직업 : " + this.person.getJob());
		System.out.println("==================================");
	}	
}
