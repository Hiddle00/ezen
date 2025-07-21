//12. while 별 찍기
public class WhileStar 
{
	public static void main(String[] args) 
	{
		//while문을 이용하여 아래와 같이 화면에 출력하세요.
		//변수명은 x,y를 이용하세요.
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
		

		//while문을 이용하여 아래와 같이 화면에 출력하세요.
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
		
		//while문을 이용하여 아래와 같이 화면에 출력하세요.
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
			//빈칸을 출력한다.
			int col = 1;
			while( col <= (4-row) )
			{
				System.out.print(" ");
				col++;
			}
			
			//별 출력 (홀수개 단위로 출력)
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
			//빈칸을 출력한다.
			int col = 1;
			while( col <= row)
			{
				System.out.print(" ");
				col++;
			}
			
			//별 출력 (홀수개 단위로 출력)
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


