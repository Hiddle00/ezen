
public class Test 
{

	public static void main(String[] args) 
	{
//		int n = 0;
//		do
//		{
//			System.out.println(n);
//			n++;
//		}while(n < 10);
		
//		//for 문을
//		int x;
//		for(x = 1; x < 101; x++ )
//		{
//			if(x % 3 == 0 && x % 5 == 0) System.out.println(x);
//		}
		//중첩 for문을 이용하여 방정식 4x + 5y + z = 60 의 모든 해를 구해서
		//(x,y) 형태로 출력해보세요. 단, x와 y와 z는 10이하의 자연수.
		int x = 1;
		for(x = 1; x <= 10; x++)
		{
			for(int y = 1; y <= 10; y++)
			{
				for(int z = 1; z <=10; z++)
				{
					if(4 * x + 5 * y + z == 80)
					{
						System.out.println(x + " " + y + " " + z);
					}
				}
			}
		}
		double f = 15.3e-3*01.123e-5;
		System.out.println(f);
		
	}

}
