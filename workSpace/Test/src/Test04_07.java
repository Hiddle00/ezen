import java.util.Scanner;

public class Test04_07 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int m = 0; 		   //예금액
		int c;     		   //출금액
		boolean f = true;  //종료 변수 이게 플래그임??
		//플래그 
		//ex. switch문에서 남은 case나 default로 break를 줘도 선택 단계로 돌아감
		//    switch 바깥에서 if문으로 f를 검사해 종료시키는 것
		int v = 1; 		   //사용자 선택 번호
		while(f)
		{
			//변함없이 출력하는 부문은 if 바깥에 두고
			//변화가 필요한 부분만 조건문 안쪽에 넣어 흐름을 만든다
			System.out.println("------------------------------");
			System.out.printf("1.예금 | 2.출금 | 3.잔고 | 4.종료\n");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			v = s.nextInt();
			if(v == 1)
			{
				System.out.print("예금액> ");
				m = s.nextInt();
			}else if(v == 2)
			{
				System.out.print("출금액> ");
				c = s.nextInt();
				m = m - c;
			}else if(v == 3) 
			{
				System.out.println("잔액> " + m);
			}else
			{
				f = false;
				System.out.println("프로그램 종료");
			}
		}
	}

}
