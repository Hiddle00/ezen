
public class Bus extends Car 
{
	private String meter; //�̵��Ÿ�
	
	public Bus()
	{
		super("����");
		System.out.println("Bus Ŭ������ ������.");
	}
	
	public String getMeter()           {  return meter;  }
	public void setMeter(String meter) {  this.meter  = meter;  }
	
	@Override
	public void Run()
	{
		super.Run();
		System.out.println("������ �޸��ϴ�.");
	}
}
