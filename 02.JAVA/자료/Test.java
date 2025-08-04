import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int     total   = 0;    //학생수
		int[]   scores  = null; //점수 목록
		
		do
		{
			System.out.println("--------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			
			System.out.print("선택>");
			int menu = scanner.nextInt();
			if(menu == 1)
			{
				//학생수 입력
				System.out.print("학생수>");
				total  = scanner.nextInt();
				scores = new int[total];
			}
			if(menu == 2)
			{
				//점수 입력
				for(int i = 0 ; i < total; i++)
				{
					System.out.printf("scores[%d]>",i);
					int point = scanner.nextInt();
					scores[i] = point;
				}
			}
			if(menu == 3)
			{
				//점수 목록 출력 
				for(int i = 0 ; i < total; i++)
				{
					System.out.printf("scores[%d]: %d\n",i,scores[i]);
				}
			}	
			if(menu == 4)
			{
				//분석 
				int max = scores[0]; //최고값
				int sum = 0;         //합계
				for(int i = 0 ; i < total; i++)
				{
					if( max < scores[i]) max = scores[i];
					sum += scores[i];
				}
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + (sum/scores.length));
			}				
			if(menu == 5)
			{
				break;
			}
		}while(true);
		System.out.println("프로그램 종료");
	}
}
