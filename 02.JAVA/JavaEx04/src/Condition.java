//07. ���ǹ� if ����
public class Condition 
{
	public static void main(String[] args) 
	{
		//if ���� ����
		int n = 10;
		boolean f;
		f = ( n % 2 == 0);
		if( f )
		{
			System.out.println(n + "�� ¦���Դϴ�.");
		}
		
		n = 20;
		if( n % 2 == 0 )
		{
			System.out.println(n + "�� ¦���Դϴ�.");
		}		
		
		n = 11;
		if( n % 2 == 0 )
		{
			System.out.println(n + "�� ¦���Դϴ�.");
		}else
		{
			System.out.println(n + "�� Ȧ���Դϴ�.");
		}		
		
		int age = 27;
		//�� 19�� �̻��̸� "���� ����"
		//�׷��� ������ "���� �Ұ�"
		if( age >= 19 )
		{
			System.out.println("���� ����");
		}else
		{
			System.out.println("���� �Ұ�");
		}
		
		//� ���� 3�� 5�� ������̸�
		//"3�� 5�� ������Դϴ�."��� ����ϰ�,
		//�׷��� ������ "������� �ƴմϴ�."
		int x = 15;
		if( ( x % 3 == 0 )  &&  ( x % 5 == 0 ) )
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
		age = 57;
		if( age < 20 )
		{
			System.out.println("�̼���");
		}else if ( age <= 29 )
		{
			System.out.println("20��");
		}else if ( age <= 39 )
		{
			System.out.println("30��");
		}else if ( age <= 49 )
		{
			System.out.println("�߳�");
		}else if ( age <= 59 )
		{
			System.out.println("���");
		}else
		{
			System.out.println("���");
		}
		
		//������
		//90~100 : A ���
		//80~89  : B ���
		//70~79  : C ���
		//60~69  : D ���
		//60�� ���� : ���� ���
		int score = 55;
		if( score >= 90 )
		{
			//90�� �̻�
			System.out.println("A ����");
		}else if( score >= 80 )
		{
			//80���̻�
			System.out.println("B ����");
		}else if( score >= 70 )
		{
			//70���̻�
			System.out.println("C ����");
		}else if( score >= 60 )
		{
			//60���̻�
			System.out.println("D ����");
		}else
		{
			//60�� �̸�
			System.out.println("���� ����");
		}
		
		//����(age)�� ����(gender) 
		//���̰� 20�� �̸��̰� gender = 0 �̸� "�̼���-����"
		//���̰� 20�� �̸��̰� gender = 1 �̸� "�̼���-����"
		//���̰� 20�� �̻��̰� gender = 0 �̸� "����-����"
		//���̰� 20�� �̻��̰� gender = 1 �̸� "����-����"
		age = 22;
		int gender = 1;
		
		//��� 1 (�ʱ��ڿ�)
		if( gender == 0 )
		{
			//���ڶ�� �ǹ�
			if( age < 20)
			{
				//�̼���
				System.out.println("�̼���-����");
			}else
			{
				//����
				System.out.println("����-����");
			}
		}else
		{
			//���ڶ�� �ǹ�
			if( age < 20)
			{
				//�̼���
				System.out.println("�̼���-����");
			}else
			{
				//����
				System.out.println("����-����");
			}			
		}
		
		//��� 2 (�߱��ڿ�)
		if( age < 20 && gender == 0)
		{
			//���̰� 20�� �̸��̰� gender = 0 �̸� "�̼���-����"
			System.out.println("�̼���-����");
		}else if( age < 20 && gender == 1)
		{
			//���̰� 20�� �̸��̰� gender = 1 �̸� "�̼���-����"
			System.out.println("�̼���-����");
		}else if( age > 20 && gender == 0)
		{
			//���̰� 20�� �̻��̰� gender = 0 �̸� "����-����"
			System.out.println("����-����");
		}else 
		{
			//���̰� 20�� �̻��̰� gender = 1 �̸� "����-����"
			System.out.println("����-����");
		}
		
	}
}

