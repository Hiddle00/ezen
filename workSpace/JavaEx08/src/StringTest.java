//20. 문자열 다루기
public class StringTest 
{

	public static void main(String[] args) 
	{
//		int n = 10;
//		string s2 = n;
		//문자열 배열
		String[] name = {"홍길동", "성춘향", "이순신"};
		for(int i = 0; i < name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		//문자열 치환 (중요)
		String strNum1 = "1,111";
		String strNum2 = "2,222";
		strNum1 = strNum1.replace("," , "");
		strNum2 = strNum2.replace("," , "");
		System.out.println(strNum1);
		System.out.println(strNum2);
		
		//문자열을 숫자로 변환
		int Num1 = Integer.parseInt(strNum1);
		int Num2 = Integer.parseInt(strNum2);
		int sum = Num1 + Num2;
		System.out.println("합계 : " + sum);
				
		//숫자를 문자열로 변환
		int    n1 = 123;
		String s1 = "";
		
		//[방법1] : 문자열 결합(+기호)
		s1 = s1 + n1;
		System.out.println(s1);
		//[방법2] : Integer 객체 활용
		s1 = Integer.toString(n1);
		System.out.println(s1);
		
		//향상된 for문
		int ary[] = {11, 22, 33, 44};
		for(int i = 0; i < ary.length; i++)
		{
			System.out.println(ary[i]);
		}
		
		for(int n : ary)
		{
			System.out.println(n);
		}
		
		String[] aryname = {"홍길동", "성춘향", "이순신"};
		for(String n : aryname)
		{
			System.out.println(n);
		}
		
		//문자열을 배열로 변환
		//이때, 이름에 있는 공백을 제거 후 출력하세요
		String nameList = "전 우치/홍 길동/김 유신/세종 대왕";
		nameList = nameList.replace(" ", "");
		String[] nameAry = nameList.split("/");
		for(String nm : nameAry)
		{
//			nm = nm.replace(" ", "");
			System.out.println(nm);
		}
		
		//다음 문자열에서 학생들의 점수합계와 평균을 구하여 출력하세요.
		String student = "공공일:30,공공이:45,공공삼:69,공공사:40";
		int    score_sum = 0; //점수합계
		int    score_avg = 0; //평균
		String[] stuAry = student.replace(":", ",").split(",");
		for(int i = 1; i < stuAry.length ; i += 2)
		{
			score_sum += Integer.parseInt(stuAry[i]);
		}
		score_avg = score_sum / (stuAry.length / 2);
		System.out.println(score_sum);
		System.out.println(score_avg);
		
		
		//다음 전화번호부를 이용하여 아래와 같이 재난 발생 문자를 발송하세요.
		//[010-1111-1111]님 전주지역 홍수경보가 발효되었습니다.
		//[010-1111-2222]님 전주지역 홍수경보가 발효되었습니다.
		//[010-1111-3333]님 전주지역 홍수경보가 발효되었습니다.
		String tel = "010-1111-1111,010-1111-2222,010-1111-3333";
		String msg = "{tel}님 전주지역 대설주의보가 발효되었습니다.";
		String[] telAry = tel.split
		
	}

}
