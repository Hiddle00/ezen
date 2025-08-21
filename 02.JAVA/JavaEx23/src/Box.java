//제네릭 문법 연습용 Box 클래스
public class Box <MyType>
{
	private MyType  size; //박스크기

	public MyType getSize() 
	{
		return size;
	}

	public void setSize(MyType size) 
	{
		this.size = size;
	}	
}
