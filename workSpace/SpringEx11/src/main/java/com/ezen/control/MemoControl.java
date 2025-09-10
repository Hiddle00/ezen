//Memo게시판 구현을 위한 control
package com.ezen.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ezen.vo.MemoVO;

@Controller
public class MemoControl {
	
	@Autowired
	private SqlSession session;
	private static final String namespace = "com.ezen.memo";
	
	@RequestMapping(value = "/index.do")
	public String index(@RequestParam(defaultValue = "1")int page,Model model) {
		System.out.println("index.do run...");
		int total = session.selectOne(namespace + ".total");
		int maxPage = (total % 10 != 0) ? (total / 10) + 1 : (total / 10);
		int startNo = (page - 1) * 10;
		int curPage = page;
		List<MemoVO> list = session.selectList(namespace + ".list", startNo);
		model.addAttribute("total", total);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("curPage", curPage);
		model.addAttribute("list", list);
		
		return "index";
	}
	
	@RequestMapping(value = "/write.do")
	public String write() {
		System.out.println("write.do run...");
		return "write";
	}
	
	@RequestMapping(value = "/writeok.do", method = RequestMethod.POST)
	public void writeOK(MemoVO vo, HttpServletResponse response) throws IOException {
		System.out.println("writeok.do run...");
//		
//		MemoVO vo = new MemoVO();
//		vo.setTitle("제목입니다");
//		vo.setNote("내용입니다.");
		session.insert(namespace + ".insert", vo);
		
		response.sendRedirect("view.do?no=" + vo.getNo());
	}
	
	@RequestMapping(value = "/view.do")
	public String view(String no, Model model) {
		System.out.println("view.do run...");
		
		MemoVO vo = session.selectOne(namespace + ".one", no);
		vo.PrintInfo();
		
		model.addAttribute("memo", vo);
		
		return "view";
	}
	
	@RequestMapping(value = "/delete.do")
	public void delete(String no,HttpServletResponse response) throws IOException {
		session.delete(namespace + ".delete",no);
		
		response.sendRedirect("index.do");
	}
	
	@RequestMapping(value = "/modify.do")
	public String modify(String no, Model model) {
		System.out.println("modify.do run...");
		
		MemoVO vo = session.selectOne(namespace + ".one", no);
		vo.PrintInfo();
		
		model.addAttribute("memo", vo);
		
		return "modify";
	}
	
	@RequestMapping(value = "/modifyok.do")
	public void modifyok(MemoVO vo,HttpServletResponse response) throws IOException {
		System.out.println("modifyok.do run...");
		
		session.update(namespace + ".modify", vo);
		
		response.sendRedirect("view.do?no=" + vo.getNo());
	}
}
