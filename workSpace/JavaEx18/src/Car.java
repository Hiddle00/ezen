//�ڵ��� Ŭ����
public class Car 
{
	private String company;  //������
	private int    maxspeed; //�ִ� �ӵ�
	private String name;     //����
	
	//������ 1��
	public Car()
	{
		company  = "�����ڵ���";
		maxspeed = 200;
		name     = "�¿���";
		System.out.println("Car Ŭ������ ������(1).");
	}
	
	//������ 2��
	public Car(String name)
	{
		this();
		this.name = name;
		System.out.println("Car Ŭ������ ������(2).");
	}
	
	public String getCompany()  {	return company;  }
	public int    getMaxspeed() {	return maxspeed; }
	public String getName()     {	return name;     }

	public void setCompany(String company) {  this.company  = company;  }
	public void setMaxspeed(int maxspeed)  {  this.maxspeed = maxspeed; }
	public void setName(String name)       {  this.name     = name;     }
	
	public void Run()
	{
		System.out.println("�ڵ����� �޸��ϴ�.");
	}
	
}
