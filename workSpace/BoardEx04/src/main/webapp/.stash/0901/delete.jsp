<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include/head.jsp" %>
<%
String no = request.getParameter("no");
if(no == null){
	response.sendRedirect("index.jsp");
	return;
}

DBManager db = new DBManager();
db.DBOpen();

String spl = "";
sql  = "select userid";
sql += "from user";
sql += "from user";
//삭제하려는 게시물이 로그인한 유저가 작성한 글인지 검사

db.DBClose();
%>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
글이 삭제되었습니다.
<br>
<a href="index.jsp">목록으로 돌아가기</a>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="include/tail.jsp" %>