package ezen;

//로그인 정보를 담고 있는 클래스
public class LoginVO { //value object
	private String userID;  //사용자아이디
	private String userName;//성명
	private int    age;     //나이
	private String userTel; //전화번호
	private String gender;  //성별
	
	public String getUserID()   {   return userID;   }
	public String getUserName() {	return userName; }
	public int    getAge()      {	return age;      }
	public String getUserTel()  {	return userTel;  }
	public String getGender()   {	return gender;	 }
	
	public void setUserID(String userID)     {	this.userID   = userID;   }
	public void setUserName(String userName) {	this.userName = userName; }
	public void setAge(int age)     		 {	this.age      = age;      }
	public void setUserTel(String userTel)   {	this.userTel  = userTel;  }
	public void setGender(String gender)     {	this.gender   = gender;   }
	
	
}
