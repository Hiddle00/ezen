import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		int deposite = 0; //���ݾ�
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("-------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4. ����");
			System.out.println("-------------------------------");
			System.out.print("����>");
			int menu = scanner.nextInt();
			int money = 0;
			boolean isExit = false;
			switch(menu)
			{
			case 1:
				//����
				System.out.print("���ݾ�>");
				money = scanner.nextInt();
				deposite += money;
				break;
			case 2:				//���
				System.out.print("��ݾ�>");
				money = scanner.nextInt();
				if(deposite - money >= 0 )
				{
					deposite -= money;
				}else
				{
					System.out.println("�ܾ��� �����մϴ�.");
				}
				break;
			case 3: 
				//�ܰ�
				System.out.println("�ܰ�>" + deposite);
				break;
			case 4:
				System.out.println("���α׷� ����");
				isExit = true;
				break;
			default:
				System.out.println("�߸� ���� �� �޴��Դϴ�.");
				break;
			}
			if(isExit == true)
			{
				break;
			}
		}
	}
}
