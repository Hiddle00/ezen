package com.memo.control;

import java.io.IOException;
import java.util.*;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.memo.vo.MemoVO;

@Controller
public class MemoController 
{
	@Autowired
	private SqlSession session;
	
	private static final String namespace = "com.memo.data";
	
	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public String Index(@RequestParam(defaultValue = "1") int page,Model model) 
	{
		System.out.println("index.do run...");		

		//전체 갯수 
		int total = session.selectOne(namespace + ".total");
		
		//전체 페이지
		int maxpage = total / 10;
		if( total % 10 == 0) maxpage--;

		//시작번호 계산
		int startno = (page - 1) * 10;
		System.out.println("page:" + page);
		System.out.println("startno:" + startno);
		List<MemoVO> list =	session.selectList(namespace + ".list",startno);
		
		model.addAttribute("total", total);
		model.addAttribute("maxpage", maxpage);
		model.addAttribute("list", list);
		
		return "index";
	}	
	
	@RequestMapping(value = "/write.do", method = RequestMethod.GET)
	public String Write(Locale locale, Model model) 
	{
		System.out.println("write.do run...");
		return "write";
	}
	
	@RequestMapping(value = "/writeOK.do", method = RequestMethod.POST)
	public void WriteOK(MemoVO vo,HttpServletResponse response) throws IOException 
	{
		System.out.println("writeOK.do run...");
		
		session.insert(namespace + ".insert",vo);
		
		vo.PrintInfo();
		response.sendRedirect("view.do?no=" + vo.getNo());		
	}	
	
	@RequestMapping(value = "/view.do", method = RequestMethod.GET)
	public String View(String no,Model model) 
	{
		System.out.println("view.do run...");
		
		MemoVO vo =	session.selectOne(namespace + ".select",no);
		
		model.addAttribute("memo", vo );
		
		return "view";
	}
	
	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public void Delete(String no,HttpServletResponse response) throws IOException 
	{
		System.out.println("delete.do run...");
		
		session.delete(namespace + ".delete",no);
		
		response.sendRedirect("index.do");
	}	
	
	@RequestMapping(value = "/modify.do", method = RequestMethod.GET)
	public String Modify(String no,Model model) 
	{
		System.out.println("modify.do run...");
		
		MemoVO vo =	session.selectOne(namespace + ".select",no);
		
		model.addAttribute("memo", vo );
		
		return "modify";
	}	
	
	@RequestMapping(value = "/modifyOK.do", method = RequestMethod.POST)
	public void ModifyOK(MemoVO vo,HttpServletResponse response) throws IOException 
	{
		System.out.println("modifyOK.do run...");
		
		session.update(namespace + ".insert",vo);

		response.sendRedirect("view.do?no=" + vo.getNo());		
	}	
}
