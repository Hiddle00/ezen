//15. for �ݺ��� ����
public class ForLoop 
{
	public static void main(String[] args) 
	{
		/*
		int n = 1;      //�ʱⰪ
		while( n < 10 ) //���� ����
		{
			System.out.println(n);
			n++;        //���� ����
		}
		*/
		//for�� �̿��Ͽ� 1~10���� ����ϴ� ����
		for( int n = 1 ; n <= 10 ; n++ )
		{
			System.out.println(n);
		}
		
		//for ���� �̿��Ͽ� 1 ~ 100���� �հ� ���
		//���� : n, sum Ȱ��
		int sum = 0;
		for(int n = 1; n <= 100 ; n++)
		{
			//sum = sum + n;
			sum += n;
		}
		System.out.println("�հ�:" + sum);		
		
		//for ���� �̿��Ͽ� 1 ~ 100���� 
		//¦���հ�,Ȧ���հ�, ��ü�հ踦 ����ϼ���.
		//���� : n, sum, even_sum, odd_sum
		sum = 0;          //��ü�հ�
		int even_sum = 0; //¦���հ�
		int odd_sum  = 0; //Ȧ���հ�
		for(int n = 1; n <= 100; n++) 
		{
			if( n % 2 == 0)
			{
				even_sum += n; //¦�� �հ� ���ϱ�
			}else
			{
				odd_sum += n; //Ȧ�� �հ� ���ϱ�
			}
			sum += n; //��ü�հ� 
		}		
		System.out.println("Ȧ���հ�:" + odd_sum);
		System.out.println("¦���հ�:" + even_sum);
		System.out.println("��ü�հ�:" + sum);			
		
	}
}


