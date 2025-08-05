
public class Account 
{
	private String account; //계좌번호
	private String name;    //계좌주
	private int    balance; //잔액
	
	public Account(String account,String name,int balance)
	{
		this.account = account;
		this.name    = name;
		this.balance = balance;
	}

	public String getAccount() { return account; }
	public String getName()    { return name;    }
	public int getBalance()    { return balance; }
	
	//예금
	public void setIncome(int money)
	{
		this.balance += money;
	}
	
	//출금
	public void setOutcome(int money)
	{
		this.balance -= money;
	}
	
	//정보 출력
	public void PrintInfo()
	{
		System.out.printf("%-10s %-10s %8d\n",this.account,this.name,this.balance);		
	}
}
