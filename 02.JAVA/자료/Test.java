
public class Test 
{
	public static void main(String[] args) 
	{
		Account account = new Account();
		
		account.setBalance(10000);
		
		//���� �ܰ� : 10000
		System.out.println("���� �ܰ�:" + account.getBalance());
		
		account.setBalance(-100);
		//���� �ܰ� : 10000		
		System.out.println("���� �ܰ�:" + account.getBalance());
		
		account.setBalance(2000000);
		//���� �ܰ� : 10000		
		System.out.println("���� �ܰ�:" + account.getBalance());	
		
		account.setBalance(300000);
		//���� �ܰ� : 3000000		
		System.out.println("���� �ܰ�:" + account.getBalance());			
	}
}
