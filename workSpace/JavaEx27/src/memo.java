
public class memo {
	private String no;
	private String title;
	private String note;
	private String wdate;
	
	public String getNo()    {	return no;    }
	public String getTitle() {	return title; }
	public String getNote()  {	return note;  }	
	public String getWdate() {	return wdate; }
	
	public void setNo(String no)	   {	this.no    = no;    }
	public void setTitle(String title) {	this.title = title; }
	public void setNote(String note)   {	this.note  = note;  }
	public void setWdate(String wdate) {	this.wdate = wdate; }
	
	public memo() {}
	public memo(String no, String title, String note, String wdate) {
		this.no    = no;
		this.title = title;
		this.note  = note; 
		this.wdate = wdate;
	}
	
	public void printinfo() {
		System.out.println("번호: " + no);
		System.out.println("제목: " + title);
		System.out.println("내용: " + note);
		System.out.println("날짜: " + wdate);
		System.out.println("--------------------------------");
	}
}
