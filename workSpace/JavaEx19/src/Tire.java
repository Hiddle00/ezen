//Ÿ�̾� Ŭ����
public class Tire 
{
	private String company; //������
	private int    inch;    //Ÿ�̾� ũ��
	
	public Tire()
	{
		company = "����ȸ��";
		inch    = 12;
		System.out.println("Tire ������ ȣ���.");
	}

	//getter & setter ����
	public String getCompany() {	return company; }
	public int    getInch()    {	return inch;    }

	public void setCompany(String company) {	this.company = company; }
	public void setInch(int inch)          {	this.inch    = inch;    }	
	
	//�޼ҵ� ����
	public void Roll()
	{
		System.out.println(company + "�� " + inch + "��ġ Ÿ�̾ �������ϴ�.");
	}
}
