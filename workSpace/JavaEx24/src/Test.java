//Worker클래스 동작 테스트용 클래스
public class Test {

	public static void main(String[] args) {
		
		System.out.println("작업이 시작되었습니다.");
		System.out.println("1초간 중지 후 작업이 완료 됩니다.");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println("작업이 완료되었습니다.");
		
		Worker w1 = new Worker("Worker1",3000);
		Worker w2 = new Worker("Worker2",3001);
		Worker w3 = new Worker("Worker3",3002);
		
		w1.start();
		w2.start();
		w3.start();
	}
}
