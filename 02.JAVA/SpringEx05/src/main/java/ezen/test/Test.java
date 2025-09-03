/* *************************************************
 스프링을 활용한 DI 연습하기
 설정파일에 property 설정 연습
************************************************* */
package ezen.test;

import ezen.di.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		//Spring 설정 파일을 로딩한다.
		ApplicationContext context = new ClassPathXmlApplicationContext("ezen/spring/spring.xml");

		//getBean()을 이용해서 School 클래스 로딩
		//School school = (School)context.getBean("school");
		School school = context.getBean("school",School.class);
		school.Print();
		
		//getBean()을 이용하여 id="school_jeon" 인 School 클래스 로딩
		school = context.getBean("school_jeon",School.class);
		school.Print();
		
		System.out.println("done...");
		
	}
}
