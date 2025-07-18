//09. switch ~ case 문법 연습
public class CaseTest 
{

	public static void main(String[] args) 
	{
		int gender = 0; //0-여자,1-남자
		if(gender == 0)
			//if 문장을 이용하여
			//gender가 0이면 "여자", 1이면 "남자" 그렇지 않으면
			//"알수없음"이라고 출력하세요.
		{
			System.out.println("여자");
		}else if(gender == 1)
		{
			System.out.println("남자");
		}else
		System.out.println("알수없음");
		
		gender = 10;
		switch(gender)
		{
		case 0:
			System.out.println("여자");
			break;
		case 1:
			System.out.println("남자");
			break;
		default:
			System.out.println("알수없음");
			break;
		}
		
		//어떤 값 n에 대하여 짝수, 홀수를 출력하는 문장을 switch-case로 출력하시오.
		int n =20;
		switch(n % 2)
		{
		case 0:
			System.out.println("짝수");
			break;
		case 1: //default: 로도 가능
			System.out.println("홀수");
			break;  //1값이 없는데도 두줄이 모두 출력?
		}
		
		//나이가
				//20살 미만이면 "미성년"
				//20~29살 이면 "20대"
				//30~39살 이면 "30대"
				//40~49살 이면 "중년"
				//50~59살 이면 "장년"
				//60살 이상이면 "노년" 이라고 출력하세요.
		int age = 10;
		switch(age / 10) //정수,실수,문자열 //대부분 정수를 사용한다.
		{
		case 0:
		case 1: System.out.println("미성년"); break;
		case 2: System.out.println("20대"); break;
		case 3: System.out.println("30대"); break;
		case 4: System.out.println("중년"); break;
		case 5: System.out.println("장년"); break;
		default: System.out.println("노년"); break;
		}
		
		//
				
	}

}
