//28. 클래스(Class) 필드와 생성자 연습
//개인정보 <- 이름, 나이, 전화번호
public class Person 
{
	//클래스 필드(속성) 선언
	String name;  //이름
	int    age;   //나이
	String tel;   //전화번호
	
	public Person()
	{
		System.out.println("Person 생성자가 실행되었습니다." );
		name = "아무개";
		age  = 1;
		tel  = "없음";
	}
}
