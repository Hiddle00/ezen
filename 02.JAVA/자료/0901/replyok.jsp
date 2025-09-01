<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<%
//한글 처리
request.setCharacterEncoding("utf-8");

//no, rnote를 받는다.
String no    = request.getParameter("no");
String rnote = request.getParameter("rnote");
if( no == null || rnote == null )
{
	response.sendRedirect("index.jsp");
	return;
}

DBManager db = new DBManager();
db.DBOpen();

//댓글을 등록한다.
String sql = "";
sql += "insert into reply (no,userid,rnote) ";
sql += "values ('" + no + "',";
sql += "'" + login.getUserid() + "',";
sql += "'" + db._R(rnote) + "'";
sql += ") ";
db.RunSQL(sql);

db.DBClose();

//게시물 보기 페이지로 이동한다.
response.sendRedirect("view.jsp?no=" + no);
%>
<%@ include file="./include/tail.jsp" %>
