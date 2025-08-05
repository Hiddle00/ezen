import java.util.Scanner;

public class BankApplication 
{
	private Account[] account;  //계좌 목록
	private int       total;    //총 계좌 갯수
	private Scanner   scanner;  //키보드 입력
	
	//생성자
	public BankApplication()
	{
		account = new Account[100]; //100개의 배열 생성
		total   = 0;
		scanner = new Scanner(System.in);
	}
	
	//메뉴 표시
	private int PrintTitle()
	{
		System.out.println("-------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-------------------------------------------");
		System.out.print("선택>");
		int menu = scanner.nextInt();
		scanner.nextLine(); 
		return menu;
	}
	
	//계좌생성
	public void Create()
	{
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호:");
		String number = scanner.nextLine(); 
		System.out.print("계좌주:");
		String name = scanner.nextLine();
		System.out.print("초기입금액:");
		int money = scanner.nextInt();
		
		Account account = new Account(number,name,money);
		this.account[total] = account;
		total++;		
	}
	
	//계좌목록
	public void List()
	{
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");		
		for(int i = 0 ; i < total; i++)
		{
			account[i].PrintInfo();
		}
	}
	
	//예금
	public void Income()
	{
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		
		System.out.print("계좌번호:");
		String number = scanner.nextLine(); 
		System.out.print("입금액:");
		int money = scanner.nextInt();
		Account account = Find(number); 
		if(account != null)
		{
			account.setIncome(money);
		}	
	}
	
	//출금
	public void Outcome()
	{
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		
		System.out.print("계좌번호:");
		String number = scanner.nextLine(); 
		System.out.print("출금액:");
		int money = scanner.nextInt();	
		Account account = Find(number); 
		if(account != null)
		{
			account.setOutcome(money);
		}		
	}	
	
	//계좌 찾기
	private Account Find(String account)
	{
		for(int i = 0 ; i < total; i++)
		{
			if(account.equals(this.account[i].getAccount()))
			{
				return this.account[i];
			}
		}	
		return null;
	}
	
	//프로그램 실행
	public void Run()
	{
		boolean run = true;
		do
		{
			int menu = PrintTitle();
			switch(menu)
			{
			case 1: Create();
				break;
			case 2: List();
				break;
			case 3: Income();
				break;
			case 4: Outcome();
				break;
			case 5: run = false;
				break;				
			}
		}while(run);
	}
	
	public static void main(String[] args) 
	{
		BankApplication app = new BankApplication();
		app.Run();
		System.out.println("프로그램 종료");
	}
}






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






