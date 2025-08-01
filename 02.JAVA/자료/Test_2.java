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
			int money = 0;
			boolean isExit = false;
			switch(menu)
			{
			case 1:
				//예금
				System.out.print("예금액>");
				money = scanner.nextInt();
				deposite += money;
				break;
			case 2:				//출금
				System.out.print("출금액>");
				money = scanner.nextInt();
				if(deposite - money >= 0 )
				{
					deposite -= money;
				}else
				{
					System.out.println("잔액이 부족합니다.");
				}
				break;
			case 3: 
				//잔고
				System.out.println("잔고>" + deposite);
				break;
			case 4:
				System.out.println("프로그램 종료");
				isExit = true;
				break;
			default:
				System.out.println("잘못 선택 된 메뉴입니다.");
				break;
			}
			if(isExit == true)
			{
				break;
			}
		}
	}
}
