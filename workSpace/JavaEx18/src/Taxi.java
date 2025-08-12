
public class Taxi extends Car 
{
	private String passenger; //승객수
	
	public Taxi()
	{
		super("택시");
		System.out.println("Taxi 클래스가 생성됨.");
	}
	
	public String getPassenger()               {  return passenger;  }
	public void setPassenger(String passenger) {  this.passenger  = passenger;  }
	
	@Override
	public void Run()
	{
		super.Run();
		System.out.println("택시가 달립니다.");
	}
}
