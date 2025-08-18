<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
String pw = request.getParameter("pw");
if( id == null || pw == null)
{
	//id 또는 pw가 null이면 index.jsp로 브라우저를 보낸다.
	response.sendRedirect("index.jsp");
	return;
}
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 연습</title>
	</head>
	<body>
	<%
	//id가 ezen이고 pw가 1234 면
	//"로그인 되었습니다." 라고 표시하고
	//그렇지 않으면
	//"아이디 또는 비밀번호가 일차하지 않습니다." 라고 표시
	if( id.equals("ezen") && pw.equals("1234") )
	{
		out.println("로그인 되었습니다.");
	}else
	{
		out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
	}	
	%>
	</body>
</html>