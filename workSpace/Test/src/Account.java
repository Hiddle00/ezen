
public class Account 
{
	private String name;    //�̸�
	private String number;  //���¹�ȣ
	private int    balance; //�ܰ�
	
	public String getName()    {  return name;    }
	public String getNumber()  {  return number;  }
	public int    getBalance() {  return balance; }
	
	public void setName(String name)     {	this.name    = name;    }
	public void setNumber(String number) {	this.number  = number;  }
	public void setBalance(int balance)  {	this.balance = balance; }
	
	public void menu()
	{
		System.out.println("--------------------------------");
		System.out.println("1.���»��� | 2. ���¸�� | 3.���� | 4. ��� | ����");
		System.out.println("--------------------------------");
		System.out.println("����> ");
	}
	
	public void createNew()
	{
		System.out.println("----------");
		System.out.println("���»���");
		System.out.println("----------");
		System.out.println("���¹�ȣ: ");
	}
}