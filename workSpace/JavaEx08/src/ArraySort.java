//21. �迭 ����
public class ArraySort 
{

	public static void main(String[] args) 
	{
		int[] ary = { 23, 45, 1, 99, 200, 33, 55, 30, 90, 555, 300, 700};
		//�迭�� �����߿��� ���� ���� ���� ã�Ƽ� ȭ�鿡 ����ϼ���.
//		int max = ary[0];
//		int min = ary[0];
//		for(int i :ary)
//		{
//			if(min > i)
//			{
//				min = i;
//			}
//			
//		}
//		System.out.println(min);
//		
//		for(int i : ary)
//		{
//			if(min > i) min = i;
//			if(max < i) max = i;
//		}
//		System.out.println(min);
//		System.out.println(max);
//		
		int z;
		for(int n = 0; n < ary.length; n++)
		{
			for(int m = (n + 1); m <ary.length; m++)
			{
				if(ary[n] > ary[m])
				{
					z = ary[m];
					ary[m] = ary[n];
					ary[n] = z;
				}
			}
		}
		for(int i : ary)
		{
			System.out.print(i + ". ");
		}
		
	}

}
