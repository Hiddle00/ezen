//27. 자동차와 타이어 정보 표현을 위한 class
public class Test 
{
	public static void main(String[] args)
	{
		//Tire 객체를 생성한다.
		Tire tire = new Tire();
		tire.production = "넥센타이어";
		tire.inch       = 21;
		
		//Car 객체를 생성한다.
		Car sonata = new Car();
		sonata.company  = "현대자동차";
		sonata.model    = "소나타";
		sonata.color    = "흰색";
		sonata.maxSpeed = 200;
		sonata.tire     = tire;
		
		Car mornig = new Car();
		mornig.company  = "현대자동차";
		
		
		System.out.println(sonata.tire.production);
		
		
		
	}
}
