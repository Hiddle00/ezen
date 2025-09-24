package com.ezen.control;

import java.io.*;
import java.util.*;

import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.ezen.service.*;
import com.ezen.vo.*;

@Controller
public class BoardController {
	private final static String uploadPath = "D:\\YH\\ezen\\workSpace\\SpringEx14\\upload";
	
	@Autowired
	private UserService userService;
	@Autowired
	private BoardService boardService;
	@Autowired
	private ReplyService replyService;
	
	@RequestMapping(value = "/index.do")
	public String Index(@RequestParam(defaultValue = "J")String kind
			,@RequestParam(defaultValue = "1")int page
			,Model model) {
		SearchVO vo = new SearchVO();
		vo.setKind(kind);
		System.out.println(page);
		System.out.println(vo.getPageno());
		
		//전체 갯수
		int total = boardService.GetTotal(vo);
				
		//최대 페이지 갯수
		int maxPage = total / 10;
		if((total % 10) != 0) maxPage++;
		if(total == 0) maxPage = 1; // 게시물이 없을 때 1페이지로 표시
		
		// 페이지 유효성 검사
	    if(page > maxPage) {
	        // 최대 페이지보다 큰 값을 요청하면 마지막 페이지로 리다이렉트
	        return "redirect:/index.do?kind=" + kind + "&page=" + maxPage;
	    }
	    // 페이지가 1보다 작을 경우 처리
	    if(page < 1) {
	        return "redirect:/index.do?kind=" + kind + "&page=1";
	    }

		vo.setPageno(page);
		
		//페이징 블럭 계산
		//시작블럭 = (현재페이지/10) * 10 + 1
		//끝블럭 = 시작블럭 + 10 -1
		int startBk = ((page - 1) / 10) * 10 + 1;
		int endBk = startBk + 10 - 1;
		//끝블럭 > 전체페이지 갯수면, 끝블럭 = 전체페이지 갯수
		if(endBk > maxPage) endBk = maxPage;
		//목록 조회
		List<BoardVO> list = boardService.GetList(vo);
		for(BoardVO item : list) {
			System.out.println("title" + item.getTitle());
		}
		/*
		if(vo.getKind() == "J") {
			model.addAttribute("title","※ 자바학습 게시판");
		}else {
			model.addAttribute("title","※ HTML 학습 게시판");
		}
		*/
		
		model.addAttribute("total",total);
		model.addAttribute("maxPage",maxPage);
		
		model.addAttribute("startBk",startBk);
		model.addAttribute("endBk",endBk);
		
		model.addAttribute("list",list);
		model.addAttribute("search",vo);
		
		return "index"; //포워딩
	}
	
	@RequestMapping(value = "/view.do", method = RequestMethod.GET)
	public String View(@RequestParam(required = true)String no, Model model) {
		
		//게시물 정보 조회
		BoardVO vo = boardService.Read(no, true);
		
		//댓글 목록 조회
		List<ReplyVO> list = replyService.GetList(no);
		
		model.addAttribute("item", vo);

		model.addAttribute("rList", list);
		return "view";
	}
	
	@RequestMapping(value = "/join.do")
	public String Join() {
		return "join";
	}
	
	@RequestMapping(value = "/joinok.do", method = RequestMethod.POST)
	public String JoinOK(UserVO vo) {
		userService.Join(vo);
		return "redirect:/index.do";
	}
	
	@RequestMapping(value = "/login.do")
	public String Login() {
		return "login";
	}
	
	@RequestMapping(value = "/idcheck.do")
	@ResponseBody
	public String IdCheck(@RequestParam("id")String id) {
		String msg = "";
		if(id == null || id.equals("")) {
			return "ERROR";
		}
		if(userService.IdCheck(id)) {
			msg = "DUPLICATED"; //중복됨
			System.out.println(msg);
			return msg;
		}else {
			msg = "NOT_DUPLICATED";	//중복안됨
			System.out.println(msg);
			return msg;
		}
	}
	
	@RequestMapping(value = "/loginok.do", method = RequestMethod.POST)
	@ResponseBody
	public String LoginOK(
			@RequestParam(required = true)String id,
			@RequestParam(required = true)String pw,
			HttpServletRequest request) {
		UserVO vo = new UserVO();
		//HttpSession session;
		vo.setUserid(id);
		vo.setUserpw(pw);
		vo = userService.Login(vo);
		
		if(vo == null) {
			//로그인 안됨
			request.getSession().setAttribute("login", null);
			return "false";
		}else {
			request.getSession().setAttribute("login", vo);
			return "true";
		}
	}
	
	@RequestMapping(value = "/logout.do")
	public String Logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		//session.invalidate();
		session.setAttribute("login", null);
		
		return "redirect:/index.do";
	}
	
	@RequestMapping(value = "/write.do")
	public String Write() {
		return "write";
	}
	
	@RequestMapping(value = "/writeok.do", method = RequestMethod.POST)
	public String WriteOK(BoardVO vo,HttpServletRequest request,
			@RequestParam("attach")MultipartFile file) throws IllegalStateException, IOException {
		UserVO login = (UserVO)request.getSession().getAttribute("login");
		if(login == null) {
			return "redirect:/index.do";
		}
		//게시글 작성자 아이디를 설정한다.
		vo.setUserid(login.getUserid());
		if(file != null) {
			//업로드된 원본 파일 이름 가져오기
			//tomcat소유의 임시디렉토리(temp) 서버가 리부팅되면 temp를 비운다
			String originalFileName = file.getOriginalFilename();
			System.out.println("originalFileName : " + originalFileName);
			
			//파일 이름이 중복되지 않도록 파일 이름 변경 : 서버에 저장할 이름
			// UUID 클래스 사용
			UUID uuid = UUID.randomUUID();
			String savedFileName = uuid.toString();
			System.out.println("savedFileName : " + savedFileName);
			
			//첨부파일 객체 생성
			File newFile = new File(uploadPath + "\\" + savedFileName);
			//실제 저장해야하는 폴더로 업로드 된 파일을 옮긴다.
			//실제 저장 디렉토리로 전송
			file.transferTo(newFile); //받아온 file을 newFile이 가지고있는 path에 (newFile객체에 담아서??)전송한다
			
			vo.setFname(originalFileName);	//원본파일명
			vo.setPname(savedFileName);		//저장파일명
		}
		boardService.Insert(vo);
		
		return "redirect:/view.do?no=" + vo.getNo();
	}
	
	@RequestMapping(value = "/modify.do", method = RequestMethod.GET)
	public String Modify(@RequestParam(required = true) String no, Model model) {
		BoardVO vo = boardService.Read(no, false);
		model.addAttribute("item", vo);
		
		return "modify";
	}
	
	@RequestMapping(value = "/modifyok.do", method = RequestMethod.POST)
	public String ModifyOK() {
		return "modifyok";
	}
	
	@RequestMapping(value = "/delete.do")
	public String Delete(@RequestParam(required = true) String no) {
		
		boardService.Delete(no);
		return "redirect:/index.do";
	}
	
	//첨부파일 다운로드
	@RequestMapping(value = "/down.do")
	public void Download(@RequestParam(required = true)String no,
			HttpServletResponse response) throws Exception {
		BoardVO vo = boardService.Read(no, true);
		
		File file = new File(uploadPath, vo.getPname()); ///이해
		
		// 파일명 인코딩
		//String filename = vo.getFname();
		String filename = new String(vo.getFname().getBytes("UTF-8"),"ISO-8859-1");
		
		// file 다운로드 설정
		response.setContentType("application/download");
		response.setContentLength((int)file.length());
		response.setHeader("Content-Disposition", "attatchment;filename=\"" + filename + "\"");
		///이해
		
		// 다운로드 시 저장되는 이름은 Response Header의 "Content-Disposition"에 명시
		OutputStream os = response.getOutputStream();
		
		FileInputStream fis = new FileInputStream(file);
		FileCopyUtils.copy(fis, os);

	}
	
	@RequestMapping(value = "/replyok.do",
			produces="application/text;charset=utf8", 
			method = RequestMethod.POST)
	@ResponseBody
	public String Replyok(ReplyVO vo, HttpServletRequest request) {
		
		//로그인 검사
		UserVO login = (UserVO) request.getSession().getAttribute("login");
		if (login == null) {
			return "로그인이 필요합니다.";
		}
		
		replyService.Insert(vo);
		return "댓글 등록이 완료되었습니다.";
	}
	
	@RequestMapping(value = "/delreply.do",
			produces="application/text;charset=utf8")
	@ResponseBody
	public String DelReplyok(String rno, HttpServletRequest request) {
		
		//로그인 검사
		UserVO login = (UserVO) request.getSession().getAttribute("login");
		if (login == null) {
			return "로그인이 필요합니다.";
		}
		
		replyService.Delete(rno);
		return "댓글 삭제가 완료되었습니다.";
	}
}
