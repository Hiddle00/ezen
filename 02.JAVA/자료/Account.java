

public class Account 
{
	private String account; //���¹�ȣ
	private String name;    //������
	private int    balance; //�ܾ�
	
	public Account(String account,String name,int balance)
	{
		this.account = account;
		this.name    = name;
		this.balance = balance;
	}

	public String getAccount() { return account; }
	public String getName()    { return name;    }
	public int getBalance()    { return balance; }
	
	//����
	public void setIncome(int money)
	{
		this.balance += money;
	}
	
	//���
	public void setOutcome(int money)
	{
		this.balance -= money;
	}
	
	//���� ���
	public void PrintInfo()
	{
		System.out.printf("%-10s %-10s %8d\n",this.account,this.name,this.balance);		
	}
}
