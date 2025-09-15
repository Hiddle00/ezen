package com.ezen.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ezen.service.UserService;
import com.ezen.vo.UserVO;
import com.mysql.cj.Session;

@Controller
public class BoardController {
	@Autowired
	private UserService userService;
	@Autowired
	private SqlSession session;
	
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
	
	@RequestMapping(value = "/joinok.do", method = RequestMethod.POST)
	public String JoinOK(UserVO vo) {
		userService.Join(vo);
		return "redirect:/index.do";
	}
	
	@RequestMapping(value = "/login.do")
	public String Login() {
		return "login";
	}
	
	@RequestMapping(value = "/idcheck.do")
	@ResponseBody
	public String IdCheck(@RequestParam("id")String id) {
		String msg = "";
		if(id == null || id.equals("")) {
			return "ERROR";
		}
		if(userService.IdCheck(id)) {
			msg = "DUPLICATED"; //중복됨
			System.out.println(msg);
			return msg;
		}else {
			msg = "NOT_DUPLICATED";	//중복안됨
			System.out.println(msg);
			return msg;
		}
	}
	
	@RequestMapping(value = "/loginok.do", method = RequestMethod.POST)
	@ResponseBody
	public String LoginOK(
			@RequestParam(required = true)String id,
			@RequestParam(required = true)String pw,
			HttpServletRequest request) {
		UserVO vo = new UserVO();
		//HttpSession session;
		vo.setUserid(id);
		vo.setUserpw(pw);
		vo = userService.Login(vo);
		
		if(vo == null) {
			//로그인 안됨
			request.getSession().setAttribute("login", null);
			return "false";
		}else {
			request.getSession().setAttribute("login", vo);
			return "true";
		}
	}
	
	@RequestMapping(value = "/logout.do")
	public String Logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		//session.invalidate();
		session.setAttribute("login", null);
		
		return "redirect:/index.do";
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
