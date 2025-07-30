import java.util.Arrays;

//37. ��ü���� ���α׷����� ���� �ζǰ��� ����
public class MyLotto 
{
	int []lotto = { 0, 0, 0, 0, 0, 0 };	
	
	//1-45�� �������� ���
	public int GetRandom()
	{
		int rnd =  (int)(Math.random() * 10000) % 45 + 1;
		return rnd;
	}
	
	//�ζ� ��ȣ 6���� �����Ѵ�.
	public void PickUP()
	{
		//1~45������ ������ ���� ����� ����.
		for(int i = 0 ; i < lotto.length; i++) 
		{
			int rnd = GetRandom();
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
		
		//������������ �����Ѵ�.
		Arrays.sort(lotto);
		
		PrintInfo();
	}
	
	//������ �ζ� ��ȣ�� ����Ѵ�.
	public void PrintInfo() 
	{
		for(int v : lotto)
		{
			//System.out.print("[" + v + "]");
			System.out.printf("[%02d]",v);
		}
		System.out.println("");
	}	
}
