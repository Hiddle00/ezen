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

String title = multi.getParameter("title");
String kind  = multi.getParameter("kind");
String note  = multi.getParameter("note");

if(title == null || note == null){
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

//select board.no, board.userid, user.name 
//from user inner join board
//on board.userid = user.userid
	
//반복
for(int i = 1; i <= 497; i++){
	title = String.format("[%03d]번째 HTML입니다.", i);
	
	sql  = "insert into board (userid,title,kind,note,pname,fname) ";
	sql += "values ('" + login.getUserid() + "',";
	sql += "'" + db._R(title) + "',";
	sql += "'" + kind + "',";
	sql += "'" + db._R(note) + "',";
	if(bfname != null)
	{
		//첨부파일이 업로드 된 경우
		sql += "'" + bpname + "',";
		sql += "'" + bfname + "'";
	}else
	{
		//첨부파일을 업로드 안한 경우
		sql += "null,null";	
	}
	sql += ")";
	db.RunSQL(sql);
}

//메모 등록 후 부여된 번호를 얻는다.
sql = "select last_insert_id() as no";
db.OpenSelect(sql);
db.Next();
String no = db.GetValue("no");
db.CloseSelect();

response.sendRedirect("view.jsp?no=" + no);
db.DBClose();
%>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
글쓰기가 완료되었습니다.
<br>
<a href="view.jsp">작성글 보기</a>
|
<a href="write.jsp">글쓰기</a>
|
<a href="index.jsp">첫 페이지로 이동</a>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>    