import java.util.Arrays;

//37.객체지향 프로그래밍을 통한 로또게임 생성
public class MyLotto 
{
	int[] lotto = {0, 0, 0, 0, 0, 0};
	
	// 1 ~ 45의 랜텀 번호를 얻는다
	public int GetRendom(int n)
	{
		int rnd = (int)(Math.random() * 100000) % n + 1;
		return rnd;
	}
	
	//로또 번호 6개를 생성한다.
	public void PickUp(int n)
	{
		for (int x = 0; x < lotto.length; x++)
		{
			int rnd = GetRendom(n);
			lotto[x] = rnd;
			
			//기존에 추출한 값과 일치하는 원소가 있는지 검사
			for(int y = 0; y < x; y++)
			{
				if(rnd == lotto[y])
				{
					x--;
					break;
				}
			}
		}
		
		//오름차순으로 정렬
		Arrays.sort(lotto);
		
		PrintInfo();
	}
	
	//생성된 로또 번호를 출력한다.
	public void PrintInfo()
	{
		for(int v : lotto)
		{
			System.out.printf("[%02d]", v);
		}
		System.out.println("");
	}
	
}
