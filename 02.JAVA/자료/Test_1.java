import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		int deposite = 0; //예금액
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("-------------------------------");
			System.out.print("선택>");
			int menu = scanner.nextInt();
			if( menu == 1)
			{
				//예금
				System.out.print("예금액>");
				int money = scanner.nextInt();
				deposite += money;
			}
			if( menu == 2 )
			{
				//출금
				System.out.print("출금액>");
				int money = scanner.nextInt();
				deposite -= money;				
			}
			if(menu == 3)
			{
				//잔고
				System.out.println("잔고>" + deposite);
			}
			if( menu == 4 )
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
