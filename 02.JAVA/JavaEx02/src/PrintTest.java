//04. System.out.println() 연습
public class PrintTest 
{
	public static void main(String[] args) 
	{
		//System.out.print()는 출력하고나서 개행하지 않는다.
		int n1 = 10;
		int n2 = 20;
		System.out.print("n1===>" + n1);
		System.out.print("\n"); //\n 은 개행문자
		System.out.print("n2===>" + n2);
		
		int age = 24;
		//당신의 나이는 24세 입니다.
		System.out.print("\n당신의 나이는 " + age + "세 입니다.\n");
		
		//System.out.println()는 출력하고나서 자동개행합니다. 
		System.out.println("n1===>" + n1);
		System.out.println("n2===>" + n2);
				
		//포멧 문자열 처리
		System.out.printf("정수=%d\n",100);
		System.out.printf("실수=%f\n",3.14);
		System.out.printf("문자열=%s\n","abcdef");
	}
}
