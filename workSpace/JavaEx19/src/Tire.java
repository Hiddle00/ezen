//타이어 클래스
public class Tire 
{
	private String company; //제조사
	private int    inch;    //타이어 크기
	
	public Tire()
	{
		company = "무명회사";
		inch    = 12;
		System.out.println("Tire 생성자 호출됨.");
	}

	//getter & setter 설정
	public String getCompany() {	return company; }
	public int    getInch()    {	return inch;    }

	public void setCompany(String company) {	this.company = company; }
	public void setInch(int inch)          {	this.inch    = inch;    }	
	
	//메소드 선언
	public void Roll()
	{
		System.out.println(company + "의 " + inch + "인치 타이어가 굴러갑니다.");
	}
}
