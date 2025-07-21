//13. while 문법의 break, continue
public class WhileBreak 
{

	public static void main(String[] args) 
	{
		//while문과 break를 사용하여 1~10까지 출력하세요.
		int n = 1;
		while(true)
		{
			System.out.println(n);
			n++;
			if(n > 10)
			{
				break;
			}
		}
		
		int x = 0;
		while(x <= 100)
		{
			if(x % 2 == 1)
			{
				x++;
				continue;
			}
			System.out.println(x);
			x++;
		}
	}

}
