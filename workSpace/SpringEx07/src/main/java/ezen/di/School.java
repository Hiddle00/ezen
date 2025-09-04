package ezen.di;

import org.springframework.beans.factory.annotation.*;

public class School {
	//@xml에서 id="hong"을 찾아 연결
	/*
	@Autowired
	@Qualifier("lee")  //<bean id="lee">과 바인딩
	*/
	private Person person;
	@Autowired
	public School(@Qualifier("lee") Person person, @Qualifier("chun") Person ppp) {
		this.person = person;
	}
	
	/*
	@Autowired
	@Qualifier("hong")  //<bean id="hong">과 바인딩
	*/
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void Print() {
		System.out.println("이름 : " + this.person.getName());
		System.out.println("나이 : " + this.person.getAge());
		System.out.println("직업 : " + this.person.getJob());
		System.out.println("=================================");
	}
}

