//14. 술자리 숫자 게임 만들기
import java.util.*;

public class WhileBingo 
{
	
	public static void main(String[] args) 
	{
		//1~100사이의 랜덤한 값을 만들어낸다.
		int answer = ((int)(Math.random() * 100000) % 100) + 1;
//		System.out.println(answer);
		
		Scanner key = new Scanner(System.in);
		
		while(true)
		{
			//사용자가 입력한 값
			System.out.print("입력:");
			int user = key.nextInt();
			
			//정답(answer)이 사용자입력값(user) 보다 크면 "UP"
			//정답(answer)이 사용자입력값(user) 보다 작으면 "DOWN"
			//정답(answer)이 사용자입력값(user) 과 같으면 "BINGO!!"
			
			if(answer > user)
			{
				System.out.println("UP");
			}else if(answer < user)
			{
				System.out.println("DOWN");
			}else
			{
				System.out.println("BINGO!!");
				break;
			}
		}
	}
}
