//38. MyLotto Ŭ������ �̿��� �ζǰ��� ����
public class Test 
{

	public static void main(String[] args) 
	{
		MyLotto lotto = new MyLotto();
		
//		int r = lotto.GetRendom(45);
//		System.out.println(r);
		
		//�ζ� ��ȣ 6���� �����Ѵ�.
		int n = 5;
		for(int i = 0; i <= n; i++)
		{
			lotto.PickUp(45);
		}
//		������ �ζ� ��ȣ�� ����Ѵ�.
//		lotto.PrintInfo();
		
	}

}
