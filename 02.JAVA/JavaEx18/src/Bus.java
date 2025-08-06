//버스
public class Bus  extends Car
{
	private String passenger; //승객수
	
	public Bus()
	{
		super("버스");
		System.out.println("Bus 클래스가 생성됨");
	}

	public String getPassenger() {	return passenger;	}

	public void setPassenger(String passenger) { this.passenger = passenger; }
	
	@Override
	public void Run()
	{
		super.Run();
		System.out.println("버스가 달립니다.");
	}	
	
	
}
