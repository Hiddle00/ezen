<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<%
String no = request.getParameter("no");
if( no == null )
{
	response.sendRedirect("index.jsp");
	return;
}

DBManager db = new DBManager();
db.DBOpen();

String sql;

//삭제하려는 게시물이 로그인한 유저가 작성한 글인지 검사
sql  = "select userid ";
sql += "from board ";
sql += "where no = " + no;
db.OpenSelect(sql);
if(db.Next() == false)
{
	//해당 번호 게시물이 없는 경우임.
	db.DBClose();
	response.sendRedirect("index.jsp");
	return;	
}
String userid = db.GetValue("userid");
db.CloseSelect();

if(login == null || !login.getUserid().equals(userid) )
{
	//로그인하지 않았거나 해당 게시글의 소유자가 아닌 경우
	db.DBClose();
	response.sendRedirect("index.jsp");
	return;	
}


//해당 게시글의 댓글을 삭제한다.
sql  = "delete from reply where no =" + no;
db.RunSQL(sql);

//해당 게시글을 삭제한다.
sql  = "delete from board where no =" + no;
db.RunSQL(sql);

db.DBClose();

%>

<!-- 컨텐츠 출력 되는곳 -------------------------- -->
글이 삭제되었습니다.
<br>
<a href="index.jsp">목록으로 돌아가기</a>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>