//19. NULL�� ����Ÿ��
public class NullTest 
{
	public static void main(String[] args) 
	{
		//�⺻Ÿ�Կ��� "=="�� ���� ������ ��
		int a = 10;
		int b = 10;
		if( a == b )
		{
			System.out.println("a�� b�� ������ ���Դϴ�.");
		}else
		{
			System.out.println("a�� b�� ���� �ٸ� ���Դϴ�.");
		}
		
		//����Ÿ�Կ��� "=="�� ����Ű�� �ּҰ� �������� ��
		int[] aryA = { 11, 22, 33 };
		int[] aryB = { 44, 55, 66 };
		int[] aryC = aryA;
		if( aryA == aryB )
		{
			System.out.println("aryA�� aryB�� ������ �ּ��Դϴ�.");
		}else
		{
			System.out.println("aryA�� aryB�� ���� �ٸ� �ּ��Դϴ�.");
		}
		if( aryA == aryC )
		{
			System.out.println("aryA�� aryC�� ������ �ּ��Դϴ�.");
		}else
		{
			System.out.println("aryA�� aryC�� ���� �ٸ� �ּ��Դϴ�.");
		}		
		
		//NULL�� ���� ����Ű�� �ּҰ� ����
		aryC = null;
		if(aryA != null)
		{
			System.out.println("aryA�� null�� �ƴմϴ�.");
		}
		if(aryC == null)
		{
			System.out.println("aryC�� null�Դϴ�.");
		}		
			
		//�Ǽ��� �迭����
		double []aryX = { 1.1, 1.2 };
		double []aryY = aryX;
		
		//aryX�� aryY�� ������ �ּҸ� ����Ű�� ����
		aryY[0] = 3.3;  
		System.out.println(aryX[0]);
	}
}
