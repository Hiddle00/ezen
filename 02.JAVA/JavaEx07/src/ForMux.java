//16. for �ݺ����� �̿��� ������ �� �� ��� ��� ����
public class ForMux 
{
	public static void main(String[] args) 
	{
		//for���� �̿��Ͽ� �������� ������ ���� ����ϼ���.
		for(int x = 1; x <= 9; x++) 
		{
			for( int y = 1; y <= 9; y++)
			{
				System.out.println(x + " x " + y + " = " + (x * y));
			}
			System.out.println("-------------");
		}
		
		//for���� �̿��Ͽ� ������ ���� ����ϼ���.
		//*
		//**
		//***
		//****
		//*****
		for(int x = 1; x <= 5; x++)
		{
			for(int y = 1; y <= x; y++)
			{
				System.out.print("��");
			}
			System.out.println("");
		}	
		
		//for���� �̿��Ͽ� ������ ���� ����ϼ���.
		//*****
		//****
		//***
		//**
		//*
		//��� 1)
		for(int x = 1; x <= 5; x++)
		{
			for(int y = 5; y >= x; y--)
			{
				System.out.print("��");
			}
			System.out.println("");
		}
		
		//��� 2)		
		for(int x = 5; x >= 0; x--)
		{
			for(int y = 1; y <= x; y++)
			{
				System.out.print("��");
			}
			System.out.println("");
		}	
		
		//for���� �̿��Ͽ� �Ʒ��� ���� ȭ�鿡 ����ϼ���.
		//   *
		//  ***
		// *****
		//*******	
		for(int x = 1; x <= 4; x++)
		{
			//���� ���
			for(int y = 1; y <= (4-x); y++)
			{
				System.out.print(" ");
			}
			
			//�� ���
			for(int y = 1; y <= (x*2) - 1; y++)
			{
				System.out.print("��");
			}
			System.out.println("");
		}
		
		//for���� �̿��Ͽ� �Ʒ��� ���� ȭ�鿡 ����ϼ���.
		//*******
		// *****
		//  *** 
		//   * 
		for(int x = 4; x >= 1; x--)
		{
			//���� ���
			for(int y = 1; y <= (4-x); y++)
			{
				System.out.print(" ");
			}
			
			//�� ���
			for(int y = 1; y <= (x*2) - 1; y++)
			{
				System.out.print("��");
			}
			System.out.println("");
		}
	
	}
}
