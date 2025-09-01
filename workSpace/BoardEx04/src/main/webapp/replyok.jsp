<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<%
//인코딩 변환
request.setCharacterEncoding("utf-8");

String no    = request.getParameter("no");
String rnote = request.getParameter("rnote");

if(no == null || rnote == null){
	response.sendRedirect("view.jsp?no=" + no);
	return;
}

DBManager db = new DBManager();
db.DBOpen();
String sql = "";

sql  = insert into reply(no,rnote,userid)
db.DBClose();
%>


<%@ include file="./include/tail.jsp" %>    