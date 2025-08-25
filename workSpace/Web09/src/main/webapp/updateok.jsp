<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ezen.*" %>
<% 
request.setCharacterEncoding("euc-kr");					//인코딩 변환
String title = request.getParameter("title");			//리퀘스트
String note  = request.getParameter("note");
String no    = request.getParameter("no");

//제목, 내용, 번호 값이 없는지 확인
if(no == null || title == null || note == null){		//쿼리 파라미터 검사
	response.sendRedirect("list.jsp");
	return;
}
if(no == "" || title == "" || note == ""){				// "
	response.sendRedirect("list.jsp");
	return;
}

//DB에 업데이트한다.
DBManager db = new DBManager();
db.DBOpen();

String sql = "";
sql  = "update memo set ";
sql += "title = '" + db._R(title) +  "', note = '" + db._R(note) + "' ";
sql += "where no = " + no;
db.RunSQL(sql);

db.DBClose();
//브라우저를 view.jsp로 보낸다.
response.sendRedirect("view.jsp?no=" + no);
%>

title : <%= title %>
<br>
note : <%= note %>

