<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ezen.*" %>
<%@ page import="java.io.*" %>  
<%@ include file="./include/config.jsp" %>    
<%
//게시물번호(no)를 받는다.
String no = request.getParameter("no");
if( no == null )
{
	response.sendRedirect("index.jsp");
	return;
}

DBManager db = new DBManager();
db.DBOpen();
String sql = "";

sql  = "select pname,fname ";
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

//하드디스크에서 파일을 읽어서 브라우저에 전송한다.
//실제 하드디스크에 저장된 파일이름
String fullname = uploadPath + "\\" + pname;

//URIEncoding
//Content-Disposition에 의미를 인터넷 검색 바람.
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