//08. ���� ������
public class Trinomial 
{
	public static void main(String[] args) 
	{
		int    n = 16;
		String s = "";
		
		//if ������ �̿��Ͽ� 
		//n�� ¦���̸� "¦��", Ȧ���̸� "Ȧ��"��� ����Ͻÿ�.
		if( n % 2 == 0 )
		{
			s = "¦��";
		}else
		{
			s = "Ȧ��";
		}
		System.out.println(s);
		
		//���� ������ ����
		n = 3;
		s = ( n % 2 == 0 ) ? "¦��" : "Ȧ��";
		System.out.println(s);
		
		//���׿����ڸ� �̿��Ͽ�
		//����(age)�� 20�� �̸��̸� "�̼���",
		//20�� �̻��̸� "����"�̶�� ����ϼ���.
		int age = 17;
		System.out.println(( age < 20 ) ? "�̼���" : "����");
	}
}



