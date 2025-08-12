//15. for 반복문 연습
public class ForLoop 
{

	public static void main(String[] args) 
	{
		//for문 이용하여 1~10 까지 출력하는 예제
		for(int n = 1; n <= 10; n++) //~하는 동안 for(초기값;종료조건;증감조건)
		{
		 System.out.println(n);   
		}

		//for문을 이용하여 1 ~ 100까지 합계 출력
		//변수 :n, sum 활용
		int sum = 0;
		for(int n = 1; n <= 100; n++)
		{
			sum = sum + n;
		}
		System.out.println(sum);
		
		//for문을 이용하여 1 ~ 100까지
		//짝수합계,홀수합계,전체합계를 출력하세요.
		//변수: n, sum, even_sum, odd_sum
		sum = 0;
		int even_sum = 0;
		int odd_sum = 0;
		for(int n = 1; n <= 100; n++)
		{
			sum += n;
			if(n % 2 == 0)
			{
				even_sum += n;
			}else
			{
				odd_sum += n;
			}
		}
		sum = even_sum + odd_sum;
		System.out.println("짝수합계: " + even_sum);
		System.out.println("홀수합계: " + odd_sum);
		System.out.println("전체합계: " + sum);
	}

}
