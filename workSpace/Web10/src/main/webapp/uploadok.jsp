<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%
//첨부파일이 저장될 디렉토리 이름
String uploadPath = "D:\\YH\\ezen\\workSpace\\Web10\\src\\main\\webapp\\upload";

//업로드될 파일의 최대 크기(1byte 단위)
//byte > kbytes > mbytes > gbytes > tbytes > zbytes > pbytes > ybytes 
int size = 10 * 1024 * 1024; //10mb 이상 제한

MultipartRequest multi = new MultipartRequest(request,
uploadPath, size, "utf-8", new DefaultFileRenamePolicy());

 
String title = multi.getParameter("title");
out.print("제목:" + title + "<br>");

//업로드된 파일명을 얻는다. (논리파일명)
String bfname = (String) multi.getFilesystemName("attach");
out.print("논리파일명 : " + bfname + "<br>");

//업로드된 파일의 이름을 랜덤한 
//문자열을 이용하여 파일 이름을 변경한다. (물리파일명)

//랜덤한 문자열을 생성한다. (물리파일명)
String bpname = UUID.randomUUID().toString();
out.println("물리파일명 : " + bpname);

//논리파일명을 물리파일명으로 파일명을 변경한다.
String srcName    = uploadPath + "/" + bfname;
System.out.println(srcName);
String targetName = uploadPath + "/" + bpname;
System.out.println(targetName);
File srcFile    = new File(srcName);
File targetFile = new File(targetName);
srcFile.renameTo(targetFile);
%>
<br>
<a href="down.jsp?uuid=<%= bpname %>&name=<%= bfname %>">내려받기</a>
<br>
<img src="down.jsp?uuid=<%= bpname %>&name=<%= bfname %>">
<!-- style="" -->