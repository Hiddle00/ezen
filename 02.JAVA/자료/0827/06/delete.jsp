<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%
//1. no 값을 받는다.
String no = request.getParameter("no");
if( no == null )
{
	response.sendRedirect("index.jsp");
	return;
}

//2. DB에 연결한다.
DBManager db = new DBManager();
db.DBOpen();

//3. delete 구문으로 삭제한다. 
//   테이블 삭제 순서  reply -> board
String sql = "";
sql = "delete from reply where no = " + no;
db.RunSQL(sql);

sql = "delete from board where no = " + no;
db.RunSQL(sql);

//4. DB 연결을 닫는다.
db.DBClose();

//5. index.jsp 보낸다.
response.sendRedirect("index.jsp");
%>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>