//17. for을 이용한 술자리 숫자 게임
import java.util.*;

public class ForBingo 
{
	public static void main(String[] args) 
	{
		//랜덤값을 가지는 점수 
		int max_range = 200; //1~200사이의 랜덤값 추출용 변수
		int answer = ((int)(Math.random() * 1000000)) % max_range + 1;
		//System.out.println(answer);
		
		//키보드 입력 객체 만들기
		Scanner key = new Scanner(System.in);
		int max_life = 5;
		for(int n = 0; n < max_life; n++)
		{
			System.out.print("[남은 기회 " + (max_life - n) + "]입력:");
			int user = key.nextInt();
			
			//정답(answer)이 사용자입력값(user)보다 크면 "UP"
			//정답(answer)이 사용자입력값(user)보다 작으면 "DOWN"
			//정답(answer)이 사용자입력값(user)하고 같으면 "BINGO!!"
			if( answer > user)
			{
				System.out.println("UP");
			}else if( answer < user)
			{
				System.out.println("DOWN");
			}else 
			{
				System.out.println("BINGO!");
				break;
			}
		}
		
		System.out.println("게임이 종료되었습니다.");
	}
}

