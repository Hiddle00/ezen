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
			if( menu == 1)
			{
				//����
				System.out.print("���ݾ�>");
				int money = scanner.nextInt();
				deposite += money;
			}
			if( menu == 2 )
			{
				//���
				System.out.print("��ݾ�>");
				int money = scanner.nextInt();
				deposite -= money;				
			}
			if(menu == 3)
			{
				//�ܰ�
				System.out.println("�ܰ�>" + deposite);
			}
			if( menu == 4 )
			{
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}
