//24. Person class�� �̿��Ͽ� ��ü ���� ����
public class Test 
{
	public static void main(String[] args) 
	{
		//Person Ŭ������ �̿��Ͽ� hong�̶�� ��ü�� �����Ѵ�.
		Person hong = new Person();
		hong.name   = "ȫ�浿";
		hong.age    = 15;
		hong.tel    = "010-1111-1111";
		
		//Person Ŭ������ �̿��Ͽ� chun�̶�� ��ü�� �����Ѵ�.		
		Person chun = new Person();
		chun.name = "������";
		chun.age  = 16;
		chun.tel  = "010-7777-7777";
		
		//Ŭ���� ���� jeon�� �����ϰ�,
		//����Ű�� ��ü�� ����		
		Person jeon = null;
		
		//hong�� ����Ű�� ��ü�� jeon�� ����Ų��.
		jeon = hong;
		System.out.println(jeon.name);
		
		//chun�� ����Ű�� ��ü�� jeon�� ����Ų��.		
		jeon = chun;
		System.out.println(jeon.name);
		
	}
}


