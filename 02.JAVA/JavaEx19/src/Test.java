public class Test 
{
	public static void main(String[] args) 
	{
		Car car = new Car();
		car.Run();
		
		Tire tire = null;
		tire = new NexenTire();
		car.setTire(tire);
		//car.setTire(new NexenTire());
		car.Run();
		
		tire = new HankukTire();
		car.setTire(tire);
		//car.setTire(new HankukTire());
		car.Run();	
	}
}
