//16. for 반복문을 이용한 구구단 및 별 찍기 출력 연습
public class ForMux 
{

	public static void main(String[] args) 
	{
		for(int x = 1; x <= 9; x++)
		{
			System.out.printf("%02d단\n",x);
			for(int y = 1; y <= 9; y++)
			{
				System.out.printf("%02d x %02d = %02d\n", x, y, (x * y));

			}
			System.out.println("-----------------------");
		}
		
		//for문을 이용하여 다음과 같이 출력하세요.
		//*
		//**
		//***
		//****
		//*****
		for(int x = 1; x <= 5; x++)
		{
			for(int y = 1; y <= x; y++)
			{
				System.out.print("★");
			}
			System.out.println("");
		}
		
		//for문을 이용하여 다음과 같이 출력하세요.
		//*****
		//****
		//***
		//**
		//*
		for(int x = 1; x <= 5; x++)
		{
			for(int y = x; y <= 5; y++)
			{
				System.out.print("★");
			}
			System.out.println("");
		}
		for(int x = 5; x >= 0; x--)
		{
			for(int y = 1; y <= x; y++)
			{
				System.out.print("★");
			}
			System.out.println("");
		}
		
		//for문을 이용하여 아래와 같이 화면에 출력하세요.
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
				System.out.print("★");
			}
			System.out.println("");
		}
		//for문을 이용하여 아래와 같이 화면에 출력하세요.
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
				System.out.print("★");
			}
			System.out.println("");
		}
		//역별찍기
		for(int x = 1; x <= 4; x++)
		{
			for(int y = 1; y <= 4-x; y++)
			{
				System.out.print("★");
			}
			for(int y = 1; y <= (x*2-1); y++)
			{
				System.out.print(" ");
			}
			for(int y = 1; y <= 4-x; y++)
			{
				System.out.print("★");
			}
			System.out.println("");
		}
		
		for(int x = 3; x >= 0; x--)
		{
			//별
			for(int y = 1; y <= 4-x; y++)
			{
				System.out.print("★");
			}
			//공백마름모
			for(int y = 1; y <= (x*2-1); y++)
			{
				System.out.print(" ");
			}
			//마지막 줄 
			if(x == 0)
			{
				System.out.print("★★★");
			}else for(int y = 1; y <= 4-x; y++)
			{
				System.out.print("★");
			}
			System.out.println("");
		}
	}

}
