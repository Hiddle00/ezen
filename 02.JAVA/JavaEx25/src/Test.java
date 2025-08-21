import java.util.*;

//콜렉션 ArrayList 연습
public class Test 
{
	public static void main(String[] args) 
	{
		//2개의 클래스 변수를 각각 만들어서 사용
		Student hong = new Student("001","홍길동");
		hong.PrintInfo();
		
		Student chun = new Student("002","성춘향");
		chun.PrintInfo();		
		
		//배열을 이용한 사용 방법
		Student []s = new Student[2];
		s[0] = hong;
		s[1] = chun;
		s[0].PrintInfo();
		s[1].PrintInfo();
	
		//ArrayList 연습( String 객체를 이용한 연습)
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("이순신");
		list.add("전우치");
		for(int i = 0 ; i < list.size(); i++)
		{
			String v = list.get(i);
			System.out.println(v);
		}
		//향상된 for 문으로 출력
		for(String v : list)
		{
			System.out.println(v);
		}
		
		//ArrayList 연습( Student 객체를 이용한 연습)
		List<Student> slist = new ArrayList<>();
		Student x = new Student("001","제임스 본드");
		slist.add(x);
		x = new Student("002","마이클 잭슨");
		slist.add(x);
		for(int i = 0 ; i < slist.size(); i++)
		{
			x = slist.get(i);
			x.PrintInfo();
		}
		//향상된 for 문으로 출력
		for(Student v : slist)
		{
			v.PrintInfo();
		}
	}
}
