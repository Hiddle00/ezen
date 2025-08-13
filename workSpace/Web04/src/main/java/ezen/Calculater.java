package ezen;

public class Calculater {
	public static int DoCal(String x, String y, String op)
	{
		int ix;
		int iy;
		int iz = 0;
		try {
			ix = Integer.parseInt(x.replace(",",""));
			iy = Integer.parseInt(y.replace(",",""));
			switch(op)
			{
			case "+":
				return ix + iy;
			case "-":
				return ix - iy;
			case "*":	
				return ix * iy;
			case "/":	
				return ix / iy;
			}
		}catch(Exception e) {}
		return iz;
	}
}
