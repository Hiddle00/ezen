//08. ���� ������
public class Trinomial 
{

	public static void main(String[] args) 
	{
		int n = 16;
		//if������ �̿��Ͽ�
		// n�� ¦���� "¦��", Ȧ���̸� "Ȧ��"��� ����Ͻÿ�.
		
		if (n % 2 == 0)
		{
			System.out.println("¦��");
		}else
		{
			System.out.println("Ȧ��");
		}
		
			   n = 16;
		String s = "";
		if (n % 2 == 0)
		{
			s = "¦��";
		}else
		{
			s = "Ȧ��";
		}
		System.out.println(s);
		
		//���� ������ ����
		n = 3;
		s = (n % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(s);
		
		n = 12;
		System.out.println((n % 2 == 0 ) ? n + "��(��) ¦���Դϴ�." : n + "��(��) Ȧ���Դϴ�.");
		//���� (age)�� 20�� �̸��̸� "�̼���", 20�� �̻��̸� "����"�̶�� ����Ͻÿ�
		int age = 17;
		s = (age < 20 ) ? "�̼���" : "����";
		System.out.println(s);
		
		age = 45;
		System.out.println((age < 20 ) ? "�̼���" : "����");
		
		age = 70;
		System.out.println((age < 20)? "�̼���" : (age <= 29)? "20��" : (age <= 39)? "30��" : (age <= 49)? "�߳�" : (age <= 59)? "���" : "���");
		
	}

}
