
public class Bus extends Car 
{
	private String meter; //이동거리
	
	public Bus()
	{
		super("버스");
		System.out.println("Bus 클래스가 생성됨.");
	}
	
	public String getMeter()           {  return meter;  }
	public void setMeter(String meter) {  this.meter  = meter;  }
	
	@Override
	public void Run()
	{
		super.Run();
		System.out.println("버스가 달립니다.");
	}
}
