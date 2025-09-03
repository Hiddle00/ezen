/* *************************************************** 
 * 스프링을 활용한 DI 연습하기
 *************************************************** */

package ezen.test;

import ezen.di.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// Spring 설정 파일을 로딩한다.
		ApplicationContext context = new ClassPathXmlApplicationContext("ezen/spring/spring.xml");
//		Person hong = (Person)context.getBean("hong");
//		System.out.println(hong.getName());
		
		//getBean()을 이용하여 id="school" 로딩
		School school = (School)context.getBean("school");
		school.Print();
		
		//getBean()을 이용하여 School 클래스를 로딩
		school = (School)context.getBean(School.class);
		school.Print();
		
		//getBean()을 이용하여 id="school_jeon" 로딩
		school = (School)context.getBean("school_jeon");
		school.Print();
	}

}
