// 31. Ŭ����(Class) �޽�� ����
public class Test 
{

	public static void main(String[] args) 
	{
//		Calculater c = new Calculater();
//		c.Add(100, 200);
//		System.out.println(c.Add(100, 200));
//		
//		int k = c.Add(100, 200);
//		System.out.println(k);
		
		Calculater cal = new Calculater();
				
		//���� �� ����ϱ�
		int n = 0;
		n = cal.Plus(10, 2);
		System.out.println(n);
		
		n = cal.Minus(10, 2);
		System.out.println(n);
		
		n = cal.Mux(10, 2);
		System.out.println(n);
		
		n = cal.Divide(10, 2);
		System.out.println(n);
		
		//�Ǽ� �� ����ϱ�
		double d = 0;
		d = cal.Plus(1.12, 3.13);
		System.out.println(d);
		
		//���ڿ�
		n = cal.Plus("1000", "2000");
		System.out.println(n);
		
		n = cal.Minus("1000", "2000");
		System.out.println(n);
		
		n = cal.Mux("1000", "2000");
		System.out.println(n);
		
		n = cal.Divide("1000", "2000");
		System.out.println(n);
		
		
		n = cal.DoCal(10, 20, "+");
		System.out.println(n);
		
		n = cal.DoCal(10, 20, "-");
		System.out.println(n);
		
		n = cal.DoCal(10, 20, "*");
		System.out.println(n);
		
		n = cal.DoCal(10, 20, "/");
		System.out.println(n);
		
		
	}

}
