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
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
		
	}
}

