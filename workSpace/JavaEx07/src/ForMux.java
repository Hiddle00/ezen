//16. for �ݺ����� �̿��� ������ �� �� ��� ��� ����
public class ForMux 
{

	public static void main(String[] args) 
	{
		for(int x = 1; x <= 9; x++)
		{
			System.out.printf("%02d��\n",x);
			for(int y = 1; y <= 9; y++)
			{
				System.out.printf("%02d x %02d = %02d\n", x, y, (x * y));

			}
			System.out.println("-----------------------");
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
		for(int x = 1; x <= 5; x++)
		{
			for(int y = x; y <= 5; y++)
			{
				System.out.print("��");
			}
			System.out.println("");
		}
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
			for(int y = 1; y <= 4-x; y++)
			{
				System.out.print(" ");
			}
			for(int y = 1; y <= (x*2-1); y++)
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
		for(int x = 3; x >= 0; x--)
		{
			for(int y = 1; y <= 4-x; y++)
			{
				System.out.print(" ");
			}
			for(int y = 1; y <= (x*2-1); y++)
			{
				System.out.print("��");
			}
			System.out.println("");
		}
		//�������
		for(int x = 1; x <= 4; x++)
		{
			for(int y = 1; y <= 4-x; y++)
			{
				System.out.print("��");
			}
			for(int y = 1; y <= (x*2-1); y++)
			{
				System.out.print(" ");
			}
			for(int y = 1; y <= 4-x; y++)
			{
				System.out.print("��");
			}
			System.out.println("");
		}
		
		for(int x = 3; x >= 0; x--)
		{
			//��
			for(int y = 1; y <= 4-x; y++)
			{
				System.out.print("��");
			}
			//���鸶����
			for(int y = 1; y <= (x*2-1); y++)
			{
				System.out.print(" ");
			}
			//������ �� 
			if(x == 0)
			{
				System.out.print("�ڡڡ�");
			}else for(int y = 1; y <= 4-x; y++)
			{
				System.out.print("��");
			}
			System.out.println("");
		}
	}

}
