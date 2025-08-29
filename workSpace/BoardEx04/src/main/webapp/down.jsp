<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ezen.*" %>
<%@ page import="java.io.*" %>
<%@ include file="./include/config.jsp" %>
<%
String no = request.getParameter("no");
if( no == null )
{
	response.sendRedirect("index.jsp");
	return;
}

DBManager db = new DBManager();
db.DBOpen();
String sql = "";

//select 로 게시물 데이터를 읽는다.
sql  = "select no,pname,fname ";
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
String pname  = db.GetValue("pname");
String fname  = db.GetValue("fname");

db.DBClose();

//하드디스크에서 파일을 읽어서 브라우저에 저장한다.

String fullname = uploadPath + "\\" + pname;

//URIEncoding
//Content-Disposition의 의미를 인터넷 검색 바람.
response.setHeader("Content-Disposition","attachment; filename=" + fname);

//하드디스크에서 파일을 읽어서 브라우저에 전송한다.
File file = new File(fullname);
FileInputStream fileIn = new FileInputStream(file);
ServletOutputStream ostream = response.getOutputStream();

byte[] outputByte = new byte[4096];
//copy binary contect to output stream
while(fileIn.read(outputByte, 0, 4096) != -1)
{
	ostream.write(outputByte, 0, 4096);
}
fileIn.close();
ostream.flush();
ostream.close();
%>
