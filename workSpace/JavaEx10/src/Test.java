//27. �ڵ����� Ÿ�̾� ���� ǥ���� ���� class
public class Test 
{
	public static void main(String[] args)
	{
		//Tire ��ü�� �����Ѵ�.
		Tire tire = new Tire();
		tire.production = "�ؼ�Ÿ�̾�";
		tire.inch       = 21;
		
		//Car ��ü�� �����Ѵ�.
		Car sonata = new Car();
		sonata.company  = "�����ڵ���";
		sonata.model    = "�ҳ�Ÿ";
		sonata.color    = "���";
		sonata.maxSpeed = 200;
		sonata.tire     = tire;
		
		Car mornig = new Car();
		mornig.company  = "�����ڵ���";
		
		
		System.out.println(sonata.tire.production);
		
		
		
	}
}
