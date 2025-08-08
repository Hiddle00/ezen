
public class Test 
{

	public static void main(String[] args) 
	{
		try
		{
		Calculator c = new Calculator();
		System.out.println(c.Divide(100, 0));
		}catch(Exception e)
		{
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
		
		String str = "1,234,234";
		try 
		{
			str = str.replace(",", "");
			int z =Integer.parseInt(str);
			System.out.println("숫자로 된 문자열 입니다.");
		}catch(Exception e)
		{
			System.out.println("숫자가 아닌 문자열 입니다.");
		}
		
		str = "1,234,234aaaa";
		String msg = "숫자로 된 문자열 입니다.";
		try 
		{
			str = str.replace(",", "");
			Integer.parseInt(str);
		}catch(Exception e)
		{
			msg = "숫자가 아닌 문자열 입니다.";
		}
		System.out.println(msg);
		
	}
	

}
