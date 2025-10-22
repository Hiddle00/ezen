/***********************************
 * 클래스 기능 : 회원정보 C/R/U/D 처리 클래스
 * 작성자 : 정정훈
 * 작성일 : 2025.09.12
 **********************************/
package com.ezen.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.vo.*;

@Service
public class UserService 
{
	@Autowired
	private SqlSession session;
	
	private static final String namespace = "com.ezen.board";
	
	//회원가입
	//return true : 가입 성공, false : 가입 실패
	public boolean Join(UserVO vo) 
	{
		if( CheckID(vo.getUserid()) == true )
		{
			//중복된 ID임.
			return false;
		}
		session.insert(namespace + ".join",vo);
		
		return true;
	}
	
	//아이디 중복검사
	//return true : 아이디 중복, false : 중복안됨
	public boolean CheckID(String id)
	{
		int total = session.selectOne(namespace + ".checkid",id);
		if( total > 0)
		{
			return true;
		}
		return false;
	}	

	//로그인
	public UserVO Login(String id,String pw)
	{
		UserVO vo = new UserVO();
		vo.setUserid(id);
		vo.setUserpw(pw);
		
		vo = session.selectOne(namespace + ".login",vo);
		return vo;
	}
}
