package com.ezen.control;

import java.util.List;

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
	
	@Autowired
	BoardService boardService;
	
	@Autowired
	ReplyService replyService;	
	
	@RequestMapping(value = "/test.do")
	@ResponseBody
	public String Test()
	{
		ReplyVO vo = new ReplyVO();
		vo.setNo("7");
		vo.setRnote("댓글입니다.");
		vo.setUserid("ezen");
		
		replyService.Insert(vo);
		
		List<ReplyVO> list = replyService.GetList("7");
		for(ReplyVO v : list) 
		{
			System.out.println(v.getRnote());
		}
		
		replyService.Delete("1");
		
		return "OK";
	}

}
