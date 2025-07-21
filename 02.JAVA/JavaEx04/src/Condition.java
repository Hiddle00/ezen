//07. 조건문 if 연습
public class Condition 
{
	public static void main(String[] args) 
	{
		//if 문법 연습
		int n = 10;
		boolean f;
		f = ( n % 2 == 0);
		if( f )
		{
			System.out.println(n + "은 짝수입니다.");
		}
		
		n = 20;
		if( n % 2 == 0 )
		{
			System.out.println(n + "은 짝수입니다.");
		}		
		
		n = 11;
		if( n % 2 == 0 )
		{
			System.out.println(n + "은 짝수입니다.");
		}else
		{
			System.out.println(n + "은 홀수입니다.");
		}		
		
		int age = 27;
		//만 19세 이상이면 "음주 가능"
		//그렇지 않으면 "음주 불가"
		if( age >= 19 )
		{
			System.out.println("음주 가능");
		}else
		{
			System.out.println("음주 불가");
		}
		
		//어떤 값이 3과 5의 공배수이면
		//"3과 5의 공배수입니다."라고 출력하고,
		//그렇지 않으면 "공배수가 아닙니다."
		int x = 15;
		if( ( x % 3 == 0 )  &&  ( x % 5 == 0 ) )
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
		age = 57;
		if( age < 20 )
		{
			System.out.println("미성년");
		}else if ( age <= 29 )
		{
			System.out.println("20대");
		}else if ( age <= 39 )
		{
			System.out.println("30대");
		}else if ( age <= 49 )
		{
			System.out.println("중년");
		}else if ( age <= 59 )
		{
			System.out.println("장년");
		}else
		{
			System.out.println("노년");
		}
		
		//점수가
		//90~100 : A 출력
		//80~89  : B 출력
		//70~79  : C 출력
		//60~69  : D 출력
		//60점 이하 : 낙제 출력
		int score = 55;
		if( score >= 90 )
		{
			//90점 이상
			System.out.println("A 학점");
		}else if( score >= 80 )
		{
			//80점이상
			System.out.println("B 학점");
		}else if( score >= 70 )
		{
			//70점이상
			System.out.println("C 학점");
		}else if( score >= 60 )
		{
			//60점이상
			System.out.println("D 학점");
		}else
		{
			//60점 미만
			System.out.println("낙제 학점");
		}
		
		//나이(age)와 성별(gender) 
		//나이가 20살 미만이고 gender = 0 이면 "미성년-여자"
		//나이가 20살 미만이고 gender = 1 이면 "미성년-남자"
		//나이가 20살 이상이고 gender = 0 이면 "성인-여자"
		//나이가 20살 이상이고 gender = 1 이면 "성인-남자"
		age = 22;
		int gender = 1;
		
		//방법 1 (초급자용)
		if( gender == 0 )
		{
			//여자라는 의미
			if( age < 20)
			{
				//미성년
				System.out.println("미성년-여자");
			}else
			{
				//성년
				System.out.println("성인-여자");
			}
		}else
		{
			//남자라는 의미
			if( age < 20)
			{
				//미성년
				System.out.println("미성년-남자");
			}else
			{
				//성년
				System.out.println("성인-남자");
			}			
		}
		
		//방법 2 (중급자용)
		if( age < 20 && gender == 0)
		{
			//나이가 20살 미만이고 gender = 0 이면 "미성년-여자"
			System.out.println("미성년-여자");
		}else if( age < 20 && gender == 1)
		{
			//나이가 20살 미만이고 gender = 1 이면 "미성년-남자"
			System.out.println("미성년-남자");
		}else if( age > 20 && gender == 0)
		{
			//나이가 20살 이상이고 gender = 0 이면 "성인-여자"
			System.out.println("성인-여자");
		}else 
		{
			//나이가 20살 이상이고 gender = 1 이면 "성인-남자"
			System.out.println("성인-남자");
		}
		
	}
}

