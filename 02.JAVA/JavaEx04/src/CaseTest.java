//09. switch ~ case ���� ����
public class CaseTest
{
	public static void main(String[] args) 
	{
		int gender = 0; //0-����,1-����
		//if ������ �̿��Ͽ�
		//gender�� 0�̸� "����", 1�̸� "����" �׷��� ������
		//"�˼�����"�̶�� ����ϼ���.
		if( gender == 0 )
		{
			System.out.println("����");
		}else if (gender == 1)
		{
			System.out.println("����");
		}else
		{
			System.out.println("�˼�����");
		}
		
		gender = 10;
		switch(gender)
		{
		case 0 :
			System.out.println("����");
			break;
		case 1 :
			System.out.println("����");
			break;
		default:
			System.out.println("�˼�����");
			break;			
		}
		
		//� ��n�� ���Ͽ� ¦��,Ȧ�� ����ϴ� ������
		//switch-case�� ����Ͻÿ�.
		int n = 20;
		switch( n % 2 )
		{
		case 0:
			System.out.println("¦��");
			break;
		default:
			System.out.println("Ȧ��");
			break;
		}
		
		//���̰� 
		//20�� �̸��̸� "�̼���"
		//20~29�� �̸� "20��"
		//30~39�� �̸� "30��"
		//40~49�� �̸� "�߳�"
		//50~59�� �̸� "���"
		//60�� �̻��̸� "���" �̶�� 
		//switch~case�� �̿��Ͽ� ����ϼ���.
		int age = 6;
		switch(age / 10)
		{
		case 0:
		case 1:	 System.out.println("�̼���"); break;		
		case 2:	 System.out.println("20��");	 break;			
		case 3:	 System.out.println("30��");  break;						
		case 4:	 System.out.println("�߳�");	 break;						
		case 5:  System.out.println("���");	 break;						
		default: System.out.println("���");	 break;					
		}
	}
}
