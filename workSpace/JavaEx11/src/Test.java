//29. 클래스(Class) 필드와 생성자 연습
public class Test 
{

	public static void main(String[] args) 
	{
		Person hong = new Person();
		System.out.println(hong.name);
		hong.name   = "홍길동";
		System.out.println(hong.name);
		System.out.println(hong.age);
		hong.age    = 16;
		System.out.println(hong.age);
		System.out.println(hong.tel);
		hong.tel    = "010-1111-2222";
		System.out.println(hong.tel);
	}

}
