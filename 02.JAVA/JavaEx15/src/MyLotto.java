import java.util.Arrays;

//37. 객체지향 프로그래밍을 통한 로또게임 생성
public class MyLotto 
{
	int []lotto = { 0, 0, 0, 0, 0, 0 };	
	
	//1-45의 랜덤값을 얻기
	public int GetRandom()
	{
		int rnd =  (int)(Math.random() * 10000) % 45 + 1;
		return rnd;
	}
	
	//로또 번호 6개를 생성한다.
	public void PickUP()
	{
		//1~45사이의 랜덤한 값을 만들어 낸다.
		for(int i = 0 ; i < lotto.length; i++) 
		{
			int rnd = GetRandom();
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
		
		//오름차순으로 정렬한다.
		Arrays.sort(lotto);
		
		PrintInfo();
	}
	
	//생성된 로또 번호를 출력한다.
	public void PrintInfo() 
	{
		for(int v : lotto)
		{
			//System.out.print("[" + v + "]");
			System.out.printf("[%02d]",v);
		}
		System.out.println("");
	}	
}
