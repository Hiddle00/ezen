//10. while �ݺ��� ����
public class WhileLoop 
{
//����Ʈ����, �ϵ�����
	public static void main(String[] args) 
	{
		int n = 0;
//		while(true)
//		{
//			n = n + 1;
//			System.out.println(n);
//		}
		
		boolean f = true;
		while(f)
		{
			n = n + 1;
			System.out.println(n);
			if(n >= 10)
			{
				f = false;
			}
		}
		
		n = 0;
		while(n < 10)
		{
			n = n + 1;
			System.out.println("n=" + n);
		}
		
		//while ���� �̿��Ͽ� 1 ~ 10���� ¦���� ����ϼ���.
//		string s = n % 2;
//		while()
		
		//while ���� �̿��Ͽ� 1 ~ 10���� ¦���� ����Ͻÿ�.
		n = 0;
		while(++n < 10)
		{
			n = n + 1;
			System.out.println("n=" + n);
		}
		
		//while ���� �̿��Ͽ� 1 ~ 10���� ¦���� ����Ͻÿ�.
		//��, if ���� �̿��Ͻÿ�.
		n = 0;
		while(n < 10)
		{
			n = n + 1;
			if(n % 2 == 0)
			System.out.println("n=" + n);
		}
		
		//while���� �̿��Ͽ� 1���� 10���� �հ踦 ����ϼ���.
			n = 0;
		int s = 0;
		while(n < 10) 
		{
			n = n + 1;
			s = n + s; // s += n;
			if(n >= 10)
			{
			System.out.println(s);
			}
		}
		System.out.println(n);
		
		n = 1;
		int sum = 0;
		while(n <= 10) 
		{
			sum = n + sum;
			n = n + 1;
		}
		System.out.println(sum);
		System.out.println(n);
		
		//while���� �̿��Ͽ� 1 ~ 100������ �հ踦 ����ϼ���.
		n = 0;
		sum = 0;
		while(n <= 100) 
		{
			sum = n + sum; // sum += n;
			n = n + 2;	   // n += 2;
		}
		System.out.println(sum);
		System.out.println(n);
		
		//while���� �̿��Ͽ� 1 ~ 100������ Ȧ���� ¦���� �հ踦 ���� ���Ͻÿ�.
		n = 0;
		int even_sum = 0; //¦���� �հ�
		int odd_sum = 0; //Ȧ���� �հ�
		while(n <= 100) 
		{
			if (n % 2 == 0)	
			{
			even_sum = n + even_sum;
			}else
			{
			odd_sum = n + odd_sum;
			}
			n = n + 1;
		}
		
		n = 0;
		even_sum = 0; //¦���� �հ�
		odd_sum = 0; //Ȧ���� �հ�
		while(++n <= 100) 
		{
			if (n % 2 == 0)	
			{
			even_sum += n;
			}else
			{
			odd_sum += n;
			}
			
		}
		
		n = 0;
		even_sum = 0; //¦���� �հ�
		odd_sum = 0; //Ȧ���� �հ�
		while(n <= 100) 
		{
			if (n % 2 == 0)	even_sum += n++;
			else			odd_sum += n++;
		}
		System.out.println(even_sum);
		System.out.println(odd_sum);
	}

}
