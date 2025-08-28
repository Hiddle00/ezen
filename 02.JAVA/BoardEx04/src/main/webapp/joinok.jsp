<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<%
request.setCharacterEncoding("utf-8");

String userid = request.getParameter("userid");
String userpw = request.getParameter("userpw");
String name   = request.getParameter("name");
String gender = request.getParameter("gender");
String hobby  = request.getParameter("hobby");
String []fav  = request.getParameterValues("fav");

//누락된 값 체크
if( userid == null || userpw == null  || name == null )
{
	response.sendRedirect("index.jsp");
	return;
}

//취미를 문자열로 생성한다.
String fav_list = "";
if( fav != null)
{
	for(String v : fav)
	{
		fav_list += v + ",";
	}
}

//회원가입을 DB에 처리한다.
DBManager db = new DBManager();
db.DBOpen();

String sql = "";

//동일한 아이디로 회원가입 되어 있는지 검사한다.
sql = "select userid "; 
sql += "from user where "; 
sql += "userid = '" + userid + "'";
db.OpenSelect(sql);
if( db.Next() == true)
{
	//기존 회원 아이디가 있음.
	%>
	<script>
	alert("중복된 회원아이디입니다.");
	document.location = "join.jsp";
	</script>
	<%
	db.CloseSelect();
	db.DBClose();
	return;	
}
db.CloseSelect();


//회원가입을 진행한다.
sql  = "insert into user (userid,userpw,name,gender,hobby,fav) ";
sql += "values (";
sql += "'" + userid + "',";
sql += "md5('" + userpw + "'),";
sql += "'" + name + "',";
sql += "'" + gender + "',";
sql += "'" + hobby  + "',";
sql += "'" + fav_list    + "'";
sql += ")";
db.RunSQL(sql);

db.DBClose();
%>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
회원가입이 완료되었습니다.
<br>
<a href="index.jsp">처음 화면으로 돌아가기</a>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %> 