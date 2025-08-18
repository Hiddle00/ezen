
public class Test {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.size1 = 10;
		System.out.println(b1.size1);
		
		Box<String> b2 = new Box<>();
		b2.size1 = "검은색박스";
		System.out.println(b2.size1);

		
		Box<Integer> b3 = new Box<>();
		b3.setSize(100);
		System.out.println(b3.getSize());
		
		Box<String> b4 = new Box<>();
		b4.setSize("중간박스");
		System.out.println(b4.getSize());
		
		//1. MyBox 객체를 생성한다
		MyBox m = new MyBox();
		m.company  = "이젠물산";
		m.product  = "컴퓨터";
		m.standard = 386;
		
		//2. Box클래스에 MyBox 타입을 객체로 쓰도록 선언한다.
		Box<MyBox> b5 = new Box<>();
		b5.setSize(m);
		
		//3. Box클래스에서 MyBox 객체를 가져온다.
		MyBox t = b5.getSize();
		System.out.println(t.company);
		System.out.println(t.product);
		System.out.println(t.standard);
	}

}
