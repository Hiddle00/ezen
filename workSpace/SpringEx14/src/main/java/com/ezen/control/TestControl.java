package com.ezen.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ezen.service.UserService;
import com.ezen.vo.UserVO;

@Controller
public class TestControl {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/test.do")
	@ResponseBody
	public String Test() {
		UserVO vo = new UserVO();
		String msg = "";
		
		vo.setUserid("hong");
		if(userService.IdCheck("ezen")) {
			msg = "duplicated"; //중복됨
		}else {
			msg = "not dup";	//중복안됨
		}
		
		
		/*
		UserVO vo = new UserVO();
		vo.setUserid("hong");
		vo.setUserpw("1234");
		vo.setName("홍길동");
		vo.setGender("M");
		vo.setHobby("1");
		//서비스를 이용해서 등록한다
		userService.Join(vo);
		*/
		return msg;
	}

}
