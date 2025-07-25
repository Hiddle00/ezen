//01.자바 변수 타입 예제
public class Variable 
{

	public static void main(String[] args) 
	{
		//변수 : boolean 타입 연습
		boolean f = true;
		System.out.println(f);
				
		f = false;
		System.out.println(f);
		
		//변수 : 정수(Integer) 타입 연습
		byte b =100;
		System.out.println(b);
		short s =32000;
		System.out.println(s);
		int i = 999999;
		System.out.println(i);
		long l = 1000000000;
		System.out.println(l);
		
		//변수 : 실수(Float) 타입 연습
		float ff = 3.14f; //float는 실수 뒤에 f가 필수?
		System.out.println(ff);
		double dd = 3.14;
		System.out.println(dd);
		
		//변수 : 문자(Character) 타입 연습 
		char c = 'A';
		System.out.println(c);
		System.out.println((int)c);
		
		for(c = 'A'; c <= 'Z'; c++)
		{
//			if(c == 'C' || c == 'D' || c =='E')
//			{
//				continue;
//			}
//			System.out.println("C=" + c);
			
//			if(c != 'C' && c != 'D' && c != 'E')
//			{
//				System.out.println("C=" + c);
//			}
			
			switch(c)
			{
				case 'C':
				case 'D':
				case 'E':
				break;
				default: System.out.println(c);
			}
		}
		
		int in = 5;
		int im = 10;
		int temp = in;
		System.out.println(in);
		
	}

}
