//�ý�
public class Taxi extends Car
{
	private String meter;    //�̵��Ÿ�
	
	public Taxi()
	{
		super("�ý�");
		System.out.println("Taxi Ŭ������ ������");
	}

	public String getMeter() { return meter; }

	public void setMeter(String meter) { this.meter = meter; }
	
	@Override
	public void Run()
	{
		super.Run();
		System.out.println("�ýð� �޸��ϴ�.");
	}
	
	public void Call()
	{
		System.out.println("������ �ýø� ȣ���߽��ϴ�.");
		this.Run();
	}
}
