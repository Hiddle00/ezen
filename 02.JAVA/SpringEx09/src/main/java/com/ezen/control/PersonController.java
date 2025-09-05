package com.ezen.control;

import com.ezen.vo.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController 
{
	@RequestMapping(value = "/person.do")
	public String Person(HttpServletRequest request,
			PersonVO vo,Model model) 
	{
		System.out.println("PersonController:Person()...");
		
		System.out.println("입력방식:" + request.getMethod());
		if( request.getMethod().equals("GET"))
		{
			//GET 방식으로 넘어옴.
			return "input";
		}else
		{
			//POST 방식으로 넘어옴.
			model.addAttribute("hong",vo);
			return "output";
		}
	}
}


