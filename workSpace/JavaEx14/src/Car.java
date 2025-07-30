//34. 생성자 오버로딩 
public class Car 
{
	String company;  //제조사
	String name;	 //차종
	int	   inch;	 //휠크기
	
	//1번 생성자
	public Car()
	{
		System.out.println("1번 생성자가 실행됨.");
		
//		String name;
//		name = "아반떼";
		
		this.company = "현대자동차";
		this.name    = "아반떼";
		this.inch    = 15;
	}
	//2번 생성자
	public Car(int inch)
	{
		System.out.println("2번 생성자가 실행됨.");
		
		this.company = "현대자동차";
		this.name    = "아반떼";
		this.inch    = inch;
	}
	
	//Car클래스 정보를 출력하는 메소드
	public void PrintInfo()
	{
		System.out.println("차량회사" + this.company);
		System.out.println("차량이름" + this.name);
		System.out.println("바퀴크기" + this.inch);
		System.out.println("-------------------");
	}
	
}
