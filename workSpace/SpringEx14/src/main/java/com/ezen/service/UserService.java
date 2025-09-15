/************************************
 * 클래스 기능 : 회원 정보 C/R/U/D 클래스
 * 작성자 : 최연흠
 * 작성일 : 2025.09.12
 ************************************/
package com.ezen.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.vo.UserVO;
//프로토타입 ->
@Service
public class UserService {
	
	@Autowired
	private SqlSession session;
	private static final String namespace = "com.ezen.board";
	
	//회원가입
	//return true : 가입 성공, false : 가입 실패
	public boolean Join(UserVO vo) {
		if(!IdCheck(vo.getUserid())) {
			session.insert(namespace + ".join", vo);
			return true;
		}
		return false;
	}
	
	//아이디 중복 확인
	//retrue true : 아이디 중복, false : 중복 아님 
	public boolean IdCheck(String id) {
		int result = session.selectOne(namespace + ".idcheck",id);
		if( result > 0 ) {
			return true;
		}
		return false;
	}
		
	//로그인
	//return UserVO / session에 로그인한 유저 정보를 집어넣어야 함
	public UserVO Login(UserVO vo) {
		
		vo = session.selectOne(namespace + ".login", vo);
		//pw를 브라우저에서 받을때 암호화 해서 받는게 좋지 않나?
		return vo;
	}

	/*
	
	
	//로그아웃
	public void Logout() {
	
	}
	*/
}
