//09. switch ~ case 문법 연습
public class CaseTest
{
	public static void main(String[] args) 
	{
		int gender = 0; //0-여자,1-남자
		//if 문장을 이용하여
		//gender가 0이면 "여자", 1이면 "남자" 그렇지 않으면
		//"알수없음"이라고 출력하세요.
		if( gender == 0 )
		{
			System.out.println("여자");
		}else if (gender == 1)
		{
			System.out.println("남자");
		}else
		{
			System.out.println("알수없음");
		}
		
		gender = 10;
		switch(gender)
		{
		case 0 :
			System.out.println("여자");
			break;
		case 1 :
			System.out.println("남자");
			break;
		default:
			System.out.println("알수없음");
			break;			
		}
		
		//어떤 값n에 대하여 짝수,홀수 출력하는 문장을
		//switch-case로 출력하시오.
		int n = 20;
		switch( n % 2 )
		{
		case 0:
			System.out.println("짝수");
			break;
		default:
			System.out.println("홀수");
			break;
		}
		
		//나이가 
		//20살 미만이면 "미성년"
		//20~29살 이면 "20대"
		//30~39살 이면 "30대"
		//40~49살 이면 "중년"
		//50~59살 이면 "장년"
		//60살 이상이면 "노년" 이라고 
		//switch~case를 이용하여 출력하세요.
		int age = 6;
		switch(age / 10)
		{
		case 0:
		case 1:	 System.out.println("미성년"); break;		
		case 2:	 System.out.println("20대");	 break;			
		case 3:	 System.out.println("30대");  break;						
		case 4:	 System.out.println("중년");	 break;						
		case 5:  System.out.println("장년");	 break;						
		default: System.out.println("노년");	 break;					
		}
	}
}
