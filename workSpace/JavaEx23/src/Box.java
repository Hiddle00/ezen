//제네릭 문법 연습용 Box 클래스
public class Box <MyType//사용자정의타입
>{
	public MyType size1;
	private MyType size; //박스 크기

	public MyType getSize() {
		return size;
	}

	public void setSize(MyType size) {
		this.size = size;
	}
}
