//15. for �ݺ��� ����
public class ForLoop 
{

	public static void main(String[] args) 
	{
		//for�� �̿��Ͽ� 1~10 ���� ����ϴ� ����
		for(int n = 1; n <= 10; n++) //~�ϴ� ���� for(�ʱⰪ;��������;��������)
		{
		 System.out.println(n);   
		}

		//for���� �̿��Ͽ� 1 ~ 100���� �հ� ���
		//���� :n, sum Ȱ��
		int sum = 0;
		for(int n = 1; n <= 100; n++)
		{
			sum = sum + n;
		}
		System.out.println(sum);
		
		//for���� �̿��Ͽ� 1 ~ 100����
		//¦���հ�,Ȧ���հ�,��ü�հ踦 ����ϼ���.
		//����: n, sum, even_sum, odd_sum
		sum = 0;
		int even_sum = 0;
		int odd_sum = 0;
		for(int n = 1; n <= 100; n++)
		{
			sum += n;
			if(n % 2 == 0)
			{
				even_sum += n;
			}else
			{
				odd_sum += n;
			}
		}
		sum = even_sum + odd_sum;
		System.out.println("¦���հ�: " + even_sum);
		System.out.println("Ȧ���հ�: " + odd_sum);
		System.out.println("��ü�հ�: " + sum);
	}

}
