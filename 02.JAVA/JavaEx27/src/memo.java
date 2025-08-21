//memo 테이블 데이터 보관용 클래스
public class memo 
{
	private String no;    //번호
	private String title; //제목
	private String note;  //내용
	private String wdate; //날짜
	
	public String getNo()    { return no;	 }
	public String getTitle() { return title; }
	public String getNote()  { return note;	 }
	public String getWdate() { return wdate; }
	
	public void setNo(String no)       { this.no = no;	     }
	public void setTitle(String title) { this.title = title; }
	public void setNote(String note)   { this.note = note;	 }
	public void setWdate(String wdate) { this.wdate = wdate; }
	
	public void PrintInfo()
	{
		System.out.println("번호:" + no);
		System.out.println("제목:" + title);
		System.out.println("내용:" + note);
		System.out.println("날짜:" + wdate);
		System.out.println("-----------------------------");
	}	
}

