<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ezen.*" %>
<%
request.setCharacterEncoding("euc-kr");

String title = request.getParameter("title");
String note = request.getParameter("note");

//제목 또는 내용 값이 없는지 확인
if(title == null || note == null){
	response.sendRedirect("insert.jsp");
	return;
}
if(title == "" || note == ""){
	response.sendRedirect("insert.jsp");
	return;
}

//memo 테이블에 자료를 등록한다.
ezen.DBManager db = new ezen.DBManager();

db.DBOpen();

//sql인젝션
//title = title.replace("'", "''");
//note  = note.replace("'","''");

//String sql = "";
//sql  = "insert into memo ";
//sql += "(title, note) ";
//sql += "values ( '" + title + "', '" + note + "')";
//db.RunSQL(sql);

String sql = "";
for(int i = 1; i <= 497; i++){
sql  = "insert into memo ";
sql += "(title, note) ";
sql += "values ( '" + db._R(title) + "', '" + db._R(note) + "')";
db.RunSQL(sql);
}
//메모 등록 후 부여된 번호를 얻는다.
sql = "select last_insert_id() as no";
db.OpenSelect(sql);
db.Next();
String no = db.GetValue("no");
db.CloseSelect();

db.DBClose();

//메모글 보기 페이지로 이동시킨다.
response.sendRedirect("view.jsp?no=" + no);
%>
