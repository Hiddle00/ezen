import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int     total   = 0;    //�л���
		int[]   scores  = null; //���� ���
		
		do
		{
			System.out.println("--------------------------------------------------");
			System.out.println("1.�л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ����");
			System.out.println("--------------------------------------------------");
			
			System.out.print("����>");
			int menu = scanner.nextInt();
			if(menu == 1)
			{
				//�л��� �Է�
				System.out.print("�л���>");
				total  = scanner.nextInt();
				scores = new int[total];
			}
			if(menu == 2)
			{
				//���� �Է�
				for(int i = 0 ; i < total; i++)
				{
					System.out.printf("scores[%d]>",i);
					int point = scanner.nextInt();
					scores[i] = point;
				}
			}
			if(menu == 3)
			{
				//���� ��� ��� 
				for(int i = 0 ; i < total; i++)
				{
					System.out.printf("scores[%d]: %d\n",i,scores[i]);
				}
			}	
			if(menu == 4)
			{
				//�м� 
				int max = scores[0]; //�ְ�
				int sum = 0;         //�հ�
				for(int i = 0 ; i < total; i++)
				{
					if( max < scores[i]) max = scores[i];
					sum += scores[i];
				}
				System.out.println("�ְ����� : " + max);
				System.out.println("������� : " + (sum/scores.length));
			}				
			if(menu == 5)
			{
				break;
			}
		}while(true);
		System.out.println("���α׷� ����");
	}
}
