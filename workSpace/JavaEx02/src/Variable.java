//01.�ڹ� ���� Ÿ�� ����
public class Variable 
{

	public static void main(String[] args) 
	{
		//���� : boolean Ÿ�� ����
		boolean f = true;
		System.out.println(f);
				
		f = false;
		System.out.println(f);
		
		//���� : ����(Integer) Ÿ�� ����
		byte b =100;
		System.out.println(b);
		short s =32000;
		System.out.println(s);
		int i = 999999;
		System.out.println(i);
		long l = 1000000000;
		System.out.println(l);
		
		//���� : �Ǽ�(Float) Ÿ�� ����
		float ff = 3.14f; //float�� �Ǽ� �ڿ� f�� �ʼ�?
		System.out.println(ff);
		double dd = 3.14;
		System.out.println(dd);
		
		//���� : ����(Character) Ÿ�� ���� 
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c);
		
		for(c = 'A'; c <= 'Z'; c++)
		{
//			if(c == 'C' || c == 'D' || c =='E')
//			{
//				continue;
//			}
//			System.out.println("C=" + c);
			
//			if(c != 'C' && c != 'D' && c != 'E')
//			{
//				System.out.println("C=" + c);
//			}
			
			switch(c)
			{
				case 'C':
				case 'D':
				case 'E':
				break;
				default: System.out.println(c);
			}
		}
		
		int in = 5;
		int im = 10;
		int temp = in;
		System.out.println(in);
		
	}

}
