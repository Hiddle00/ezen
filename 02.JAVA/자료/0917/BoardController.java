package com.ezen.control;

import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ezen.service.*;
import com.ezen.vo.*;

@Controller
public class BoardController 
{
	private static final String HttpServletRequest = null;
	@Autowired
	UserService  userService;
	@Autowired
	BoardService boardService;
	@Autowired
	ReplyService replyService;	
	
	
	@RequestMapping(value = "/index.do")
	public String Index()
	{
		return "index";
	}

	@RequestMapping(value = "/idcheck.do")
	@ResponseBody 
	public String IDCheck(@RequestParam("id")String id)
	{
		if(id == null || id.equals(""))
		{
			//빈 id가 넘어온 경우.
			return "ERROR";
		}
		if( userService.CheckID(id) == true )
		{
			return "DUPLICATED";
		}else
		{
			return "NOT_DUPLICATED";
		}
	}
	
	@RequestMapping(value = "/join.do")
	public String Join()
	{
		return "join";
	}
	
	@RequestMapping(value = "/joinok.do", method = RequestMethod.POST)
	public String JoinOK(UserVO vo)
	{
		/*
		System.out.println("id:" + vo.getUserid());
		System.out.println("pw:" + vo.getUserpw());
		System.out.println("nm:" + vo.getName());
		*/
		
		userService.Join(vo);
		
		return "redirect:/index.do";
	}	
	
	@RequestMapping(value = "/login.do")
	public String Login()
	{
		return "login";
	}
	
	@RequestMapping(value = "/loginok.do", method = RequestMethod.POST)
	@ResponseBody 
	public String LoginOK(String id,String pw,
			HttpServletRequest request)
	{	
		HttpSession session = request.getSession();
		
		UserVO vo = userService.Login(id, pw);
		if(vo == null)
		{
			//로그인 안됨.	
			session.setAttribute("login", null);
			return "false";
		}else
		{
			session.setAttribute("login", vo);
			return "true";
		}
	}	
	
	@RequestMapping(value = "/logout.do")
	public String LogOut(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		//session.invalidate();
		session.setAttribute("login", null);
		return "redirect:/index.do";
	}
	
	@RequestMapping(value = "/view.do")
	public String View()
	{
		return "view";
	}
	
	@RequestMapping(value = "/write.do")
	public String Write()
	{
		return "write";
	}	
	
	@RequestMapping(value = "/writeok.do", method = RequestMethod.POST)
	public String WriteOK(BoardVO vo,HttpServletRequest request)
	{
		//로그인 정보를 조회한다.
		UserVO login = (UserVO)request.getSession().getAttribute("login");
		if(login == null)
		{
			return "redirect:/index.do";
		}
		//게시글 작성자 아이디를 설정한다.
		vo.setUserid(login.getUserid());
		
		boardService.Insert(vo);
		
		return "redirect:/view.do?no=" + vo.getNo();
	}	
	
	@RequestMapping(value = "/delete.do")
	public String Delete()
	{
		return "delete";
	}	
	
	@RequestMapping(value = "/modify.do")
	public String Modify()
	{
		return "modify";
	}
	
	@RequestMapping(value = "/modifyok.do")
	public String ModifyOK()
	{
		return "modifyok";
	}	
}


