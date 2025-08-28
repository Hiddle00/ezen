<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include/head.jsp" %>
<%
String userid = request.getParameter("userid");
String userpw = request.getParameter("userpw");

if(userid == null || userpw == null){
	response.sendRedirect("login.jsp");
	return;
}

%>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
로그인이 완료되었습니다.
<br>
<a href="index.jsp">처음 화면으로 돌아가기</a>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="include/tail.jsp" %>