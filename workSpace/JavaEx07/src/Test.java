
public class Test 
{

	public static void main(String[] args) 
	{
//		int n = 0;
//		do
//		{
//			System.out.println(n);
//			n++;
//		}while(n < 10);
		
//		//for ����
//		int x;
//		for(x = 1; x < 101; x++ )
//		{
//			if(x % 3 == 0 && x % 5 == 0) System.out.println(x);
//		}
		//��ø for���� �̿��Ͽ� ������ 4x + 5y + z = 60 �� ��� �ظ� ���ؼ�
		//(x,y) ���·� ����غ�����. ��, x�� y�� z�� 10������ �ڿ���.
		int x = 1;
		for(x = 1; x <= 10; x++)
		{
			for(int y = 1; y <= 10; y++)
			{
				for(int z = 1; z <=10; z++)
				{
					if(4 * x + 5 * y + z == 80)
					{
						System.out.println(x + " " + y + " " + z);
					}
				}
			}
		}
		double f = 15.3e-3*01.123e-5;
		System.out.println(f);
		
	}

}
