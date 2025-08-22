<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ezen.*" %>    
<%
request.setCharacterEncoding("euc-kr");

String no    = request.getParameter("no");
String title = request.getParameter("title");
String note  = request.getParameter("note");

//제목 또는 내용 값이 없는지 확인
if( no == null || title == null || note == null )
{
	response.sendRedirect("list.jsp");
	return;
}
DBManager db  = new DBManager();
db.DBOpen();

String sql;
sql  = "update memo ";
sql += "set title = '" + db._R(title) + "', note = '" + db._R(note) + "' ";
sql += "where no = " + no;
db.RunSQL(sql);

db.DBClose();

//메모글 보기로 이동한다.
response.sendRedirect("view.jsp?no=" + no);
%>
    
3. update sql을 실행한다.
