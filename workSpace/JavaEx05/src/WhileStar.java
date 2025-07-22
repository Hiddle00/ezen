//12. while 별 찍기
public class WhileStar 
{

	public static void main(String[] args) 
	{
		//while문을 이용하여 아래와 같이 화면에 출력하세요.
		//변수는 x,y를 사용하세요.
//		int x = 1;
//		while(x <= 5)
//		{
//			int y = 1;
//			while(y <= x)
//			{
//				System.out.print("*");
//				y++;
//			}
//			System.out.println("");
//			x++;
		
		int x = 5;
		while(x >= 0)
		{
			int y = 1;
			while(y <= x)
			{
				System.out.print("*");
				y++;
			}
			System.out.println("");
			x--;
		}
		
		x = 5;
		while(x >= 0)
		{
			System.out.println(x);
			x--;
		}
		
		int y = 1;
		while(y <= (x+1))
		{
			System.out.print("*");
			y++;
		}
		
		x = 1;
		while(x <= 7)
		{
			y = 1;
			if(y >= x)
			{
				while()
				{
					
				}
				
//				System.out.print();
				y++;
			}
			while()
			{
				System.out.print("*");
				
			}
			x += 2;
		}
		
		int row = 1;
		while(row <= 4)
		{
			int col = 1;
			while(col <= (4-row))
			{
				System.out.print(" ");
				col++;
			}
			//별 홀수개 출력
			col = 1;
			while(col <= (row * 2) - 1)
			{
				System.out.print("*");
				col++;
			}
			System.out.println("");
			row++;
		}
		row = 3;
		while(row >= 1)
		{
			int col = 1;
			while(col <= (4-row))
			{
				System.out.print(" ");
				col++;
			}
			//별 홀수개 출력
			col = 1;
			while(col <= (row * 2) - 1)
			{
				System.out.print("*");
				col++;
			}
			System.out.println("");
			row--;
		}
		
	}

}
