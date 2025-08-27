<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>    
<%@ page import="ezen.*" %>
<%@ include file="./config/config.jsp" %>
<%
//메모번호(no)를 받는다.
String no = request.getParameter("no");
if( no == null )
{
	response.sendRedirect("list.jsp");
	return;
}

DBManager db = new DBManager();
db.DBOpen();

//2. select 로 데이터를 읽는다.
String sql = "";
sql += "select pname,fname ";
sql += "from board ";
sql += "where no = " + no;
db.OpenSelect(sql);
if( db.Next() == false )
{
	db.CloseSelect();
	db.DBClose();
	response.sendRedirect("index.jsp");
	return;
}
String pname  = db.GetValue("pname");
String fname  = db.GetValue("fname");
db.DBClose();


//저장된 파일명
String savefile = pname;
//업로드 당시 파일이름
String filename = fname;

String fullname = uploadPath + "\\" + savefile;

//out.println("fullname:" + fullname + "<br>");
  
//URIEncoding
response.setHeader("Content-Disposition","attachment; filename=" + filename);   

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
