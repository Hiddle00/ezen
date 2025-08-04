
public class Test05 
{

	public static void main(String[] args) 
	{
//		int[] array = {1, 5, 3, 8, 2};
//		int max = array[0];
//		for(int i = 0; i < array.length; i++)
//		{
//			if(array[i] < array[i+1]) 
//			{
//				
//				if(i+1 > array.length)
//				{
//					break;
//				}
//				max = array[i+1];
//			}
//			System.out.println(max);
//		}
		String[] score = {"1,000", "22,000", "45,000", "3,000"};
		int max = 0;
		for(int i = 0; i < score.length; i++)
		{
			String x = score[max].replace(",","");
			String y = score[i].replace(",","");
			if(Integer.parseInt(x) < Integer.parseInt(y))
			{
				max = i;
			}
		}
		System.out.println(score[max]);
		
		
	}

}
