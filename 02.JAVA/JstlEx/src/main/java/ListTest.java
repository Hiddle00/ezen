import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		//길이 3
		//인덱스 0 ~ 2
		String a = l.get(0);
		String b = l.get(1);
		String c = l.get(2);
		
		for(int i = 0; i < 3; i++) {
			//i변수가 가질 수 있는 값 : 0, 1, 2
			//l리스트가 가질 수 있는 인덱스 : 0, 1, 2
			l.get(i);
		}
		
		for(String v : l) {
			System.out.println(v);
		}
	}

}
