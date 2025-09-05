package com.ezen.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.vo.PersonVO;

@Controller
public class PersonController {
	@RequestMapping(value = "/person.do")
	public String Person(HttpServletRequest request
			, PersonVO vo
			, Model model) {
		System.out.println("PersonController:Person()...");
		
		System.out.println("입력방식: " + request.getMethod());
		if( request.getMethod().equals("GET")) {
			//GET방식으로 넘어올 때
			return "input";
		}else {
			//POST방식으로 넘어올 때
			model.addAttribute("hong", vo);
			return "output";
		}
	}
}
