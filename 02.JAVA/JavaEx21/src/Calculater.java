//���� Ŭ����
public class Calculater 
{
	public int Divide(int x, int y) throws Exception
	{
		try
		{
			return x / y;
		}catch(Exception e)
		{
			throw new Exception("0���� �����⸦ ���� �� �� �����ϴ�.");
		}
	}
}
