//35. 생성자 오버로딩
public class Test 
{
	public static void main(String[] args) 
	{
		Car c1 = new Car(19);
		c1.PrintInfo();
		
		Car c2 = new Car(20);		
		c2.PrintInfo();		
		
		Car c3 = new Car();		
		c3.PrintInfo();		
	}
}
