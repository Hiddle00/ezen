package ezen;

public class Calculater 
{
	public static int DoCal(String x,String y,String op)
	{
		int iz = 0;
		
		try
		{
			int ix = 0;
			int iy = 0;
			
			x = x.replace(",", "");
			y = y.replace(",", "");
			
			ix = Integer.parseInt(x);
			iy = Integer.parseInt(y);
			switch(op)
			{
			case "+": iz = ix + iy; break;
			case "-": iz = ix - iy; break;
			case "*": iz = ix * iy; break;
			case "/": iz = ix / iy; break;
			}
		}catch(Exception e){}
		return iz;		
	}
}
