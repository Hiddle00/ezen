
public class Test 
{

	public static void main(String[] args) 
	{
		Car car = new Car();
		car.Run();
		
		Tire tire = new Tire();
//		tire.Roll();
//		
//		tire = new NexenTire();
//		tire.Roll();
//		
//		tire = new HanKukTire();
//		tire.Roll();
		
		System.out.println("--------------");
		
		tire = null;
		tire = new NexenTire();
		car.setTire(tire);
		//car.setTire(new NexenTire());
		car.Run();
		
		tire = new HanKukTire();
		car.setTire(tire);
		//car.setTire(new HanKukTire());
		car.Run();
	}

}
