
public class Account 
{
	private String name;    //이름
	private String number;  //계좌번호
	private int    balance; //잔고
	
	public String getName()    {  return name;    }
	public String getNumber()  {  return number;  }
	public int    getBalance() {  return balance; }
	
	public void setName(String name)     {	this.name    = name;    }
	public void setNumber(String number) {	this.number  = number;  }
	public void setBalance(int balance)  {	this.balance = balance; }
	
	public void menu()
	{
		System.out.println("--------------------------------");
		System.out.println("1.계좌생성 | 2. 계좌목록 | 3.예금 | 4. 출금 | 종료");
		System.out.println("--------------------------------");
		System.out.println("선택> ");
	}
	
	public void createNew()
	{
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.println("계좌번호: ");
	}
}