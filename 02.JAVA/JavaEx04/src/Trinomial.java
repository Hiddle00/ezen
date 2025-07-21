//08. 삼항 연산자
public class Trinomial 
{
	public static void main(String[] args) 
	{
		int    n = 16;
		String s = "";
		
		//if 문법을 이용하여 
		//n이 짝수이면 "짝수", 홀수이면 "홀수"라고 출력하시오.
		if( n % 2 == 0 )
		{
			s = "짝수";
		}else
		{
			s = "홀수";
		}
		System.out.println(s);
		
		//삼항 연산자 연습
		n = 3;
		s = ( n % 2 == 0 ) ? "짝수" : "홀수";
		System.out.println(s);
		
		//삼항연산자를 이용하여
		//나이(age)가 20살 미만이면 "미성년",
		//20살 이상이면 "성년"이라고 출력하세요.
		int age = 17;
		System.out.println(( age < 20 ) ? "미성년" : "성년");
	}
}



