public class Test 
{
	public static void main(String[] args) 
	{
		Person hong = new Person();
		
		hong.setName("홍길동");
		hong.setAge(18);
		
		System.out.println("이름:" + hong.getName());
		System.out.println("나이:" + hong.getAge());
		System.out.println("생년:" + hong.getYear());
	}
}


