// 30. 클래스(Class) 메쏘드 연습
public class Calculater 
{
	//메소드 연습
	//리턴타입 메소드이름(매개변수)와 같이 만듬
	
//	public int Add(int x, int y)
//	{
//		System.out.println("add가 실행 됨");
//		System.out.println("x=" + x);
//		System.out.println("y=" + y);
//		return (x + y);
//	}
	
	//더하기
	public int Plus(int x, int y)
	{
		return (x + y);
	}
	
	public double Plus(double x, double y)
	{
		return (x + y);
	}
	
	public int Plus(String x, String y)
	{
		return (Integer.parseInt(x) + Integer.parseInt(y));
	}
	
	//빼기
	public int Minus(int x, int y)
	{
		return (x - y);
	}
	
	public double Minus(double x, double y)
	{
		return (x - y);
	}
	
	public int Minus(String x, String y)
	{
		return (Integer.parseInt(x) - Integer.parseInt(y));
	}
	
	//곱하기
	public int Mux(int x, int y)
	{
		return (x * y);
	}
	
	public double Mux(double x, double y)
	{
		return (x * y);
	}
	
	public int Mux(String x, String y)
	{
		return (Integer.parseInt(x) * Integer.parseInt(y));
	}
	
	//나누기
	public int Divide(int x, int y)
	{
		return (x / y);
	}
	
	public double Divide(double x, double y)
	{
		return (x / y);
	}
	
	public int Divide(String x, String y)
	{
		return (Integer.parseInt(x) / Integer.parseInt(y));
	}
	
	public int DoCal(String x, String y, String op)
	{
		if(op.equals("+")) return Integer.parseInt(x) + Integer.parseInt(y);
		if(op.equals("-")) return Integer.parseInt(x) - Integer.parseInt(y);
		if(op.equals("*")) return Integer.parseInt(x) * Integer.parseInt(y);
		if(op.equals("/")) return Integer.parseInt(x) / Integer.parseInt(y);
		return 0;
	}
	
	public double DoCal(double x, double y, String op)
	{
		if(op.equals("+")) return Plus(x , y);
		if(op.equals("-")) return Minus(x , y);
		if(op.equals("*")) return Mux(x , y);
		if(op.equals("/")) return Divide(x , y);
		return 0;
	}
	
	public int DoCal(int x, int y, String op)
	{
		switch(op)
		{
		case "+":
			return Plus(x , y);
		case "-":
			return Minus(x , y);
		case "*":
			return Mux(x , y);
		case "/":
			return Divide(x , y);
		default:
			return 0;
		
		}
	}
}
