
public class Test 
{

	public static void main(String[] args) 
	{
//		1~100������ �� �߿���
		//3�� 5�� ������� ���Ͽ� ȭ�鿡 ����Ͻÿ�.
		//for���� ����n
		int n;
		for(n = 1; n < 101; n++)
		{
			if (n % 3 == 0 && n % 5 == 0)
			{
				System.out.println(n);
			}
		}
		
		//���� ������ ���⿩�θ� �Ǵ��Ͽ� "�����Դϴ�." Ȥ�� "������ �ƴմϴ�."
		
		int year = 2014;
		if(year % 4 == 0)
		{
			System.out.println("�����Դϴ�.");
		}else
		System.out.println("������ �ƴմϴ�.");
		
		year = 2000;
		if((year % 4 == 0) && (year % 100 == 0) || (year % 400 ==0))
		{
			
		}
	}

}
