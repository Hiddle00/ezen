//�������� �̿��� ī�� ����
public class Test 
{
	public static void main(String[] args) 
	{
		int  type = 1; //0-BCī��, 1-VISAī��
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
