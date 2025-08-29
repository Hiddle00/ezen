<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	//JDBC이용해서 insert
	//insert into user(id, pw) values(id, pw);
	
	//로그인페이지로 redirect
	
%>