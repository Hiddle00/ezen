//19. Null과 참조타입
public class NullTest 
{

	public static void main(String[] args) 
	{
		//기본타입에서 "=="은 값이 같은지 비교
		int a = 10;
		int b = 10;
		if(a == b)
		{
			System.out.println("a와 b는 동일한 값입니다.");
		}else
		{
			System.out.println("a와 b는 서로 다른 값입니다.");
		}
		
		//참조타입에서 "=="은 가리키는 주소가 동일한지 비교
		int[] aryA = {11, 22, 33};
		int[] aryB = {11, 22, 33};
		int[] aryC = aryA;
		if (aryA == aryB)
		{
			System.out.println("aryA와 aryB는 동일한 주소입니다.");
		}else
		{
			System.out.println("aryA와 aryB는 서로 다른 주소입니다.");
		}
		if (aryA == aryC)
		{
			System.out.println("aryA와 aryC는 동일한 주소입니다.");
		}else
		{
			System.out.println("aryA와 aryC는 서로 다른 주소입니다.");
		}
		
		//NULL은 값을 가리키는 주소가 없음
		aryC = null;
		if(aryA != null)
		{
			System.out.println("aryA는 NUll이 아닙니다.");
		}
		if(aryC == null)	
		{
			System.out.println("aryC는 NUll입니다.");
		}
		
		//실수형 배열예제
		double[] aryX = {1.1, 1.2};
		double[] aryY = aryX;
				
		//aryX와 aryY는 동일한 주소를 가리키고 있음
		aryY[0] = 3.3;
		System.out.println(aryX[0]);
	}

}
