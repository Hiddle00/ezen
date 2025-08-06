
public class Test04 
{

	public static void main(String[] args) 
	{

//		int sum = 0;
//		for(int i = 1; i <= 100; i++)
//		{
//			if (i % 3 == 0) sum += i;
//		}
//		System.out.println(sum);
//		
//		
//		while (true)
//		{
//			int d1 = (int)(Math.random() * 100000) % 6 + 1;
//			int d2 = (int)(Math.random() * 100000) % 6 + 1;
//			System.out.println("( " + d1 + " , " + d2 + " )");
//			if (d1 + d2 == 5) break;
//		}
		
		//4x + 5y = 60의 모든 해를 (x, y)형태로 출력. 단, x와 y는 10 이하의 자연수
		int x;
		int y;
		for(x = 1; x <= 10; x++)
		{
			for(y = 1; y <= 10; y++)
			{
				if ((4 * x) + (5 * y) == 60)
				{
					System.out.println( x + ", " + y);
				}
			}
		}
		
		//별찍기
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
