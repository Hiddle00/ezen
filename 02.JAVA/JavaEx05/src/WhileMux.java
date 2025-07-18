//11. while 다중 반복문
//System.out.printf() <-- 포멧 문자열 메쏘드
public class WhileMux 
{
	public static void main(String[] args) 
	{
		//구구단 출력하기
		int x = 1;
		
		while( x <= 9)
		{
			int y = 1;
			
			while(y <= 9)
			{
				System.out.printf("%02d x %02d = %02d\n",x,y,(x * y));
				y = y + 1;
			}
			
			System.out.println("-------------------");
			x++;
		}
	}
}


