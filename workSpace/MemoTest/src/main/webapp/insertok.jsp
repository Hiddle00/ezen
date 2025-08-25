<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ezen.*" %>
<%
DBManager db = new DBManager();
db.DBOpen();

String sql = "";
sql  = "insert into memo ";
sql += "(title, note) ";
sql += "values(title ='" + db._R(title) + "', note='" + db._R(note) + "')";
db.RunSQL(sql);

db.DBClose();

//작성한 글 번호를 받는코드
String no = ""; 
<>
if(no == null){
	response.sendRedirect("list.jsp");
	return;
}
	
response.sendRedirect("view.jsp?no=" + no);
%>
