package ezen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ezen.di.School;
import ezen.di.Student;
import ezen.di.Teacher;


//xml없이 bean등록하기
@Configuration
public class Config {
	
	@Bean(name = "hong")
	public Student student() {
		Student s = new Student();
		return s;
	}
	
	@Bean(name = "jeon")
	public Teacher teacher() {
		return new Teacher();
	}
	
	@Bean(name = "school")
	public School school() {
		School s = new School();
		s.setPerson(student());
		return s;
	}
}
