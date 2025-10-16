package ezen.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ezen.config.Config;
import ezen.di.School;

public class Test2 {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		School school = (School)context.getBean("school");
		school.Print();
		
	}
}
