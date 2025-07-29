//22. �ζ� �����ϱ�
import java.util.*;

public class LottoTest 
{
	public static void main(String[] args) 
	{
		//�ζ� ��ȣ(1~45) 1��(1��)�� �����Ͻÿ�.
		int[] lotto = { 0, 0, 0, 0, 0, 0 };
		
		for(int i = 0 ; i < 6; i++)
		{
			int n = ((int)(Math.random() * 1000000)) % 45 + 1;
			//���� ������� ��ȣ�� �ߺ��Ǵ��� �˻�
			boolean dup = false; //�ߺ����� �˻�� (�÷��� ����)
			for(int j = 0 ; j < i; j++)
			{
				if( n == lotto[j] )
				{
					//���� ��ȣ�� �ߺ�
					dup = true;
					break;
				}
			}
			if( dup == false) lotto[i] = n;
			else i--;
			//System.out.printf("[%02d]",n);
		}
		
		Arrays.sort(lotto);
		 
		for(int x : lotto)
		{
			System.out.printf("[%02d]",x);
		}
		System.out.println("");
	}
}
