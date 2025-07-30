//38. MyLotto 클래스를 이용한 로또게임 생성
public class Test 
{
	public static void main(String[] args) 
	{
		MyLotto lotto = new MyLotto();
		
		//로또 번호 6개를 생성한다.
		for(int i = 0 ; i < 5; i++)
		{
			lotto.PickUP();
		}
	}
}
