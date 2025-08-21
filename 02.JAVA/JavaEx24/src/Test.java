//Worker클래스 동작 테스트용 클래스
public class Test 
{
	public static void main(String[] args) 
	{
		Worker w1 = new Worker("worker1",300);
		Worker w2 = new Worker("worker2",500);
		Worker w3 = new Worker("worker3",200);
		
		w1.start();
		w2.start();
		w3.start();
	}
}
