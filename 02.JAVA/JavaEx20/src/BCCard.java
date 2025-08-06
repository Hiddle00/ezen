//BC 카드사
public class BCCard implements Card
{
	String company;
	
	
	@Override
	public void DoPay() 
	{
		System.out.println("BC카드 결제 완료.");
	}

}
