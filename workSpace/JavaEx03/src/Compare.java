
public class Compare 
{

	public static void main(String[] args) 
	{
		boolean f;
		int age = 21;
		
		//���� ������ �� (==)
		f = ( age == 20 );
		System.out.println(f);
		
		//���� �ٸ��� �� (!=)
		f = ( age != 20 );
		System.out.println(f);
		
		//�ٰ� ��
		f = ( age > 19 );
		System.out.println(f);
		
		//�� ������ ���� : � ���� ¦������ ���� �˻�
		int n = 5;
		f = ( n % 2 == 0 );
		System.out.println(f);
		
		//�� ������ ����
		//and(&), or(|), not(!)
		int height = 140; //Ű
		int weight = 40; //������
		f = (height > 140 ) && (weight > 35);
		System.out.println(f);
		
		//���̰� 20�� �̸��̰ų� 50�� �̻��̸�
		//true�� �Ǵ��Ͻÿ�.
		age = 17;
		f = ( age > 20 ) || ( age >= 60);
		System.out.println(f);
	}

}
