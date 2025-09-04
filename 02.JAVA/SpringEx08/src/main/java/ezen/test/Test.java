package ezen.test;

import ezen.di.*;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		//Spring 설정 파일을 로딩한다.
		ApplicationContext context = new ClassPathXmlApplicationContext("ezen/spring/spring.xml");
		
		//각 클래스에 @Component 가 선언되었으므로 스프링 설정에서 bean 설정 필요 없음
		Student hong = context.getBean(Student.class);
		System.out.println(hong.getName());
		
		School school = context.getBean(School.class);
		school.setPerson(hong);
		school.Print();
		
		System.out.println("done...");		
	}
}
