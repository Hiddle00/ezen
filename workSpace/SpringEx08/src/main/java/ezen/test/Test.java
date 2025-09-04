package ezen.test;

import ezen.di.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//Spring 설정 파일을 로딩한다.
		ApplicationContext context = new ClassPathXmlApplicationContext("ezen/spring/spring.xml");
		
		Student hong = context.getBean(Student.class);
		System.out.println(hong.getName());
		
		School school = context.getBean(School.class);
		school.setPerson(hong);
		school.Print();
	}
}
