//일정한 작업을 수행하는 Worker클래스
public class Worker extends Thread{

	private String name; //작업이름
	private int    rest; //작업휴지시간
	
	public Worker(String name,int rest){
		this.name = name;
		this.rest = rest;
	}
	
	@Override
	public void run(){
		for(int i = 1; i <= 100; i++){
			System.out.println(this.name + ":" + i);
			try {
				Thread.sleep(this.rest);
			}catch(Exception e) {}
		}
	}
}
