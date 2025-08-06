//상속 예제 코드
public class Test 
{

	public static void main(String[] args) 
	{
//		Car car = new Car("소나타");
//		System.out.println("제조사:" + car.getCompany());
//		System.out.println("차종:" + car.getName());
		
		//Taxi taxi = new Taxi();
		//System.out.println("제조사:" + taxi.getCompany());
		//System.out.println("차종:" + taxi.getName());
		
//		Bus bus = new Bus();
//		System.out.println("제조사:" + bus.getCompany());
//		System.out.println("차종:" + bus.getName());
		/*
		Car car = new Car();
		car.Run();
		
		Taxi taxi = new Taxi();
		taxi.Run();
		
		Bus bus = new Bus();
		bus.Run();
		*/
		//상속을 통한 다형성 개념 이해
		//부모 타입에는 모든 자식 객체가 대입 가능
		int trans = 0; //교통수단 0:자가용, 1:택시, 2:버스
		Car car = null;
		switch(trans)
		{
		case 0 : car = new Car();
			break;
		case 1 : car = new Taxi();
			break;
		case 2 : car = new Bus();
			break;
		}
		car.Run();
	}

}
