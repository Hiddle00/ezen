//20. ���ڿ� �ٷ��
public class StringTest 
{

	public static void main(String[] args) 
	{
//		int n = 10;
//		string s2 = n;
		//���ڿ� �迭
		String[] name = {"ȫ�浿", "������", "�̼���"};
		for(int i = 0; i < name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		//���ڿ� ġȯ (�߿�)
		String strNum1 = "1,111";
		String strNum2 = "2,222";
		strNum1 = strNum1.replace("," , "");
		strNum2 = strNum2.replace("," , "");
		System.out.println(strNum1);
		System.out.println(strNum2);
		
		//���ڿ��� ���ڷ� ��ȯ
		int Num1 = Integer.parseInt(strNum1);
		int Num2 = Integer.parseInt(strNum2);
		int sum = Num1 + Num2;
		System.out.println("�հ� : " + sum);
				
		//���ڸ� ���ڿ��� ��ȯ
		int    n1 = 123;
		String s1 = "";
		
		//[���1] : ���ڿ� ����(+��ȣ)
		s1 = s1 + n1;
		System.out.println(s1);
		//[���2] : Integer ��ü Ȱ��
		s1 = Integer.toString(n1);
		System.out.println(s1);
		
		//���� for��
		int ary[] = {11, 22, 33, 44};
		for(int i = 0; i < ary.length; i++)
		{
			System.out.println(ary[i]);
		}
		
		for(int n : ary)
		{
			System.out.println(n);
		}
		
		String[] aryname = {"ȫ�浿", "������", "�̼���"};
		for(String n : aryname)
		{
			System.out.println(n);
		}
		
		//���ڿ��� �迭�� ��ȯ
		//�̶�, �̸��� �ִ� ������ ���� �� ����ϼ���
		String nameList = "�� ��ġ/ȫ �浿/�� ����/���� ���";
		nameList = nameList.replace(" ", "");
		String[] nameAry = nameList.split("/");
		for(String nm : nameAry)
		{
//			nm = nm.replace(" ", "");
			System.out.println(nm);
		}
		
		//���� ���ڿ����� �л����� �����հ�� ����� ���Ͽ� ����ϼ���.
		String student = "������:30,������:45,������:69,������:40";
		int    score_sum = 0; //�����հ�
		int    score_avg = 0; //���
		String[] stuAry = student.replace(":", ",").split(",");
		for(int i = 1; i < stuAry.length ; i += 2)
		{
			score_sum += Integer.parseInt(stuAry[i]);
		}
		score_avg = score_sum / (stuAry.length / 2);
		System.out.println(score_sum);
		System.out.println(score_avg);
		
		
		//���� ��ȭ��ȣ�θ� �̿��Ͽ� �Ʒ��� ���� �糭 �߻� ���ڸ� �߼��ϼ���.
		//[010-1111-1111]�� �������� ȫ���溸�� ��ȿ�Ǿ����ϴ�.
		//[010-1111-2222]�� �������� ȫ���溸�� ��ȿ�Ǿ����ϴ�.
		//[010-1111-3333]�� �������� ȫ���溸�� ��ȿ�Ǿ����ϴ�.
		String tel = "010-1111-1111,010-1111-2222,010-1111-3333";
		String msg = "{tel}�� �������� �뼳���Ǻ��� ��ȿ�Ǿ����ϴ�.";
		String[] telAry = tel.split
		
	}

}
