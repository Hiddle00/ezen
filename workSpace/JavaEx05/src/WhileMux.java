//11. while 다중 반복문
//System.out.printf() <-- 포멧 문자열 메소드
public class WhileMux 
{

	public static void main(String[] args) 
	{
		//구구단 출력하기
		int x = 1;
		while(x <= 9)
		{
			int y = 1;
//			int z = 0;
			while(y <= 9)
			{
				System.out.printf("%02d x %02d = %02d\n",x,y,(x * y));
				++y;
			}
			System.out.println("---------------");
			++x;
		}
		
		
//		x가 n일때 n행m열에 출력
//		td에 id or class를 주고 출력
//		
//		컬럼에 값을 지정해서 대입 ---
	}
	
}
