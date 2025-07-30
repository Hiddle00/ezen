//33. 정적(static) 멤버 연습
public class Test
{
	public static void main(String[] args) 
	{
		//Circle c = new Circle();
		
		//원의 넓이 = PI * 반지름 * 반지름
		double r = 1.5;
		double a = Circle.PI * r * r;
		
		System.out.println(a);

		int z = Circle.Plus(1,2);
		System.out.println(z);
		
	}
}
