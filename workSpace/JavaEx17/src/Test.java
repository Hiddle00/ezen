import typeTest.PackageTest;

public class Test 
{

	public static void main(String[] args) 
	{
		Person hong = new Person();
//		hong.age = -100;
		
		hong.setName("ȫ�浿");
		hong.setAge(18);
		
		System.out.println("�̸�: " + hong.getName());
		System.out.println("����: " + hong.getAge());
		System.out.println("����: " + hong.getYear());
		
		//import���� & ������ ȣ��
		PackageTest jeon = new PackageTest();
		System.out.println(jeon.name);
		jeon.name = "����ġ";
		System.out.println(jeon.name);
		
		byte b = 10;
		byte y = 20;
//		byte z = (b + y);
//		System.out.println(z);
		char c = 'A';
		double d = b;
		System.out.println(d);
//		short s = c;
		int i = c;
		long l = c;
		System.out.println(l);
		String s = "A";
		
	}

}
