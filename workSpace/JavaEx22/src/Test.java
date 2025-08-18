//싱글톤 패턴 디자인을 위한 클래스
public class Test {

	public static void main(String[] args) {

		//SingleTon s1 = new SingleTon(); 오류
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		SingleTon s3 = SingleTon.getInstance();
		
		if(s1 == s2) {
			System.out.println("s1과 s2는 같은 SingleTon 객체를 가리키고 있음.");
		}
		if(s2 == s3) {
			System.out.println("s2과 s3는 같은 SingleTon 객체를 가리키고 있음.");
		}
	}

}
