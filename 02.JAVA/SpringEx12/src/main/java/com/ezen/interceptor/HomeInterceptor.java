package com.ezen.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class HomeInterceptor implements HandlerInterceptor
{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception 
	{
		//컨트롤러가 호출되기 전에 실행됨
		//컨트롤러가 실행 이전에 처리해야 할 작업이 있는경우 혹은 요청정보를 가공하거나 추가하는경우 사용
		//실행되어야 할 '핸들러'에 대한 정보를 인자값으로 받기때문에 '서블릿 필터'에 비해 세밀하게 로직을 구성할수 있음
		//리턴값이 boolean이다. 리턴이 true 일경우 preHandle() 실행후 핸들러에 접근한다. false일경우 작업을 중단하기 때문에 컨트롤러와 남은 인터셉터가 실행되지않는다.
		
		System.out.println("HomeInterceptor:preHandle()...");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception 
	{
		// 핸들러가 실행은 완료 되었지만 아직 View가 생성되기 이전에 호출된다.
		// ModelAndView 타입의 정보가 인자값으로 받는다. 따라서 Controller에서 View 정보를 전달하기 위해 작업한        Model 객체의 정보를 참조하거나 조작할수 있다.
		// preHandle() 에서 리턴값이 fasle인경우 실행되지않음.
		// 적용중인 인터셉터가 여러개 인경우, preHandle()는 역순으로 호출된다.
		// 비동기적 요청처리 시에는 처리되지않음.		
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception 
	{
		// 모든 View에서 최종 결과를 생성하는 일을 포함한 모든 작업이 완료된 후에 실행된다.
		// 요청 처리중에 사용한 리소스를 반환해주기 적당한 메서드 이다.
		// preHandle() 에서 리턴값이 false인경우 실행되지 않는다.
		// 적용중인 인터셉터가 여러개인경우 preHandle()는 역순으로 호출된다.
		// 비동기적 요청 처리시에 호출되지않음.
		
	}

}
