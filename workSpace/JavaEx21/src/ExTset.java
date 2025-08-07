//예외처리 연습 1번
public class ExTset 
{

	public static void main(String[] args) 
	{
		int x = 20;
		int y = 1;
		int z = 0;
		
		try
		{
		z = x / (y - 1);
		
		System.out.println(z);
		}catch(Exception e)
		{
			System.out.println("오류 발생");
		}
		System.out.println(z);
		
		try {
			String str = null;
			System.out.println("문자열 길이 : " + str.length());
		}catch(Exception e) 
		{
			System.out.println(e);
			System.out.println("오류 발생");
		}
		try 
		{
			int[] ary = {1, 2, 3};
			System.out.println(ary[10]);
		}catch(Exception e)
		{
			System.out.println("오류 발생");
		}
		
		try {
			String num = "1,234";
			int    n   = Integer.parseInt(num);
			System.out.println(n);
		}catch(Exception e)
		{
			System.out.println(e);
			System.out.println("오류 발생");
		}
	}

}
