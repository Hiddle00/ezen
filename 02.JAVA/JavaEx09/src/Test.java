//24. Person class를 이용하여 객체 생성 예제
public class Test 
{
	public static void main(String[] args) 
	{
		//Person 클래스를 이용하여 hong이라는 객체를 생성한다.
		Person hong = new Person();
		hong.name   = "홍길동";
		hong.age    = 15;
		hong.tel    = "010-1111-1111";
		
		//Person 클래스를 이용하여 chun이라는 객체를 생성한다.		
		Person chun = new Person();
		chun.name = "성춘향";
		chun.age  = 16;
		chun.tel  = "010-7777-7777";
		
		//클래스 변수 jeon만 선언하고,
		//가리키는 객체가 없음		
		Person jeon = null;
		
		//hong이 가리키는 객체를 jeon도 가리킨다.
		jeon = hong;
		System.out.println(jeon.name);
		
		//chun이 가리키는 객체를 jeon도 가리킨다.		
		jeon = chun;
		System.out.println(jeon.name);
		
	}
}


