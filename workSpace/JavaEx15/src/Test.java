//38. MyLotto 클래스를 이용한 로또게임 생성
public class Test 
{

	public static void main(String[] args) 
	{
		MyLotto lotto = new MyLotto();
		
//		int r = lotto.GetRendom(45);
//		System.out.println(r);
		
		//로또 번호 6개를 생성한다.
		int n = 5;
		for(int i = 0; i <= n; i++)
		{
			lotto.PickUp(45);
		}
//		생성된 로또 번호를 출력한다.
//		lotto.PrintInfo();
		
	}

}
