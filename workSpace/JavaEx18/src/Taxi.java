
public class Taxi extends Car 
{
	private String passenger; //�°���
	
	public Taxi()
	{
		super("�ý�");
		System.out.println("Taxi Ŭ������ ������.");
	}
	
	public String getPassenger()               {  return passenger;  }
	public void setPassenger(String passenger) {  this.passenger  = passenger;  }
	
	@Override
	public void Run()
	{
		super.Run();
		System.out.println("�ýð� �޸��ϴ�.");
	}
}
