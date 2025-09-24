/************************************
 * 클래스 기능 : 댓글 정보 클래스
 * 작성자 : 최연흠
 * 작성일 : 2025.09.12
 ************************************/
package com.ezen.vo;

public class ReplyVO {
	private String rno;	 	 //댓글번호
	private String no;	 	 //게시물번호
	private String userid;	 //아이디
	private String rnote;	 //댓글내용
	private String rwdate;	 //댓글작성일
	
	//조회를 위한 추가항목(필드)
	private String name; //작성자 이름
	
	
	
	
	public String getRno()	  {	return rno;		}
	public String getNo()	  {	return no;		}
	public String getUserid() {	return userid;	}
	public String getRnote()  {	return rnote;	}
	public String getRwdate() {	return rwdate;	}
	public String getName()   {	return name;	}
	
	public void setRno(String rno)		 {	this.rno	= rno;		}
	public void setNo(String no)		 {	this.no		= no;		}
	public void setUserid(String userid) {	this.userid = userid;	}
	public void setRnote(String rnote)	 {	this.rnote  = rnote;	}
	public void setRwdate(String rwdate) {	this.rwdate = rwdate;	}
	public void setName(String name) 	 {	this.name	= name;		}
}
