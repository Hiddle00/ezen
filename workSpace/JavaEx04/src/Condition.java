//07. ���ǹ� if ����
public class Condition 
{

	public static void main(String[] args) 
	{
		//if ���� ����
		int n = 10;
		boolean f;
		f = (n % 2 == 0);
		if(f)
		{
			System.out.println(n + "�� ¦���Դϴ�.");
		}
		
		n = 20;
		if( n % 2 == 0 )
		{
			System.out.println(n +"�� ¦���Դϴ�.");
		}
		
		n = 12;
		if( n % 2 == 0)
		{
			System.out.println(n + "�� ¦���Դϴ�.");
		}else
		{
			System.out.println(n + "�� Ȧ���Դϴ�.");
		}
		
		int age = 17;
		//�� 19�� �̻��̸� "���� ����"
		//�׷��� ������ "���� �Ұ�"
		if ( age >= 19 )
		{ 
			System.out.println("���� ����");
		}else
		{
			System.out.println("���� �Ұ�");
		}
		
		int x = 15;
		if ( x % 3 == 0 && x % 5 == 0)
		{ 
			System.out.println("3�� 5�� ������Դϴ�.");
		}else
		{
			System.out.println("������� �ƴմϴ�.");
		}
		
		//���̰�
		//20�� �̸��̸� "�̼���"
		//20~29�� �̸� "20��"
		//30~39�� �̸� "30��"
		//40~49�� �̸� "�߳�"
		//50~59�� �̸� "���"
		//60�� �̻��̸� "���" �̶�� ����ϼ���.
		
		age = 33;
		if ( age < 20 )
		{
			System.out.println("�̼���");
		}else if ( age <= 29)
		{
			System.out.println("20��");
		}else if ( age <= 39)
		{
			System.out.println("30��");
		}else if ( age <= 49)
		{
			System.out.println("�߳�");
		}else if ( age <= 59)
		{
			System.out.println("���");
		}else 
		{
			System.out.println("���");
		}
		
		//������
		//90~100 : A ���
		//80~89 : B ���
		//70~79 : C ���
		//60~69 : D ���
		//60�� ���� : ���� ���
		int score = 95;
		if (score >= 90)
		{
			System.out.println("A");
		}else if(score >= 80)
		{
			System.out.println("B");
		}else if(score >= 70)
		{
			System.out.println("C");
		}else if(score >= 60)
		{
			System.out.println("D");
		}else
		{
			System.out.println("����");
		}
		
		//���̿�(age) ����(gender)
		//���̰� 20�� �̸��̰� gender = 0 �̸� "�̼���=����"
		//���̰� 20�� �̸��̰� gender = 1 �̸� "�̼���=����"
		//���̰� 20�� �̻��̰� gender = 0 �̸� "����=����"
		//���̰� 20�� �̻��̰� gender = 1 �̸� "����=����"
		int gender = 1;
		if (age < 20 && gender == 0)
		{
			//20�� �̸� gender = 0
			System.out.println("�̼��� = ����");
		}else if (age < 20 && gender == 1)
		{
			//20�� �̸� gender = 1
			System.out.println("�̼��� - ����");
		}else if (gender == 1)
		{
			System.out.println("���� - ����");
		}else
		{
			//20�� �̻� gender = 1
			System.out.println("���� - ����");
		}
		
	}

}
