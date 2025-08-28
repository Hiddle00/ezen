<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String id = request.getParameter("id");
	System.out.println(id);
	//누군가가 id를 주면 id값이 유저테이블에 있는지 확인
	//select count(*) from user where id = ;
	//해당 id가 테이블에 존재하는 개수만 세서 응답
	if(id.equals("hong")){
		out.print(1);
	}else{
		out.print(0);
	}
%>