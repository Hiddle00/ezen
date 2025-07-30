import java.util.Arrays;

//37.��ü���� ���α׷����� ���� �ζǰ��� ����
public class MyLotto 
{
	int[] lotto = {0, 0, 0, 0, 0, 0};
	
	// 1 ~ 45�� ���� ��ȣ�� ��´�
	public int GetRendom(int n)
	{
		int rnd = (int)(Math.random() * 100000) % n + 1;
		return rnd;
	}
	
	//�ζ� ��ȣ 6���� �����Ѵ�.
	public void PickUp(int n)
	{
		for (int x = 0; x < lotto.length; x++)
		{
			int rnd = GetRendom(n);
			lotto[x] = rnd;
			
			//������ ������ ���� ��ġ�ϴ� ���Ұ� �ִ��� �˻�
			for(int y = 0; y < x; y++)
			{
				if(rnd == lotto[y])
				{
					x--;
					break;
				}
			}
		}
		
		//������������ ����
		Arrays.sort(lotto);
		
		PrintInfo();
	}
	
	//������ �ζ� ��ȣ�� ����Ѵ�.
	public void PrintInfo()
	{
		for(int v : lotto)
		{
			System.out.printf("[%02d]", v);
		}
		System.out.println("");
	}
	
}
