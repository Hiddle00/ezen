//��� ���� �ڵ�
public class Test 
{

	public static void main(String[] args) 
	{
//		Car car = new Car("�ҳ�Ÿ");
//		System.out.println("������:" + car.getCompany());
//		System.out.println("����:" + car.getName());
		
		//Taxi taxi = new Taxi();
		//System.out.println("������:" + taxi.getCompany());
		//System.out.println("����:" + taxi.getName());
		
//		Bus bus = new Bus();
//		System.out.println("������:" + bus.getCompany());
//		System.out.println("����:" + bus.getName());
		/*
		Car car = new Car();
		car.Run();
		
		Taxi taxi = new Taxi();
		taxi.Run();
		
		Bus bus = new Bus();
		bus.Run();
		*/
		//����� ���� ������ ���� ����
		//�θ� Ÿ�Կ��� ��� �ڽ� ��ü�� ���� ����
		int trans = 0; //������� 0:�ڰ���, 1:�ý�, 2:����
		Car car = null;
		switch(trans)
		{
		case 0 : car = new Car();
			break;
		case 1 : car = new Taxi();
			break;
		case 2 : car = new Bus();
			break;
		}
		car.Run();
	}

}
