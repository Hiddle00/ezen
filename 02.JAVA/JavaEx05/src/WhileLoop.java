//10. while �ݺ��� ����
public class WhileLoop 
{
	public static void main(String[] args) 
	{
		//while ���� �̿��Ͽ� 1 ~ 10���� ���
		int n = 0;
		while( n <  10 )
		{
			n = n + 1;
			System.out.println("n=" + n);
		}
		
		//while ���� �̿��Ͽ� 1 ~ 10���� ¦���� ����ϼ���.
		n = 0;	
		while( n <  10 )
		{
			n = n + 2;
			System.out.println("n=" + n);
		}		
		
		
		//while ���� �̿��Ͽ� 1 ~ 10���� ¦���� ����ϼ���.
		//��, if���� �̿��Ͻÿ�.
		n = 0;
		while( n <  10 )
		{
			n = n + 1;
			if( n % 2 == 0)
			{
				System.out.println("n=" + n);
			}
		}	
		
		//while���� �̿��Ͽ� 1 ~ 100������ �հ踦 ����ϼ���.
		n = 1;
		int sum = 0;
		while( n <= 100 )
		{			
			sum = sum + n;
			n = n + 1;
		}
		System.out.println("n=" + n);
		System.out.println("sum=" + sum);
		
		
		//while���� �̿��Ͽ� 1 ~ 100������ ¦���� �հ踦 ����ϼ���.
		n = 0;
		sum = 0;
		while( n <= 100 )
		{			
			sum = sum + n;
			n = n + 2;
		}
		System.out.println("n=" + n);
		System.out.println("sum=" + sum);	
		
		//while���� �̿��Ͽ� 1 ~ 100������ Ȧ���� ¦���� �հ踦 
		//���� ���Ͽ� ����ϼ���.
		n = 0;
		int even_sum = 0; //¦���� �հ�
		int odd_sum  = 0; //Ȧ���� �հ�
		while( n <= 100 )
		{
			if( n % 2 == 0)
			{				
				even_sum += n; //n�� ¦��
			}else
			{				
				odd_sum += n;  //n�� Ȧ��
			}
			n++;
		}
		System.out.println("¦���հ�:" + even_sum);
		System.out.println("Ȧ���հ�:" + odd_sum);
		System.out.println("�հ�:" + (even_sum + odd_sum));
		
	}
}

