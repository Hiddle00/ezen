import java.util.*;

//콜렉션 ArrayList 연습
public class Test {

	public static void main(String[] args) {
		//String[] name = {"홍길동", "성춘향", "전우치"};
		//for(String v : name) {
		//	System.out.println(v);
		//}
		
		List<String> name = new ArrayList<>();
		name.add("홍길동");
		name.add("성춘향");
		name.add("전우치");
		name.add("이순신");
		name.remove(1);
		
		for(String v : name) {
			System.out.println(v);
		}
		
		for(int i = 0; i < name.size(); i++) {
			
		}
		
		List<Student> student = new ArrayList<>();
		student.add(0,new Student("001","홍길동"));
		student.add(1,new Student("002","성춘향"));
		
		for(Student v : student) {
			v.PrintInfo();
		}
		
	}
}
