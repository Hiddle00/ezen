//17. for�� �̿��� ���ڸ� ���� ����
import java.util.*;

public class ForBingo 
{
	public static void main(String[] args) 
	{
		//�������� ������ ���� 
		int max_range = 200; //1~200������ ������ ����� ����
		int answer = ((int)(Math.random() * 1000000)) % max_range + 1;
		//System.out.println(answer);
		
		//Ű���� �Է� ��ü �����
		Scanner key = new Scanner(System.in);
		int max_life = 5;
		for(int n = 0; n < max_life; n++)
		{
			System.out.print("[���� ��ȸ " + (max_life - n) + "]�Է�:");
			int user = key.nextInt();
			
			//����(answer)�� ������Է°�(user)���� ũ�� "UP"
			//����(answer)�� ������Է°�(user)���� ������ "DOWN"
			//����(answer)�� ������Է°�(user)�ϰ� ������ "BINGO!!"
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
		
		System.out.println("������ ����Ǿ����ϴ�.");
	}
}

