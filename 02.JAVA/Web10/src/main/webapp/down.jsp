<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>      
<%
//저장된 파일명
String savefile = request.getParameter("uuid");
//업로드 당시 파일이름
String filename = request.getParameter("name");

String uploadPath = "D:\\jhjeong\\workspace\\Web10\\src\\main\\webapp\\upload";

//실제 하드디스크에 저장된 파일이름
String fullname = uploadPath + "\\" + savefile;

//URIEncoding
//Content-Disposition에 의미를 인터넷 검색 바람.
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