<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<%@ include file="./include/config.jsp" %>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%
if( login == null )
{
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
if( no == null || title == null || note == null)
{
	response.sendRedirect("index.jsp");
	return;
}

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

//board 테이블에 데이터를 등록한다.
DBManager db = new DBManager();
db.DBOpen();

String sql = "";
sql += "update board  set ";
sql += "title = '" + db._R(title)  + "', ";
sql += "kind  = '" + kind   + "', ";
sql += "note  = '" + db._R(note)   + "' ";
if( bfname != null )
{
	sql += ",pname = '" + bpname + "', ";
	sql += "fname = '" + bfname + "'  ";
}
sql += "where no = " + no;
db.RunSQL(sql);

db.DBClose();

//게시물 보기 페이지로 이동시킨다.
response.sendRedirect("view.jsp?no=" + no);
%>
<%@ include file="./include/tail.jsp" %>