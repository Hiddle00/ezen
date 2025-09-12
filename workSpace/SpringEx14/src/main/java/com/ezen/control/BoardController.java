package com.ezen.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ezen.service.UserService;
import com.ezen.vo.UserVO;

@Controller
public class BoardController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/index.do")
	public String Index() {
		return "index"; //포워딩
	}
	
	@RequestMapping(value = "/view.do")
	public String View() {
		return "view";
	}
	
	@RequestMapping(value = "/join.do")
	public String Join() {
		return "join";
	}
	
	@RequestMapping(value = "/joinok.do")
	public String JoinOK(UserVO vo) {
		userService.Join(vo);
		return "joinok";
	}
	
	@RequestMapping(value = "/login.do")
	public String Login() {
		return "login";
	}
	
	@RequestMapping(value = "/loginok.do")
	public String LoginOK(
			@RequestParam(required = true)String id,
			@RequestParam(required = true)String pw) {
		UserVO vo = new UserVO();
		String msg;
		vo.setUserid(id);
		vo.setUserpw(pw);
		if(userService.IdCheck(id)) {
			msg = "duplicated"; //중복됨
			System.out.println(msg);
		}else {
			msg = "not dup";	//중복안됨
			System.out.println(msg);
		}
		vo = userService.Login(vo);
		return "loginok";
	}
	
	@RequestMapping(value = "/write.do")
	public String Write() {
		return "write";
	}
	
	@RequestMapping(value = "/writeok.do")
	public String WriteOK() {
		return "writeok";
	}
	
	@RequestMapping(value = "/modify.do")
	public String Modify() {
		return "modify";
	}
	
	@RequestMapping(value = "/modifyok.do")
	public String ModifyOK() {
		return "modifyok";
	}
	
	@RequestMapping(value = "/delete.do")
	public String Delete() {
		return "delete";
	}
	
	
}
