//17. for���� �̿��� ���ڸ� ���ڰ���
import java.util.*; //�ܺ� ���̺귯�� ��� ����
public class ForBingo 
{

	public static void main(String[] args) 
	{
		//���� ���� ������ ����
//		int answer = ((int)(Math.random() * 100000)) % 100 + 1;
//		System.out.println(answer);
//		
//		//Ű���� �Է� ��ü ����� 
//		Scanner key = new Scanner(System.in); //java.util�� ���Ե� ��ü ���
//		
//		System.out.print("�Է�: ");
//		int user = key.nextInt();	//���ڰ� �ƴ� ���ڸ� �Է��ϸ� ����; �Է°� ���ѵ� ����
//		
//		System.out.println("����� �Է��� ��: " + user);
//		
		//���� ���� ������ ����
		int answer = ((int)(Math.random() * 100000)) % 100 + 1;
//		System.out.println(answer);
		
		//Ű���� �Է� ��ü ����� 
		Scanner key = new Scanner(System.in); //java.util�� ���Ե� ��ü ���
		int max_life = 3;
		for(int n = 0; n < max_life; n++)
		{			
			System.out.print("���� ��ȸ : " + (max_life - n) + "\n�Է�: ");
			int user = key.nextInt();	//���ڰ� �ƴ� ���ڸ� �Է��ϸ� ����; �Է°� ���ѵ� ����
			
			if(user < answer)
			{
				System.out.println("����� �Է��� ��: " + user + " UP\n");
			}else if(user > answer)
			{
				System.out.println("����� �Է��� ��: " + user + " DOWN\n");
			}else
			{
			System.out.println("����� �Է��� ��: " + user + " Bingo!!\n");
			break;
			}
		}
		
		System.out.println("������ ����Ǿ����ϴ�.");
	}

}
