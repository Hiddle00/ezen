//����ó�� ���� 1��
public class ExTset 
{

	public static void main(String[] args) 
	{
		int x = 20;
		int y = 1;
		int z = 0;
		
		try
		{
		z = x / (y - 1);
		
		System.out.println(z);
		}catch(Exception e)
		{
			System.out.println("���� �߻�");
		}
		System.out.println(z);
		
		try {
			String str = null;
			System.out.println("���ڿ� ���� : " + str.length());
		}catch(Exception e) 
		{
			System.out.println(e);
			System.out.println("���� �߻�");
		}
		try 
		{
			int[] ary = {1, 2, 3};
			System.out.println(ary[10]);
		}catch(Exception e)
		{
			System.out.println("���� �߻�");
		}
		
		try {
			String num = "1,234";
			int    n   = Integer.parseInt(num);
			System.out.println(n);
		}catch(Exception e)
		{
			System.out.println(e);
			System.out.println("���� �߻�");
		}
	}

}
