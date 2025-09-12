package com.ezen.interf;

import com.ezen.vo.UserVO;

public interface UserService {
	//회원가입 요청을 처리하는 메소드
	public boolean Join(UserVO vo);
	
	//아이디 중복을 검사를 처리하는 메소드
	public boolean IdCheck();
	
	//로그인 요청을 처리하는 메소드
	public UserVO Login();
}
