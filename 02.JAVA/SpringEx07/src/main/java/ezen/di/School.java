package ezen.di;

import org.springframework.beans.factory.annotation.*;

public class School 
{
	//@Autowired 필드 주입 방식
	/*
	@Autowired
	@Qualifier("hong") //<bean id="hong"> 과 바인딩
	*/
	private Person person;
	
	public School()
	{
	}
	
	//@Autowired 생성자 주입
	@Autowired
	public School(@Qualifier("hong")Person person)
	{
		this.person = person;
	}
	
	//@Autowired 수정자(Setter) 주입
	/*
	@Autowired
	@Qualifier("hong") //<bean id="hong"> 과 바인딩
	*/	
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
