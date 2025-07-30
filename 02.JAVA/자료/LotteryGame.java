import java.util.Arrays;

//36. ������ ���α׷����� ���� �ζǰ��� ����
public class LotteryGame 
{
	public static void main(String[] args) 
	{
		//1~45������ ���ڸ� �̿��Ͽ� 6���� �ζǹ�ȣ��
		//�����Ͻÿ�.
		int []lotto = { 0, 0, 0, 0, 0, 0 };
		
		//1~45������ ������ ���� ����� ����.
		for(int i = 0 ; i < lotto.length; i++) 
		{
			int rnd =  (int)(Math.random() * 10000) % 45 + 1;
			lotto[i] = rnd;
			
			//������ ������ ���� ��ġ�ϴ� ���Ұ� �ִ��� �˻�
			for(int j = 0 ; j < i; j++)
			{		
				if(rnd == lotto[j])
				{
					i--;
					break;
				}
			}
			
		}
		
		//�迭�� ���� ������������ �����ϴ�.
		Arrays.sort(lotto);
		
		//�ζ� ��ȣ�� ����Ѵ�.
		for(int v : lotto)
		{
			System.out.print("[" + v + "]");
		}
		
		
	}
}


