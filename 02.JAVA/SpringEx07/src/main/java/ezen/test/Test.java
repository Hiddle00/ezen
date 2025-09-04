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
		
		//getBean()을 이용하여 School 클래스 로딩
		School school = context.getBean("school",School.class);
		school.Print();	
		
		
		System.out.println("done...");		
	}
}
