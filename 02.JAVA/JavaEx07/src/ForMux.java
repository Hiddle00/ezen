//16. for 반복문을 이용한 구구단 및 별 찍기 출력 연습
public class ForMux 
{
	public static void main(String[] args) 
	{
		//for문을 이용하여 구구단을 다음과 같이 출력하세요.
		for(int x = 1; x <= 9; x++) 
		{
			for( int y = 1; y <= 9; y++)
			{
				System.out.println(x + " x " + y + " = " + (x * y));
			}
			System.out.println("-------------");
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
		//방법 1)
		for(int x = 1; x <= 5; x++)
		{
			for(int y = 5; y >= x; y--)
			{
				System.out.print("★");
			}
			System.out.println("");
		}
		
		//방법 2)		
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
			//공백 출력
			for(int y = 1; y <= (4-x); y++)
			{
				System.out.print(" ");
			}
			
			//별 출력
			for(int y = 1; y <= (x*2) - 1; y++)
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
		for(int x = 4; x >= 1; x--)
		{
			//공백 출력
			for(int y = 1; y <= (4-x); y++)
			{
				System.out.print(" ");
			}
			
			//별 출력
			for(int y = 1; y <= (x*2) - 1; y++)
			{
				System.out.print("★");
			}
			System.out.println("");
		}
	
	}
}
