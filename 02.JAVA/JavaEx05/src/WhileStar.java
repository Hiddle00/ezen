//12. while �� ���
public class WhileStar 
{
	public static void main(String[] args) 
	{
		//while���� �̿��Ͽ� �Ʒ��� ���� ȭ�鿡 ����ϼ���.
		//�������� x,y�� �̿��ϼ���.
		//*
		//**
		//***
		//****
		//*****
		int x = 1;
		while(x <= 5)
		{
			int y = 1; 
			while( y <= x )
			{
				System.out.print("*");
				y++;
			}
			System.out.print("\n");
			x++;
		}	
		

		//while���� �̿��Ͽ� �Ʒ��� ���� ȭ�鿡 ����ϼ���.
		//*****
		//****
		//***
		//**
		//*	
		x = 5;
		while( x >= 0)
		{
			int y = 1;
			while( y <= x )
			{
				System.out.print("*");
				y++;
			}
			System.out.print("\n");			
			x--;
		}
		
		//while���� �̿��Ͽ� �Ʒ��� ���� ȭ�鿡 ����ϼ���.
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		int row = 1;
		while( row <= 4)
		{
			//��ĭ�� ����Ѵ�.
			int col = 1;
			while( col <= (4-row) )
			{
				System.out.print(" ");
				col++;
			}
			
			//�� ��� (Ȧ���� ������ ���)
			col = 1;
			while( col <= (row * 2) - 1)
			{
				System.out.print("*");
				col++;
			}
			System.out.print("\n");
			row++;
		}
		
		row = 1;
		while( row <= 3 )
		{
			//��ĭ�� ����Ѵ�.
			int col = 1;
			while( col <= row)
			{
				System.out.print(" ");
				col++;
			}
			
			//�� ��� (Ȧ���� ������ ���)
			col = 7 - (row * 2) - 1;
			while( col >= 0)
			{
				System.out.print("*");
				col--;
			}			
			System.out.println("");
			row++;
		}
	}
}


