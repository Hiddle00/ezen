//21. 배열 정렬
public class ArraySort 
{
	public static void main(String[] args) 
	{
		int[] score = { 40, 22, 44, 67, 11, 55 };
		
		//score 배열을 오름차순으로 정렬한 후 
		//화면에 출력하세요.
		for(int x = 0 ; x < score.length; x++) 
		{			
			for(int y = (x+1) ; y < score.length; y++)
			{
				if( score[x] > score[y] )
				{
					int temp = score[x];
					score[x] = score[y];
					score[y] = temp;
				}
			}
		}
		
		for(int n : score)
		{
			System.out.println(n);
		}
	}
}
