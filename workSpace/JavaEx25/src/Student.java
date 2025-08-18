//학생 정보 클래스
public class Student 
{
	private String hakbun; //학번
	private String name;   //이름
	
	public Student(String hakbun,String name)
	{
		this.hakbun = hakbun;
		this.name   = name;
	}
	
	//학생 정보를 출력한다.
	public void PrintInfo()
	{
		System.out.println("학번:" + hakbun);
		System.out.println("이름:" + name);
	}
}
