package ezen.di;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

//@Component = @Controller = @Service = @Repository 는 동일한 선언임.
@Component
public class Student implements Person{
	private String name;
	private int    age;
	private String job;
	
	@Autowired
	@Value("홍길동")
	public void setName(String name) {	this.name = name; }
	@Autowired
	@Value("20")
	public void setAge(int age)		 {	this.age  = age;  }
	@Autowired
	@Value("학생")
	public void setJob(String job)   {	this.job  = job;  }
	
	public String getName() { return name; }
	public int    getAge()  { return age;  }
	public String getJob()  { return job;  }

}
