import typeTest.PackageTest;

public class Test 
{

	public static void main(String[] args) 
	{
		Person hong = new Person();
//		hong.age = -100;
		
		hong.setName("홍길동");
		hong.setAge(18);
		
		System.out.println("이름: " + hong.getName());
		System.out.println("나이: " + hong.getAge());
		System.out.println("생년: " + hong.getYear());
		
		//import연습 & 생성자 호출
		PackageTest jeon = new PackageTest();
		System.out.println(jeon.name);
		jeon.name = "전우치";
		System.out.println(jeon.name);
		
		byte b = 10;
		byte y = 20;
//		byte z = (b + y);
//		System.out.println(z);
		char c = 'A';
		double d = b;
		System.out.println(d);
//		short s = c;
		int i = c;
		long l = c;
		System.out.println(l);
		String s = "A";
		
	}

}
