//자동차 클래스
public class Car 
{
	private String company;  //제조사
	private int    maxspeed; //최대 속도
	private String name;     //차종
	
	//생성자 1번
	public Car()
	{
		company  = "현대자동차";
		maxspeed = 200;
		name     = "승용차";
		System.out.println("Car 클래스가 생성됨(1).");
	}
	
	//생성자 2번
	public Car(String name)
	{
		this();
		this.name = name;
		System.out.println("Car 클래스가 생성됨(2).");
	}
	
	public String getCompany()  {	return company;  }
	public int    getMaxspeed() {	return maxspeed; }
	public String getName()     {	return name;     }

	public void setCompany(String company) {  this.company  = company;  }
	public void setMaxspeed(int maxspeed)  {  this.maxspeed = maxspeed; }
	public void setName(String name)       {  this.name     = name;     }
	
	public void Run()
	{
		System.out.println("자동차가 달립니다.");
	}
	
}
