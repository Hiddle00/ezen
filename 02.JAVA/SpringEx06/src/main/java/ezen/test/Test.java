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
			
		//getBean()을 이용하여 id="school_jeon" 인 School 클래스 로딩
		school = context.getBean("school_jeon",School.class);
		school.Print();
		
		//getBean()을 이용하여 id="list" 인 ArrayList 클래스 로딩
		ArrayList<Student> list = (ArrayList<Student>)context.getBean("list");
		for(Student s : list)
		{
			System.out.printf("[%s][%d][%s]\n",
					s.getName(),s.getAge(),s.getJob());
		}
		 
		System.out.println("done...");		
	}
}
