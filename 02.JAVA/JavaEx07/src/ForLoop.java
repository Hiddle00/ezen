//15. for 반복문 연습
public class ForLoop 
{
	public static void main(String[] args) 
	{
		/*
		int n = 1;      //초기값
		while( n < 10 ) //종료 조건
		{
			System.out.println(n);
			n++;        //증감 조건
		}
		*/
		//for문 이용하여 1~10까지 출력하는 예제
		for( int n = 1 ; n <= 10 ; n++ )
		{
			System.out.println(n);
		}
		
		//for 문을 이용하여 1 ~ 100까지 합계 출력
		//변수 : n, sum 활용
		int sum = 0;
		for(int n = 1; n <= 100 ; n++)
		{
			//sum = sum + n;
			sum += n;
		}
		System.out.println("합계:" + sum);		
		
		//for 문을 이용하여 1 ~ 100까지 
		//짝수합계,홀수합계, 전체합계를 출력하세요.
		//변수 : n, sum, even_sum, odd_sum
		sum = 0;          //전체합계
		int even_sum = 0; //짝수합계
		int odd_sum  = 0; //홀수합계
		for(int n = 1; n <= 100; n++) 
		{
			if( n % 2 == 0)
			{
				even_sum += n; //짝수 합계 구하기
			}else
			{
				odd_sum += n; //홀수 합계 구하기
			}
			sum += n; //전체합계 
		}		
		System.out.println("홀수합계:" + odd_sum);
		System.out.println("짝수합계:" + even_sum);
		System.out.println("전체합계:" + sum);			
		
	}
}


