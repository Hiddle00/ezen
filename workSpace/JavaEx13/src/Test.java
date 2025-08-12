//33. 정적() 멤버 연습
public class Test 
{

	public static void main(String[] args) 
	{
		Circle c = new Circle();
		
		double r = 1.5;
		double a = Circle.PI * r * r;
		System.out.println(a);
		
		int z = Circle.Plus(1 , 2);
		System.out.println(z);
	}

}
