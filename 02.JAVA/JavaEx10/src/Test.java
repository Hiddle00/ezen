//27. �ڵ����� Ÿ�̾� ���� ǥ���� ���� class
public class Test 
{
	public static void main(String args[])
	{
		//Tire ��ü�� �����Ѵ�.
		Tire tire = new Tire();
		tire.production = "�ؼ�Ÿ�̾�";
		tire.inch       = 21;
		
		//Car ��ü�� �����Ѵ�.
		Car sonata = new Car();
		sonata.company  = "����";
		sonata.model    = "�ҳ�Ÿ";
		sonata.color    = "���";
		sonata.maxSpeed = 200;
		sonata.tire     = tire;
		
		System.out.println(sonata.tire.production);
		
		
	}
}
