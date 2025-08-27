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

String fav_list = "";
if( fav != null)
{
	for(String v : fav)
	{
		fav_list += v + ",";
	}
}

//회원가입을 DB에 처리한다.

%>
userid = <%= userid %><br>
userpw = <%= userpw %><br>
name = <%= name %><br>
gender = <%= gender %><br>
hobby = <%= hobby %><br>
fav = <%= fav_list %><br>

<!-- 컨텐츠 출력 되는곳 -------------------------- -->
회원가입이 완료되었습니다.
<br>
<a href="index.jsp">처음 화면으로 돌아가기</a>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %> 