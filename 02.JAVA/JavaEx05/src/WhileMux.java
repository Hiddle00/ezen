//11. while ���� �ݺ���
//System.out.printf() <-- ���� ���ڿ� �޽��
public class WhileMux 
{
	public static void main(String[] args) 
	{
		//������ ����ϱ�
		int x = 1;
		
		while( x <= 9)
		{
			int y = 1;
			
			while(y <= 9)
			{
				System.out.printf("%02d x %02d = %02d\n",x,y,(x * y));
				y = y + 1;
			}
			
			System.out.println("-------------------");
			x++;
		}
	}
}


