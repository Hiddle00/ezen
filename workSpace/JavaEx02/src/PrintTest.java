//04. System.out.println() ����
public class PrintTest 
{

	public static void main(String[] args) 
	{
		//System.out.print()�� ����ϰ��� �������� ����.
		int n1 = 10;
		int n2 = 20;
		System.out.print("n1===>" + n1);
		System.out.print("\n");				//\n�� ���๮��
		System.out.print("n2===>" + n2);
		
		int age = 24;
		//����� ���̴� 24�� �Դϴ�.
		System.out.print("\n����� ���̴� " + age + "�� �Դϴ�.\n");
		
		//System.out.println()�� ����ϰ� ���� �ڵ������մϴ�.
		System.out.println("n1===>" + n1);
		System.out.println("n2===>" + n2);
		
		//���� ���ڿ� ó��
		System.out.printf("����=%d \n", 100);				//decimal
		System.out.printf("�Ǽ�=%f\n",3.14);				//float
		System.out.printf("���ڿ�=%s\n" ,"abcdef");		//string
	}

}
