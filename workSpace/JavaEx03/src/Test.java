public class Test 
{
	public static void main(String[] args) 
	{
		//age�� 19�� �̻��̸� ����, �ƴϸ� �̼����̶�� ����Ͻÿ�.
		int age = 18;
		int gender = 1;
		
//		switch(gender)
//		{
//		case 0: age >= 19
//		}
		String msg;
		msg = (age >= 19) ? "����" : "�̼���";
		msg += " ";
		msg += (gender == 0) ? "����" : "����";
		System.out.println(msg);
		
		
		System.out.println((age >= 19) ? "����" : "�̼���" + " " + ((gender == 0) ? "����" : "����"));
				
	}

}
