//36. 구조적 프로그래밍을 통한 로또게임 생성
public class LotteryGame 
{

	public static void main(String[] args) 
	{
		//1 ~ 45까지의 숫자를 이용하여 6개의 로또번호를 생성하시오.
		int[] lotto = {0, 0, 0, 0, 0, 0};
		int x;
		for(x = 0; x < lotto.length; x++)
		{
			int r = (int)(Math.random() * 100000) % 45 + 1;
			lotto[x] = r;
			for(int y = 0; y < x; y++)
			{
				if(r == lotto[y])
				{
					x--;
					break;
				}
			}
		}
		for(int ln : lotto)
		{
			System.out.printf("[%02d]",ln);
		}
		
	}

}
