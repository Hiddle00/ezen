package com.example.ezen;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.ezen.user.UserVO;

@Controller
public class UserController {
	
	@Autowired
	private SqlSession session;
	//로그인
	//로그인 화면에 대한 요청에 응답하는 메서드
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(){
		
		return "login";
	}
	//로그인 관련된 처리를 하는 메서드 400 사용자잘못 500 개발자잘못 405 method not allowed
	@RequestMapping(value="/loginok", method = RequestMethod.POST)
	public String loginok(UserVO vo) {
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		
		UserVO user = session.selectOne("user.selectUserByIdPw", vo);
		//user가 null이 아니면 로그인상태 -> HttpSession에 저장
		
		//PRG
		//Post -> Redirect -> Get
		//포스트 요청은 머물지말고 다른곳으로 재요청하라
		//loginok에서 코드실행이 끝나면 "/"로 돌려보낸다
		return "redirect:/";
	}
	
	
	//회원가입
	
}
