//07. 조건문 if 연습
public class Condition 
{

	public static void main(String[] args) 
	{
		//if 문법 연습
		int n = 10;
		boolean f;
		f = (n % 2 == 0);
		if(f)
		{
			System.out.println(n + "은 짝수입니다.");
		}
		
		n = 20;
		if( n % 2 == 0 )
		{
			System.out.println(n +"은 짝수입니다.");
		}
		
		n = 12;
		if( n % 2 == 0)
		{
			System.out.println(n + "은 짝수입니다.");
		}else
		{
			System.out.println(n + "은 홀수입니다.");
		}
		
		int age = 17;
		//만 19세 이상이면 "음주 가능"
		//그렇지 않으면 "음주 불가"
		if ( age >= 19 )
		{ 
			System.out.println("음주 가능");
		}else
		{
			System.out.println("음주 불가");
		}
		
		int x = 15;
		if ( x % 3 == 0 && x % 5 == 0)
		{ 
			System.out.println("3과 5의 공배수입니다.");
		}else
		{
			System.out.println("공배수가 아닙니다.");
		}
		
		//나이가
		//20살 미만이면 "미성년"
		//20~29살 이면 "20대"
		//30~39살 이면 "30대"
		//40~49살 이면 "중년"
		//50~59살 이면 "장년"
		//60살 이상이면 "노년" 이라고 출력하세요.
		
		age = 33;
		if ( age < 20 )
		{
			System.out.println("미성년");
		}else if ( age <= 29)
		{
			System.out.println("20대");
		}else if ( age <= 39)
		{
			System.out.println("30대");
		}else if ( age <= 49)
		{
			System.out.println("중년");
		}else if ( age <= 59)
		{
			System.out.println("장년");
		}else 
		{
			System.out.println("노년");
		}
		
		//점수가
		//90~100 : A 출력
		//80~89 : B 출력
		//70~79 : C 출력
		//60~69 : D 출력
		//60점 이하 : 낙제 출력
		int score = 95;
		if (score >= 90)
		{
			System.out.println("A");
		}else if(score >= 80)
		{
			System.out.println("B");
		}else if(score >= 70)
		{
			System.out.println("C");
		}else if(score >= 60)
		{
			System.out.println("D");
		}else
		{
			System.out.println("낙제");
		}
		
		//나이와(age) 성별(gender)
		//나이가 20살 미만이고 gender = 0 이면 "미성년=여자"
		//나이가 20살 미만이고 gender = 1 이면 "미성년=남자"
		//나이가 20살 이상이고 gender = 0 이면 "성인=여자"
		//나이가 20살 이상이고 gender = 1 이면 "성인=남자"
		int gender = 1;
		if (age < 20 && gender == 0)
		{
			//20살 미만 gender = 0
			System.out.println("미성년 = 여자");
		}else if (age < 20 && gender == 1)
		{
			//20살 미만 gender = 1
			System.out.println("미성년 - 남자");
		}else if (gender == 1)
		{
			System.out.println("성인 - 여자");
		}else
		{
			//20살 이상 gender = 1
			System.out.println("성인 - 남자");
		}
		
	}

}
