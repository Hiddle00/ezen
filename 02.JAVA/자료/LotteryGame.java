import java.util.Arrays;

//36. 구조적 프로그래밍을 통한 로또게임 생성
public class LotteryGame 
{
	public static void main(String[] args) 
	{
		//1~45까지의 숫자를 이용하여 6개의 로또번호를
		//생성하시오.
		int []lotto = { 0, 0, 0, 0, 0, 0 };
		
		//1~45사이의 랜덤한 값을 만들어 낸다.
		for(int i = 0 ; i < lotto.length; i++) 
		{
			int rnd =  (int)(Math.random() * 10000) % 45 + 1;
			lotto[i] = rnd;
			
			//기존에 추출한 값과 일치하는 원소가 있는지 검사
			for(int j = 0 ; j < i; j++)
			{		
				if(rnd == lotto[j])
				{
					i--;
					break;
				}
			}
			
		}
		
		//배열의 값을 오름차순으로 정렬하다.
		Arrays.sort(lotto);
		
		//로또 번호를 출력한다.
		for(int v : lotto)
		{
			System.out.print("[" + v + "]");
		}
		
		
	}
}


