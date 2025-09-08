package com.ezen.control;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.dto.*;
import com.ezen.vo.*;

@Controller
public class HomeController 
{
	@Autowired
	private DataDTO dto;
	
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Model model) 
	{
		/*
		DataVO vo = new DataVO();
		vo.setNo("1");
		vo.setTitle("제목입니다.");
		*/
		DataVO vo = dto.Read("1");
		
		model.addAttribute("vo",vo);		
		return "home";
	}
	
	@RequestMapping(value = "/list.do")
	public String list(Model model)
	{
		List<DataVO>  list  = dto.getList();
		
		model.addAttribute("list", list );			
		return "list";
	}
	
}
