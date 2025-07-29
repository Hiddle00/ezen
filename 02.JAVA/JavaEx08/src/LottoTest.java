//22. 로또 조합하기
import java.util.*;

public class LottoTest 
{
	public static void main(String[] args) 
	{
		//로또 번호(1~45) 1개(1줄)을 생성하시오.
		int[] lotto = { 0, 0, 0, 0, 0, 0 };
		
		for(int i = 0 ; i < 6; i++)
		{
			int n = ((int)(Math.random() * 1000000)) % 45 + 1;
			//기존 만들어진 번호와 중복되는지 검사
			boolean dup = false; //중복여부 검사용 (플래그 변수)
			for(int j = 0 ; j < i; j++)
			{
				if( n == lotto[j] )
				{
					//기존 번호와 중복
					dup = true;
					break;
				}
			}
			if( dup == false) lotto[i] = n;
			else i--;
			//System.out.printf("[%02d]",n);
		}
		
		Arrays.sort(lotto);
		 
		for(int x : lotto)
		{
			System.out.printf("[%02d]",x);
		}
		System.out.println("");
	}
}
