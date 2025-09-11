//캡차 이미지 처리용 control
package com.ezen.control;

import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import nl.captcha.Captcha;
import nl.captcha.Captcha.Builder;
import nl.captcha.backgrounds.FlatColorBackgroundProducer;

@Controller
public class SignControl 
{
	@RequestMapping(value = "/sign.do")
	public void Sign(HttpServletRequest request, 
			HttpServletResponse response) throws IOException
	{
		System.out.println("SignControl:Sign()...run..");
		
		// 자동 등록 방지 코드를 생성할 객체들을 선언합니다
		Captcha mCaptcha;
		Builder mBuilder;
		String  mAnswer;

		// 자동 등록방지코드를 생성하고, 코드를 이미지로 변환, 이미지를 출력(반환)
		mBuilder = new Captcha.Builder(160,50);
		// 빌더에 문자열을 추가
		mBuilder.addText();
		// 빌더에 배경색을 추가
		mBuilder.addBackground(new FlatColorBackgroundProducer(Color.WHITE));
		// 외각선 추가
		mBuilder.addBorder();
		// 노이즈 추가
		mBuilder.addNoise();
		// 셋팅이된 내용으로 빌더에게 captcha를 생성 요청함
		mCaptcha = mBuilder.build();
		// captcha가 갖고있는 정답을 문자열로 저장해둡니다
		mAnswer  = mCaptcha.getAnswer();

		// captcha를 이미지로 반환하고 브라우저에 응답?
		OutputStream mOut = response.getOutputStream();
		ImageIO.write(mCaptcha.getImage(), "jpg", mOut);
		mOut.close();

		// 세션에, 정답을 저장합니다
		System.out.println("정답:" + mAnswer);
		request.getSession().setAttribute("sign",mAnswer);				
	}
	
	//캡챠 서명 
	@RequestMapping(value = "/getsign.do")
	@ResponseBody	//다른 과정 거치지않고 브라우저에 직접 응답 String mAnswer = 
	public String GetSign(HttpServletRequest request, HttpServletResponse response) 
	{
		return (String)request.getSession().getAttribute("sign");
	}	
}
