package ezen;

/*
 * 모듈명 : 로그인 정보를 관리하기 위한 클래스
 * 작성일 : 2025.08.28
 * 작성자 : 홍길동
 */
public class LoginVO
{
	private String userid; //아이디
	private String name;   //이름
	
	public String getUserid() { return userid;  }
	public String getName()   { return name;	}
	
	public void setUserid(String userid) { this.userid = userid; }
	public void setName(String name)     { this.name = name;     }	
}
