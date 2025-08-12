//08. 삼항 연산자
public class Trinomial 
{

	public static void main(String[] args) 
	{
		int n = 16;
		//if문법을 이용하여
		// n이 짝수면 "짝수", 홀수이면 "홀수"라고 출력하시오.
		
		if (n % 2 == 0)
		{
			System.out.println("짝수");
		}else
		{
			System.out.println("홀수");
		}
		
			   n = 16;
		String s = "";
		if (n % 2 == 0)
		{
			s = "짝수";
		}else
		{
			s = "홀수";
		}
		System.out.println(s);
		
		//삼항 연산자 연습
		n = 3;
		s = (n % 2 == 0) ? "짝수" : "홀수";
		System.out.println(s);
		
		n = 12;
		System.out.println((n % 2 == 0 ) ? n + "은(는) 짝수입니다." : n + "은(는) 홀수입니다.");
		//나이 (age)가 20살 미만이면 "미성년", 20살 이상이면 "성년"이라고 출력하시오
		int age = 17;
		s = (age < 20 ) ? "미성년" : "성년";
		System.out.println(s);
		
		age = 45;
		System.out.println((age < 20 ) ? "미성년" : "성년");
		
		age = 70;
		System.out.println((age < 20)? "미성년" : (age <= 29)? "20대" : (age <= 39)? "30대" : (age <= 49)? "중년" : (age <= 59)? "장년" : "노년");
		
	}

}
