/* *************************************************** 
 * 스프링을 활용한 DI 연습하기
 * 설정파일에 property 설정 연습
 *************************************************** */
package ezen.test;

import ezen.di.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ezen/spring/spring.xml");
//		Car c = (Car)context.getBean("sonata");
//		c.Print();
		
		Person hong = (Person)context.getBean("hong");
		System.out.println(hong.getName());
		
		Person jeon = (Person)context.getBean("jeon");
		System.out.println(jeon.getName());
		
		//getBean을 이용해서 School 클래스 로딩
//		School school = (School)context.getBean("school");
		School school = context.getBean("school", School.class); //형변환
		school.Print();
		
		school = context.getBean("school_jeon", School.class);
		school.Print();
	}

}
