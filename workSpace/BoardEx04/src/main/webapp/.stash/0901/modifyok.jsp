<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ include file="./include/head.jsp" %>
<%@ include file="./include/config.jsp" %>
<%
if(login == null){
	response.sendRedirect("index.jsp");
	return;
}
//업로드될 파일의 최대 크기(1byte 단위)
//byte > kbytes > mbytes > gbytes > tbytes > zbytes > pbyte > ybytes
int size = 10 * 1024 * 1024; //10메가 바이트 이상 제한

MultipartRequest multi = new MultipartRequest(request, 
		uploadPath, size, "utf-8", 
		new DefaultFileRenamePolicy());

String no    = multi.getParameter("no");
String title = multi.getParameter("title");
String kind  = multi.getParameter("kind");
String note  = multi.getParameter("note");


if(no == null || title == null || note == null){
	response.sendRedirect("index.jsp");
	return;
}


%>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
글수정이 완료되었습니다.
<br>
<a href="view.jsp">작성글 보기</a>
|
<a href="index.jsp">첫 페이지로 이동</a>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="include/tail.jsp" %>