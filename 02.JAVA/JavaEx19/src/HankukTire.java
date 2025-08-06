//한국 타이어 클래스
public class HankukTire extends Tire 
{
	public HankukTire()
	{
		super.setCompany("한국타이어");
		super.setInch(22);
		System.out.println("한국타이어 생성자 호출됨.");
	}
	
}