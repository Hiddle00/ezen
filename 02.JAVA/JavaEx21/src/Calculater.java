//계산기 클래스
public class Calculater 
{
	public int Divide(int x, int y) throws Exception
	{
		try
		{
			return x / y;
		}catch(Exception e)
		{
			throw new Exception("0으로 나누기를 수행 할 수 없습니다.");
		}
	}
}
