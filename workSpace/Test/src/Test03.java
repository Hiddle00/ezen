import java.util.Scanner;

public class Test03 
{

	public static void main(String[] args) 
	{
		
//		int value = 356;
//		System.out.println((value / 100) * 100);
//		System.out.println(value - (value % 100));
		
		int i = 1;
		int sum = 0;
		for( ; i <= 100; i++) sum += i;
		System.out.println(sum);
		
		while(i <= 100)
		{
			sum += i++;
		}
		System.out.println(sum);
		
		i = 100;
		sum = 0;
		while(i >= 1) sum += i--;
		System.out.println(sum);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = scanner.nextInt();
		System.out.println("당신이 입력한 값 : " + n);
		scanner.close();
		
		
		
	}
}
