//35. 생성자 오버로딩
public class Test 
{

	public static void main(String[] args) 
	{
		Car c1 = new Car();
		System.out.println(c1.company);
		System.out.println(c1.name);
		System.out.println(c1.inch);
		System.out.println("-------------------");
		
		Car c2 = new Car(19);
		c2.PrintInfo();
		
		Car c3 = new Car(20);
		c3.PrintInfo();
		
		Car c4 = new Car();
		c4.PrintInfo();
	}

}
