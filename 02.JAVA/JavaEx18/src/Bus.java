//����
public class Bus  extends Car
{
	private String passenger; //�°���
	
	public Bus()
	{
		super("����");
		System.out.println("Bus Ŭ������ ������");
	}

	public String getPassenger() {	return passenger;	}

	public void setPassenger(String passenger) { this.passenger = passenger; }
	
	@Override
	public void Run()
	{
		super.Run();
		System.out.println("������ �޸��ϴ�.");
	}	
	
	
}
