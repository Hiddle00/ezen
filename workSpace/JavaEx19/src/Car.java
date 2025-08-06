//
public class Car 
{
	private String model; //차종
	private Tire   tire;  //타이어
	
	public Car()
	{
		model = "그랜저";
		tire  = new Tire();
	}
	
	public void setTire(Tire tire)
	{
		this.tire = tire;
	}
	
	public void Run()
	{
		tire.Roll();
		System.out.println(model + "가 움직입니다.");
	}
}
