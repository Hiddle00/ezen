//34. ������ �����ε�
public class Car 
{
	String company;  //������
	String name;     //����
	int    inch;     //��ũ��
	
	//1�� ������
	public Car()
	{
		System.out.println("1�� �����ڰ� �����.");
		
		this.company = "�����ڵ���";
		this.name    = "�ƹ���";
		this.inch    = 15;
	}
	
	//2�� ������
	public Car(int inch)
	{
		System.out.println("2�� �����ڰ� �����.");
		
		this.company = "�����ڵ���";
		this.name    = "�ƹ���";
		this.inch    = inch;		
	}
	
	//CarŬ���� ������ ����ϴ� �޽��
	public void PrintInfo()
	{
		System.out.println("����ȸ��:" + this.company);
		System.out.println("�����̸�:" + this.name);
		System.out.println("����ũ��:" + this.inch);		
		System.out.println("===============");
	}
	
}
