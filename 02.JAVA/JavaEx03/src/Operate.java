//05. 연산자 연습
public class Operate 
{
	public static void main(String[] args) 
	{
		//대입 연산자 
		int n = 2;
		//n = n + 3;
		n += 3;
		//n = n - 3
		n -= 3;
		System.out.println(n);
		
		//증감 연산자
		int m = 0;
		n = 0;
		m = n++; //m = n; n = n + 1
		System.out.println("m=" + m);
		System.out.println("n=" + n);
		
		n = 0;
		m = ++n; //n = n + 1; m = n
		System.out.println("m=" + m);
		System.out.println("n=" + n);
		
		//복잡한 증감 연산자 응용
		m = 0;
		n = 0;
		m = (n++) + (++n);		
		System.out.println("m=" + m);
		System.out.println("n=" + n);
				
		m = 0;
		n = 0;
		m = (++n) + (n--);		
		System.out.println("m=" + m);
		System.out.println("n=" + n);	
		
		//증감 연산자 응용
		n = 1;
		System.out.println(n++);
		System.out.println(++n);
	}
}
