
public class Calculator 
{
	public int Divide(int x, int y) throws Exception
	{
		try 
		{
			int z = x / y;
			return z;
		}catch(Exception e)
		{
//			return 0;
			throw new Exception("0으로 나눌 수 없음.");
		}
		
		
		
		
	}
}
