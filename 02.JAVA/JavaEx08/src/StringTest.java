//20. ���ڿ� �ٷ��
public class StringTest 
{
	public static void main(String[] args) 
	{
		//���ڿ� �迭
		String []name = {"ȫ�浿", "������", "�̼���"};
		for(int i = 0 ; i < name.length; i++)
		{
			System.out.println(name[i]);
		}
				
		//���ڿ� ġȯ (�ſ� �߿�!!!)
		String strNum1 = "1,111";
		String strNum2 = "2,222";
		strNum1 = strNum1.replace(",", "");
		strNum2 = strNum2.replace(",", "");
		System.out.println(strNum1);
		System.out.println(strNum2);
		
		//���ڿ� ���ڷ� ��ȯ
		int Num1 = Integer.parseInt(strNum1); 
		int Num2 = Integer.parseInt(strNum2);
		int Sum = Num1 + Num2;
		System.out.println("�հ�:" + Sum);
		
		//���ڸ� ���ڿ��� ��ȯ
		int    n1 = 123;
		String s1= "";
		
		//[���1] : ���ڿ� ����(+��ȣ)
		s1 = s1 + n1;
		System.out.println(s1);
		//[���2] : Integer ��ü Ȱ��
		s1 = Integer.toString(n1);
		System.out.println(s1);		
		
		//���� for��
		int ary[] = { 11, 22, 33, 44 };
		for(int i = 0 ; i < ary.length; i++)
		{
			System.out.println(ary[i]);
		}		
		for(int n : ary)
		{
			System.out.println(n);
		}		
		
		String []aryname = {"ȫ�浿", "������", "�̼���"};
		for(String n : aryname)
		{
			System.out.println(n);
		}	
		
		//���ڿ��� �迭�� ��ȯ
		//�̶�, �̸��� �ִ� ������ ���� �� ����ϼ���.
		String nameList  = "�� ��ġ/ȫ �浿/�� ����/����  ���";		
		String []nameAry = nameList.split("/");
		for(String nm : nameAry)
		{
			nm = nm.replace(" ","");
			System.out.println(nm);
		}
		
		//���� ���ڿ����� �л����� �����հ�� ����� ���Ͽ� ����ϼ���.
		String student = "������:30,������:45,������:69,������:40";
		int    score_sum = 0; //�����հ�
		int    score_avg = 0; //���
		
		
		//���� ��ȭ��ȣ�θ� �̿��Ͽ� �Ʒ��� ���� �糭 �߻� ���ڸ� �߼��ϼ���.
		//[010-1111-1111]�� �������� ȫ���溸�� ��ȿ�Ǿ����ϴ�.
		//[010-1111-2222]�� �������� ȫ���溸�� ��ȿ�Ǿ����ϴ�.
		//[010-1111-3333]�� �������� ȫ���溸�� ��ȿ�Ǿ����ϴ�.
		String tel = "010-1111-1111,010-1111-2222,010-1111-3333";
		String msg = "{tel}�� �������� ȫ���溸�� ��ȿ�Ǿ����ϴ�.";		
		
	}
}
