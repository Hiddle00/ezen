//10. while 반복문 연습
public class WhileLoop 
{
	public static void main(String[] args) 
	{
		//while 문을 이용하여 1 ~ 10까지 출력
		int n = 0;
		while( n <  10 )
		{
			n = n + 1;
			System.out.println("n=" + n);
		}
		
		//while 문을 이용하여 1 ~ 10까지 짝수만 출력하세요.
		n = 0;	
		while( n <  10 )
		{
			n = n + 2;
			System.out.println("n=" + n);
		}		
		
		
		//while 문을 이용하여 1 ~ 10까지 짝수만 출력하세요.
		//단, if문을 이용하시오.
		n = 0;
		while( n <  10 )
		{
			n = n + 1;
			if( n % 2 == 0)
			{
				System.out.println("n=" + n);
			}
		}	
		
		//while문을 이용하여 1 ~ 100까지의 합계를 출력하세요.
		n = 1;
		int sum = 0;
		while( n <= 100 )
		{			
			sum = sum + n;
			n = n + 1;
		}
		System.out.println("n=" + n);
		System.out.println("sum=" + sum);
		
		
		//while문을 이용하여 1 ~ 100까지의 짝수의 합계를 출력하세요.
		n = 0;
		sum = 0;
		while( n <= 100 )
		{			
			sum = sum + n;
			n = n + 2;
		}
		System.out.println("n=" + n);
		System.out.println("sum=" + sum);	
		
		//while문을 이용하여 1 ~ 100까지의 홀수와 짝수의 합계를 
		//각각 구하여 출력하세요.
		n = 0;
		int even_sum = 0; //짝수의 합계
		int odd_sum  = 0; //홀수의 합계
		while( n <= 100 )
		{
			if( n % 2 == 0)
			{				
				even_sum += n; //n은 짝수
			}else
			{				
				odd_sum += n;  //n은 홀수
			}
			n++;
		}
		System.out.println("짝수합계:" + even_sum);
		System.out.println("홀수합계:" + odd_sum);
		System.out.println("합계:" + (even_sum + odd_sum));
		
	}
}

