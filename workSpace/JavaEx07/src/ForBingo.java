//17. for문을 이용한 술자리 숫자게임
import java.util.*; //외부 라이브러리 사용 선언
public class ForBingo 
{

	public static void main(String[] args) 
	{
		//랜덤 값을 가지는 정답
//		int answer = ((int)(Math.random() * 100000)) % 100 + 1;
//		System.out.println(answer);
//		
//		//키보드 입력 객체 만들기 
//		Scanner key = new Scanner(System.in); //java.util에 포함된 객체 사용
//		
//		System.out.print("입력: ");
//		int user = key.nextInt();	//숫자가 아닌 문자를 입력하면 오류; 입력값 제한도 가능
//		
//		System.out.println("당신이 입력한 값: " + user);
//		
		//랜덤 값을 가지는 정답
		int answer = ((int)(Math.random() * 100000)) % 100 + 1;
//		System.out.println(answer);
		
		//키보드 입력 객체 만들기 
		Scanner key = new Scanner(System.in); //java.util에 포함된 객체 사용
		int max_life = 3;
		for(int n = 0; n < max_life; n++)
		{			
			System.out.print("남은 기회 : " + (max_life - n) + "\n입력: ");
			int user = key.nextInt();	//숫자가 아닌 문자를 입력하면 오류; 입력값 제한도 가능
			
			if(user < answer)
			{
				System.out.println("당신이 입력한 값: " + user + " UP\n");
			}else if(user > answer)
			{
				System.out.println("당신이 입력한 값: " + user + " DOWN\n");
			}else
			{
			System.out.println("당신이 입력한 값: " + user + " Bingo!!\n");
			break;
			}
		}
		
		System.out.println("게임이 종료되었습니다.");
	}

}
