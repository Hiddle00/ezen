
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
		System.out.println("���α׷� ����");
		
		String str = "1,234,234";
		try 
		{
			str = str.replace(",", "");
			int z =Integer.parseInt(str);
			System.out.println("���ڷ� �� ���ڿ� �Դϴ�.");
		}catch(Exception e)
		{
			System.out.println("���ڰ� �ƴ� ���ڿ� �Դϴ�.");
		}
		
		str = "1,234,234aaaa";
		String msg = "���ڷ� �� ���ڿ� �Դϴ�.";
		try 
		{
			str = str.replace(",", "");
			Integer.parseInt(str);
		}catch(Exception e)
		{
			msg = "���ڰ� �ƴ� ���ڿ� �Դϴ�.";
		}
		System.out.println(msg);
		
	}
	

}
