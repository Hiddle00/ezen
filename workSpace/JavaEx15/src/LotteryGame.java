//36. ������ ���α׷����� ���� �ζǰ��� ����
public class LotteryGame 
{

	public static void main(String[] args) 
	{
		//1 ~ 45������ ���ڸ� �̿��Ͽ� 6���� �ζǹ�ȣ�� �����Ͻÿ�.
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
