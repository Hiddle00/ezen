//
public class Car 
{
	private String model; //����
	private Tire   tire;  //Ÿ�̾�
	
	public Car()
	{
		model = "�׷���";
		tire  = new Tire();
	}
	
	public void setTire(Tire tire)
	{
		this.tire = tire;
	}
	
	public void Run()
	{
		tire.Roll();
		System.out.println(model + "�� �����Դϴ�.");
	}
}
