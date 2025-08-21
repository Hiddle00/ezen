//싱글톤 패턴 디자인을 위한 클래스
public class SingleTon 
{
	private static SingleTon object = null;
	
	private SingleTon()
	{
		System.out.println("SingleTon 생성자 실행");
	}
	
	//메모리에 하나의 객체만 생성하도록 한다.
	public static SingleTon getInstance()
	{
		if( object == null )
		{
			object = new SingleTon();
		}
		return object;
	}
	
}
