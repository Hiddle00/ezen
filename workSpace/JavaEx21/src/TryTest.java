//예외처리 연습 2번
public class TryTest 
{

	public static void main(String[] args) 
	{
		int x = 20;
		int y = 1;
		int z = 0;
		String str = null;
		int[] ary = {1, 2, 3};
		
		try 
		{
			//배열 오류
			System.out.println(ary[10]);
			
			//null 오류
			int length = str.length();
			
			//0나누기 오류
			z = x / (y - 1);
		}catch(Exception e)
		{
			System.out.println(e);
			System.out.println("오류 발생");
			e.printStackTrace();
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
