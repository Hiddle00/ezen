package com.ezen.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ezen.service.*;
import com.ezen.vo.*;

@Controller
public class TestControl {
	
	@Autowired
	UserService userService;
	@Autowired
	BoardService boardservice;
	@Autowired
	ReplyService replyService;
	
	@RequestMapping(value = "/test.do")
	@ResponseBody
	public String Test() {
		
		return "";
		/*
		 *
		ReplyVO vo = new ReplyVO();
		vo.setNo("1");
		vo.setRnote("댓글입니다.");
		vo.setUserid("hong");
		replyService.Insert(vo);
		String no = vo.getRno();
		
		List<ReplyVO> list = replyService.GetList("1");
		for(ReplyVO v : list ) {
			System.out.println(v.getRnote());
		}
		
		if(replyService.Delete("4")) {
			System.out.println("ture");
			return "ture";
		}else {
			System.out.println("false");
			return "false";
		}
		
		
		
		SearchVO vo = new SearchVO();
		vo.setPageno(5);
		vo.setKind("J");
		vo.setKeyword("제목");
		
		int total = boardservice.GetTotal(vo);
		System.out.println(total);
		
		List<BoardVO> list = boardservice.GetList(vo);
		for(BoardVO v : list) {
			System.out.println("번호 : " + v.getNo());
			System.out.println("제목 : " + v.getTitle());
			System.out.println("---------------------------");
		}
		return "OK";
		
		
		
		boardservice.Delete("6");
		return "OK";
		
		BoardVO vo = boardservice.Read("6", true);
		System.out.println(vo.getTitle());
		System.out.println(vo.getName());
		
		vo.setTitle("변경된 제목입니다.");
		boardservice.Update(vo);
		return "OK";
		
		 
		BoardVO vo = boardservice.Read("6", true);
		System.out.println(vo.getTitle());
		System.out.println(vo.getName());
		return "OK";
		
		
		
		BoardVO vo = new BoardVO();

		vo.setUserid("hong");
		vo.setKind("H");
		vo.setNote("내용입니다.");
		
		for(int i= 1; i <= 477; i++) {
			//String title = String.format("[%3d번째 JAVA 자료입니다.", i);
			String title = String.format("[%3d번째 HTML 자료입니다.", i);
			vo.setTitle(title);
			boardservice.insert(vo);
		}
		String msg = "";
		msg = "no : " + vo.getNo();
		return msg;
		
		
		UserVO vo = new UserVO();
		String msg = "";
		
		vo.setUserid("hong");
		if(userService.IdCheck("ezen")) {
			msg = "duplicated"; //중복됨
		}else {
			msg = "not dup";	//중복안됨
		}
		
		
		UserVO vo = new UserVO();
		vo.setUserid("hong");
		vo.setUserpw("1234");
		vo.setName("홍길동");
		vo.setGender("M");
		vo.setHobby("1");
		//서비스를 이용해서 등록한다
		userService.Join(vo);
		*/
	}

}
