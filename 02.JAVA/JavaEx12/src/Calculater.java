//30. 클래스(Class) 메쏘드 연습
public class Calculater 
{
	//더하기
	public int Plus(int x,int y)
	{
		return x + y;
	}
	
	public double Plus(double x,double y)
	{
		return x + y;
	}
	
	public int Plus(String x,String y)
	{
		return Integer.parseInt(x) + Integer.parseInt(y);
	}
	
	//빼기
	public int Minus(int x,int y)
	{
		return x - y;
	}
	
	public double Minus(double x,double y)
	{
		return x - y;
	}
	
	public int Minus(String x,String y)
	{
		return Integer.parseInt(x) - Integer.parseInt(y);
	}	
	
	//곱하기
	public int Mux(int x,int y)
	{
		return x * y;
	}
	
	public double Mux(double x,double y)
	{
		return x * y;
	}
	
	public int Mux(String x,String y)
	{
		return Integer.parseInt(x) * Integer.parseInt(y);
	}
	
	//나누기
	public int Divide(int x, int y)
	{
		return x/y;
	}
	
	public double Divide(double x, double y)
	{
		return x/y;
	}
	
	public int Divide(String x,String y)
	{
		return Integer.parseInt(x) / Integer.parseInt(y);
	}	
		
	public int DoCal(int x,int y,String op)
	{
		if(op.equals("+"))
		{
			return Plus(x,y);
		}
		if(op.equals("-"))
		{
			return Minus(x,y);
		}
		if(op.equals("*"))
		{
			return Mux(x,y);
		}
		if(op.equals("/")) 
		{
			return Divide(x,y);
		}
		
		return 0;		
	}
	
}
