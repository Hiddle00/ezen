//14. ���ڸ� ���� ���� �����
import java.util.*;

public class WhileBingo 
{
	
	public static void main(String[] args) 
	{
		//1~100������ ������ ���� ������.
		int answer = ((int)(Math.random() * 100000) % 100) + 1;
//		System.out.println(answer);
		
		Scanner key = new Scanner(System.in);
		
		while(true)
		{
			//����ڰ� �Է��� ��
			System.out.print("�Է�:");
			int user = key.nextInt();
			
			//����(answer)�� ������Է°�(user) ���� ũ�� "UP"
			//����(answer)�� ������Է°�(user) ���� ������ "DOWN"
			//����(answer)�� ������Է°�(user) �� ������ "BINGO!!"
			
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
