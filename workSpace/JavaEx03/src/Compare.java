
public class Compare 
{

	public static void main(String[] args) 
	{
		boolean f;
		int age = 21;
		
		//값이 같은지 비교 (==)
		f = ( age == 20 );
		System.out.println(f);
		
		//값이 다른지 비교 (!=)
		f = ( age != 20 );
		System.out.println(f);
		
		//근값 비교
		f = ( age > 19 );
		System.out.println(f);
		
		//비교 연산자 응용 : 어떤 값이 짝수인지 여부 검사
		int n = 5;
		f = ( n % 2 == 0 );
		System.out.println(f);
		
		//논리 연산자 연습
		//and(&), or(|), not(!)
		int height = 140; //키
		int weight = 40; //몸무게
		f = (height > 140 ) && (weight > 35);
		System.out.println(f);
		
		//나이가 20세 미만이거나 50세 이상이면
		//true로 판단하시오.
		age = 17;
		f = ( age > 20 ) || ( age >= 60);
		System.out.println(f);
	}

}
