//택시
public class Taxi extends Car
{
	private String meter;    //이동거리
	
	public Taxi()
	{
		super("택시");
		System.out.println("Taxi 클래스가 생성됨");
	}

	public String getMeter() { return meter; }

	public void setMeter(String meter) { this.meter = meter; }
	
	@Override
	public void Run()
	{
		super.Run();
		System.out.println("택시가 달립니다.");
	}
	
	public void Call()
	{
		System.out.println("누군가 택시를 호출했습니다.");
		this.Run();
	}
}
