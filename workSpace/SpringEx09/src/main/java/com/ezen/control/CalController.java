//ModelAndView를 이용한 초간단 계산기
package com.ezen.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalController {
	
	/*
	@RequestMapping(value = "/cal.do", method = {RequestMethod.GET,RequestMethod.POST})
	public String Cal(HttpServletRequest request, Model model) {
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		if(x == null) { x = "1"; }
		if(y == null) { y = "1"; }
		
		int z = Integer.parseInt(x) + Integer.parseInt(y);
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		System.out.println("z:" + z);
		
		model.addAttribute("x",x);
		model.addAttribute("y",y);
		model.addAttribute("z",z);
		return "cal"; //cal.jsp를 해석해서 브라우저로 전송한다.
	} */
	
	@RequestMapping(value = "/cal.do", method = {RequestMethod.GET,RequestMethod.POST})
	public String Cal(@RequestParam(required = false, defaultValue = "1")int x,
			@RequestParam(required = false, defaultValue = "1")int y, Model model) {
		
		System.out.println("CalContoller:Cal() 2번째 구동됨.");
		
		int z = x + y;
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		System.out.println("z:" + z);
		
		model.addAttribute("x",x);
		model.addAttribute("y",y);
		model.addAttribute("z",z);
		return "cal.do";
	}
}
