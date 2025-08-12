//10. while 반복문 연습
public class WhileLoop 
{
//소프트종료, 하드종료
	public static void main(String[] args) 
	{
		int n = 0;
//		while(true)
//		{
//			n = n + 1;
//			System.out.println(n);
//		}
		
		boolean f = true;
		while(f)
		{
			n = n + 1;
			System.out.println(n);
			if(n >= 10)
			{
				f = false;
			}
		}
		
		n = 0;
		while(n < 10)
		{
			n = n + 1;
			System.out.println("n=" + n);
		}
		
		//while 문을 이용하여 1 ~ 10까지 짝수만 출력하세요.
//		string s = n % 2;
//		while()
		
		//while 문을 이용하여 1 ~ 10까지 짝수만 출력하시오.
		n = 0;
		while(++n < 10)
		{
			n = n + 1;
			System.out.println("n=" + n);
		}
		
		//while 문을 이용하여 1 ~ 10까지 짝수만 출력하시오.
		//단, if 문을 이용하시오.
		n = 0;
		while(n < 10)
		{
			n = n + 1;
			if(n % 2 == 0)
			System.out.println("n=" + n);
		}
		
		//while문을 이용하여 1부터 10까지 합계를 출력하세요.
			n = 0;
		int s = 0;
		while(n < 10) 
		{
			n = n + 1;
			s = n + s; // s += n;
			if(n >= 10)
			{
			System.out.println(s);
			}
		}
		System.out.println(n);
		
		n = 1;
		int sum = 0;
		while(n <= 10) 
		{
			sum = n + sum;
			n = n + 1;
		}
		System.out.println(sum);
		System.out.println(n);
		
		//while문을 이용하여 1 ~ 100까지의 합계를 출력하세요.
		n = 0;
		sum = 0;
		while(n <= 100) 
		{
			sum = n + sum; // sum += n;
			n = n + 2;	   // n += 2;
		}
		System.out.println(sum);
		System.out.println(n);
		
		//while문을 이용하여 1 ~ 100까지의 홀수와 짝수의 합계를 각각 구하시오.
		n = 0;
		int even_sum = 0; //짝수의 합계
		int odd_sum = 0; //홀수의 합계
		while(n <= 100) 
		{
			if (n % 2 == 0)	
			{
			even_sum = n + even_sum;
			}else
			{
			odd_sum = n + odd_sum;
			}
			n = n + 1;
		}
		
		n = 0;
		even_sum = 0; //짝수의 합계
		odd_sum = 0; //홀수의 합계
		while(++n <= 100) 
		{
			if (n % 2 == 0)	
			{
			even_sum += n;
			}else
			{
			odd_sum += n;
			}
			
		}
		
		n = 0;
		even_sum = 0; //짝수의 합계
		odd_sum = 0; //홀수의 합계
		while(n <= 100) 
		{
			if (n % 2 == 0)	even_sum += n++;
			else			odd_sum += n++;
		}
		System.out.println(even_sum);
		System.out.println(odd_sum);
	}

}
