public class Test 
{
	public static void main(String[] args) 
	{
		int x = 1;
		
		while( x <= 9)
		{
			int y = 1;			
			while(y <= (9-x))
			{
				System.out.print("*");
				y = y + 1;
			}			
			System.out.println("");
			x++;
		}
	}

}
