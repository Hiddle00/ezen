import java.util.Scanner;

public class Test04_07 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int m = 0; 		   //���ݾ�
		int c;     		   //��ݾ�
		boolean f = true;  //���� ���� �̰� �÷�����??
		//�÷��� 
		//ex. switch������ ���� case�� default�� break�� �൵ ���� �ܰ�� ���ư�
		//    switch �ٱ����� if������ f�� �˻��� �����Ű�� ��
		int v = 1; 		   //����� ���� ��ȣ
		while(f)
		{
			//���Ծ��� ����ϴ� �ι��� if �ٱ��� �ΰ�
			//��ȭ�� �ʿ��� �κи� ���ǹ� ���ʿ� �־� �帧�� �����
			System.out.println("------------------------------");
			System.out.printf("1.���� | 2.��� | 3.�ܰ� | 4.����\n");
			System.out.println("------------------------------");
			System.out.print("����> ");
			v = s.nextInt();
			if(v == 1)
			{
				System.out.print("���ݾ�> ");
				m = s.nextInt();
			}else if(v == 2)
			{
				System.out.print("��ݾ�> ");
				c = s.nextInt();
				m = m - c;
			}else if(v == 3) 
			{
				System.out.println("�ܾ�> " + m);
			}else
			{
				f = false;
				System.out.println("���α׷� ����");
			}
		}
	}

}
