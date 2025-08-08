//다형성을 이용한 카드 결제
public class Test 
{
	public static void main(String[] args) 
	{
		int  type = 1; //0-BC카드, 1-VISA카드
		Card card = null;
		switch(type)
		{
		case 0:
			card = new BCCard();
			break;
		case 1:
			card = new VISACard();
			break;			
		}
		card.DoPay();
	}
}
