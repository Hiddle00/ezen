//메모 게시판 구현을 위한 control
package com.ezen.control;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ezen.vo.*;

@Controller
public class MemoControl 
{
	@Autowired
	private SqlSession session;
	
	private static final String namespace = "com.ezen.memo";
	
	@RequestMapping(value = "/index.do")
	public String Index()
	{
		System.out.println("/index.do run...");
		return "index";
	}
	
	@RequestMapping(value = "/write.do")	
	public String Write()
	{
		System.out.println("/write.do run...");
		return "write";
	}	
	
	@RequestMapping(value = "/writeok.do", method = RequestMethod.POST)
	public void WriteOK(MemoVO vo, HttpServletResponse response) throws IOException
	{
		System.out.println("/writeok.do run...");
		
		session.insert(namespace + ".insert",vo);
		
		response.sendRedirect("view.do?no=" + vo.getNo());
	}	
	
	@RequestMapping(value = "/view.do")
	public String View(String no,Model model)
	{
		System.out.println("/view.do run...");
		
		MemoVO vo = session.selectOne(namespace + ".one",no);
		vo.PrintInfo();
		
		model.addAttribute("memo",vo);
		
		return "view";
	}	
	
	@RequestMapping(value = "/modify.do")
	public String Modify()
	{
		System.out.println("/modify.do run...");
		return "modify";
	}	
	
}

