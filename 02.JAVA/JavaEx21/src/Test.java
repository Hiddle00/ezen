public class Test 
{
	public static void main(String[] args) 
	{
		Calculater c = new Calculater();
		try
		{
			int z = c.Divide(100, 0);
			System.out.println(z);
		}catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램이 종료 되었습니다.");
		
	}
}

