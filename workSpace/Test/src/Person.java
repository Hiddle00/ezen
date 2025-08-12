//회원정보
public class Person 
{	
	private String id;   //아이디
	private String pw;   //비밀번호
	private String name; //이름
	private int    age;  //나이
	private String addr; //주소
	private String mail; //메일주소
	
	public String getId()   {  return id;   }
	public String getPw()   {  return pw;   }
	public String getName() {  return name; } 
	public int 	  getAge()  {  return age;  }
	public String getAddr() {  return addr; }
	public String getMail() {  return mail; }
	
	public void setId(String id)     {	this.id   = id;   }
	public void setPw(String pw)     {	this.pw   = pw;   }
	public void setName(String name) {	this.name = name; }
	public void setAge(int age)      {	this.age  = age;  }
	public void setAddr(String addr) {	this.addr = addr; }
	public void setMail(String mail) {	this.mail = mail; }
	
}
