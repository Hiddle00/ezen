import java.util.Scanner;

public class BankApplication 
{
	private Account[] account;  //���� ���
	private int       total;    //�� ���� ����
	private Scanner   scanner;  //Ű���� �Է�
	
	//������
	public BankApplication()
	{
		account = new Account[100]; //100���� �迭 ����
		total   = 0;
		scanner = new Scanner(System.in);
	}
	
	//�޴� ǥ��
	private int PrintTitle()
	{
		System.out.println("-------------------------------------------");
		System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
		System.out.println("-------------------------------------------");
		System.out.print("����>");
		int menu = scanner.nextInt();
		scanner.nextLine(); 
		return menu;
	}
	
	//���»���
	public void Create()
	{
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		System.out.print("���¹�ȣ:");
		String number = scanner.nextLine(); 
		System.out.print("������:");
		String name = scanner.nextLine();
		System.out.print("�ʱ��Աݾ�:");
		int money = scanner.nextInt();
		
		Account account = new Account(number,name,money);
		this.account[total] = account;
		total++;		
	}
	
	//���¸��
	public void List()
	{
		System.out.println("------");
		System.out.println("���¸��");
		System.out.println("------");		
		for(int i = 0 ; i < total; i++)
		{
			account[i].PrintInfo();
		}
	}
	
	//����
	public void Income()
	{
		System.out.println("------");
		System.out.println("����");
		System.out.println("------");
		
		System.out.print("���¹�ȣ:");
		String number = scanner.nextLine(); 
		System.out.print("�Աݾ�:");
		int money = scanner.nextInt();
		Account account = Find(number); 
		if(account != null)
		{
			account.setIncome(money);
		}	
	}
	
	//���
	public void Outcome()
	{
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		
		System.out.print("���¹�ȣ:");
		String number = scanner.nextLine(); 
		System.out.print("��ݾ�:");
		int money = scanner.nextInt();	
		Account account = Find(number); 
		if(account != null)
		{
			account.setOutcome(money);
		}		
	}	
	
	//���� ã��
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
	
	//���α׷� ����
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
		System.out.println("���α׷� ����");
	}
}






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






