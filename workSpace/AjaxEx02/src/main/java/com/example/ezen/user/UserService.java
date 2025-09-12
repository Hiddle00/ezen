package com.example.ezen.user;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	//sqlsession을 이용한 쿼리 실행
	//mapper 호출
	
	@Autowired
	private SqlSession session;
	
	//id체크 mybatis 매터 호출
	public int idCheck(String id){
		return session.selectOne("user.idCheck", id);
	}

}
