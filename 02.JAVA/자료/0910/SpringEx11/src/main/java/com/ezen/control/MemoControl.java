//메모 게시판 구현을 위한 control
package com.ezen.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	
	/*
	@RequestMapping(value = "/make.do")
	public void Make(HttpServletResponse response) throws IOException
	{
		MemoVO vo = new MemoVO();
		vo.setNote("내용입니다.");
		for(int i = 1; i <= 477; i++)
		{
			String title = String.format("[%03d]번제 제목입니다.",i);
			vo.setTitle(title);
			session.insert(namespace + ".insert",vo);
		}
		response.sendRedirect("index.do");
	}
	*/
	
	@RequestMapping(value = "/index.do")
	public String Index(@RequestParam(defaultValue = "1")int page,Model model)
	{
		System.out.println("/index.do run...");
		
		//전체 데이터 갯수를 얻는다.
		int total = session.selectOne(namespace + ".total");
		
		//전체 페이지 갯수를 계산
		int maxpage = total / 10;
		if( total % 10 != 0) maxpage++;	
		
		//limit에서 startno를 계산한다.
		int startno = (page - 1) * 10;
		
		List<MemoVO> list = session.selectList(namespace + ".list",startno);
	
		model.addAttribute("total",total);
		model.addAttribute("maxpage",maxpage);
		model.addAttribute("list",list);
		
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
	
	@RequestMapping(value = "/delete.do")
	public void Delete(String no,HttpServletResponse response) throws IOException
	{
		session.delete(namespace + ".delete",no);
		
		response.sendRedirect("index.do");
	}
	
	
	@RequestMapping(value = "/modify.do")
	public String Modify(String no,Model model)
	{
		System.out.println("/modify.do run...");
		
		MemoVO vo = session.selectOne(namespace + ".one",no);
		vo.PrintInfo();
		
		model.addAttribute("memo",vo);		
		
		return "modify";
	}	
	
	@RequestMapping(value = "/modifyok.do")
	public void ModifyOK(MemoVO vo,HttpServletResponse response) throws IOException
	{
		System.out.println("/modifyok.do run...");
		session.update(namespace + ".modify",vo);
		response.sendRedirect("view.do?no=" + vo.getNo());	
	}	
}

