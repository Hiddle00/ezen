package com.ezen.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController 
{
	@RequestMapping(value = "/index.do")
	public String Index()
	{
		return "index";
	}
	
	@RequestMapping(value = "/join.do")
	public String Join()
	{
		return "join";
	}
	
	@RequestMapping(value = "/joinok.do")
	public String JoinOK()
	{
		return "joinok";
	}	
	
	@RequestMapping(value = "/login.do")
	public String Login()
	{
		return "login";
	}
	
	@RequestMapping(value = "/loginok.do")
	public String LoginOK()
	{
		return "loginok";
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
	
	@RequestMapping(value = "/writeok.do")
	public String WriteOK()
	{
		return "writeok";
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


