package com.ezen.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ezen.service.*;
import com.ezen.vo.*;

@Controller
public class TestControl 
{
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/test.do")
	@ResponseBody
	public String Test()
	{
		String msg = "";
		
		UserVO vo = userService.Login("ezen", "ezen");
		if( vo != null )
		{
			System.out.println(vo.getUserid());
			System.out.println(vo.getName());
		}else
		{
			System.out.println("로그인 실패");
		}
		
		return msg;
	}

}
