//����ó�� ���� 2��
public class TryTest 
{

	public static void main(String[] args) 
	{
		int x = 20;
		int y = 1;
		int z = 0;
		String str = null;
		int[] ary = {1, 2, 3};
		
		try 
		{
			//�迭 ����
			System.out.println(ary[10]);
			
			//null ����
			int length = str.length();
			
			//0������ ����
			z = x / (y - 1);
		}catch(Exception e)
		{
			System.out.println(e);
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
