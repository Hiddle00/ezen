//13. while ������ break, continue
public class WhileBreak 
{

	public static void main(String[] args) 
	{
		//while���� break�� ����Ͽ� 1~10���� ����ϼ���.
		int n = 1;
		while(true)
		{
			System.out.println(n);
			n++;
			if(n > 10)
			{
				break;
			}
		}
		
		int x = 0;
		while(x <= 100)
		{
			if(x % 2 == 1)
			{
				x++;
				continue;
			}
			System.out.println(x);
			x++;
		}
	}

}
