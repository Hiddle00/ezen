package ezen.di;

public class Teacher implements Person{
	private String name = "전우치";
	private int    age  =  40;
	private String job  = "교사";

	public String getName() { return name; }
	public int    getAge()  { return age;  }
	public String getJob()  { return job;  }

}
