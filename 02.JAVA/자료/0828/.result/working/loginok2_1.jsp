<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<%
//1. 아이디/비번을 받는다.
String userid = request.getParameter("userid");
String userpw = request.getParameter("userpw");
if( userid == null || userpw == null )
{
	response.sendRedirect("login.jsp");
	return;
}

//2. db에서 id/pw가 일치하는지  검사한다.
DBManager db = new DBManager();
db.DBOpen();

String sql = "";

sql += "select userid,name ";
sql += "from user ";
sql += "where userid = '" + userid + "' ";
sql += "and userpw = md5('" + userpw + "')";
db.OpenSelect(sql);
if( db.Next() == false )
{
	//아이디 또는 비번이 틀림.
	%>
	<script>
		alert("아이디 또는 비밀번호가 일치하지 않습니다.");
		document.location = "login.jsp";
	</script>
	<%
	db.CloseSelect();
	db.DBClose();
	return;	
}

//3. id/pw가 일치하면 세션에  로그인 정보를 저장한다.
String name = db.GetValue("name");

session.setAttribute("userid", userid);
session.setAttribute("name", name);


db.DBClose();

%>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
로그인이 완료되었습니다.
<br>
<a href="index.jsp">처음 화면으로 돌아가기</a>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>