package com.example.ezen.user;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	//로그인
	//화면
	
	@Autowired
	private SqlSession session;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(){
		return "login";
		//web-inf/views/login.jsp
	}
	
	//처리
	@RequestMapping(value="/loginok", method=RequestMethod.POST)
	public String loginok(UserVO vo) {
		///loginok?id=hong&pw=1234
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		//select
		//select * from user where id = ? and pw = ?;
		
		UserVO user = session.selectOne("user.login", vo);
		//user가 null이 아니면 로그인 -> HttpSession에 저장
		
		//PRG
		//Post -> Redirect -> Get
		//loginok에서 코드실행이 끝나면 "/"로 돌려보낸다
		return "redirect:/";
		//response.sendRedirect("/");
	}
	
	//회원가입
}
