import java.util.*;

//콜렉션 ArrayList 연습
public class Test {

	public static void main(String[] args) {
		//String[] name = {"홍길동", "성춘향", "전우치"};
		//for(String v : name) {
		//	System.out.println(v);
		//}
		
		//2개의 클래스 변수를 각각 만들어서 사용
		Student hong = new Student("001","홍길동");
		hong.PrintInfo();
		
		Student chun = new Student("002","성춘향");
		chun.PrintInfo();
		
		//배열을 이용한 관리 방법
		Student[] s = new Student[2];
		s[0] = hong;
		s[1] = chun;
		s[0].PrintInfo();
		s[1].PrintInfo();
		
		List<String> name = new ArrayList<>();
		name.add("홍길동");
		name.add("성춘향");
		name.add("전우치");
		name.add("이순신");
		name.remove(1);
		
		for(int i = 0; i < name.size(); i++) {
			String v = name.get(i);
			System.out.println(v);
		}
		
		//향상된 for 문으로 출력
		for(String v : name) {
			System.out.println(v);
		}
		
		//ArrayList 연습 (Student 객체를 이용한 연습)
		List<Student> slist = new ArrayList<>();
		Student x = new Student("001","제임스본드");
		slist.add(x);
		x = new Student("002","마이클잭슨");
		slist.add(x);
		
		for(int i = 0; i < slist.size(); i++) {
			x = slist.get(i);
			x.PrintInfo();
		}
		System.out.println("-----------");
		
		//향상된 for 문으로 출력
		for(Student v : slist) {
			v.PrintInfo();
		}
		System.out.println("-----------");
		
		
		List<Student> student = new ArrayList<>();
		student.add(0,new Student("001","홍길동"));
		student.add(1,new Student("002","성춘향"));
		
		for(Student v : student) {
			v.PrintInfo();
		}
		
	}
}
