
public class Test 
{

	public static void main(String[] args) 
	{
		//while문을 이용하여 구구단 6단을 출력
		//변수는 x,y
		int x = 6;
		int y = 1;
		while(y < 10)
		{
			System.out.printf("%02d x %02d = %02d\n" ,x,y,(x*y));
			y++;
		}
				
	}

}
