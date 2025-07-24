//22. 로또 조합하기
import java.util.*;
public class LottoTest 
{

	public static void main(String[] args) 
	{
		//로또 번호( 1 ~ 45 )
		int[] lotto = { 0, 0, 0, 0, 0, 0};
		int n = ((int)(Math.random()*100000)) % 45 + 1;
//		System.out.println(n);
		
		for(int i = 0; i < 6; i++ )
		{
			n = ((int)(Math.random()*100000)) % 45 + 1;
//			System.out.printf("%02d",n);
			//기존 만들어진 번호와 중복되는지 검사
			boolean dup = false;	//중복여부 검사용 (플래그 변수)
			for(int j = 0; j < i; i++)
			{
				if(n == lotto[i])
				{
					//기존 번호와 중복
					dup = true;
					break;
				}
			}
			if(dup == false) lotto[i] = n;
			else i--;
			 
		}
		
		Arrays.sort(lotto);
		
		for(int i : lotto)
		{
			System.out.printf("[%02d]",i);
		}
		System.out.println("");
	}

}
