package ezen.di;

import org.springframework.stereotype.*;

//@Component = @Controller = @Service = @Repository 는 동일한 선언임.
@Service
public class School 
{
	private Person person;
	
	public School()
	{
	}
	
	public School(Person person)
	{
		this.person = person;
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
