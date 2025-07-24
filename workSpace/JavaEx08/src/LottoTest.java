//22. �ζ� �����ϱ�
import java.util.*;
public class LottoTest 
{

	public static void main(String[] args) 
	{
		//�ζ� ��ȣ( 1 ~ 45 )
		int[] lotto = { 0, 0, 0, 0, 0, 0};
		int n = ((int)(Math.random()*100000)) % 45 + 1;
//		System.out.println(n);
		
		for(int i = 0; i < 6; i++ )
		{
			n = ((int)(Math.random()*100000)) % 45 + 1;
//			System.out.printf("%02d",n);
			//���� ������� ��ȣ�� �ߺ��Ǵ��� �˻�
			boolean dup = false;	//�ߺ����� �˻�� (�÷��� ����)
			for(int j = 0; j < i; i++)
			{
				if(n == lotto[i])
				{
					//���� ��ȣ�� �ߺ�
					dup = true;
					break;
				}
			}
			if(dup == false) lotto[i] = n;
			else i--;
			 
		}
		
		Arrays.sort(lotto);
		
		for(int i : lotto)
		{
			System.out.printf("[%02d]",i);
		}
		System.out.println("");
	}

}
