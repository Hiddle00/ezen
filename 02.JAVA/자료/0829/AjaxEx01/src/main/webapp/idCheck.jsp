<%@page import="ezen.DBManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	System.out.println(id);
	//누군가가 id를 주면 id값이 user테이블에 있는지 확인
	//select count(*) from user where id = hong;
	//해당 id가 테이블에 존재하는 개수만 세서 응답
	DBManager manager = new DBManager();
	manager.DBOpen();
	
	String sql = "select count(*) as cnt from user where userid = '"+id+"'";
	//select * from user where userid = 'null';
	//user테이블에 userid가 파라미터로 받은 id랑 값이 똑같은 행이 몇개인지
	manager.OpenSelect(sql);
	
	String cnt = "2";
	if(manager.Next()){
		cnt = manager.GetValue("cnt");
		System.out.println(cnt);
	}
	
	manager.CloseSelect();
	manager.DBClose();
	
	out.print(cnt);
%>