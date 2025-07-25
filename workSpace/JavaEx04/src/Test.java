
public class Test 
{

	public static void main(String[] args) 
	{
//		1~100사이의 값 중에서
		//3과 5의 공배수를 구하여 화면에 출력하시오.
		//for문과 변수n
		int n;
		for(n = 1; n < 101; n++)
		{
			if (n % 3 == 0 && n % 5 == 0)
			{
				System.out.println(n);
			}
		}
		
		//다음 연도가 윤년여부를 판단하여 "윤년입니다." 혹은 "윤년이 아닙니다."
		
		int year = 2014;
		if(year % 4 == 0)
		{
			System.out.println("윤년입니다.");
		}else
		System.out.println("윤년이 아닙니다.");
		
		year = 2000;
		if((year % 4 == 0) && (year % 100 == 0) || (year % 400 ==0))
		{
			
		}
	}

}
