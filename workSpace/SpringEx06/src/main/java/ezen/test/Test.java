package ezen.test;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ezen.di.*;

public class Test {

	public static void main(String[] args) {
		//Spring 설정 파일을 로딩한다.
		ApplicationContext context = new ClassPathXmlApplicationContext("ezen/spring/spring.xml");
		
		School school = context.getBean("school", School.class);
		school.Print();
		
		School school_jeon = context.getBean("school_jeon", School.class);
		school_jeon.Print();
		
		//getNean()을 이용하여 id="list"인 ArrayList 클래스 로딩
		ArrayList<Student> list = (ArrayList<Student>)context.getBean("list");
		for(Student v : list) {
			System.out.printf("[%s][%d][%s]\n", v.getName(), v.getAge(), v.getJob());
		}
		System.out.println("done");
	}
}
