<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
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

//select 로 게시물 데이터를 읽는다.
sql += "select no,userid,title,kind,note,pname,fname,wdate,hit,";
//작성자 이름을 얻는 subquery
sql += "(select name from user where userid = board.userid) as name ";
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
String userid = db.GetValue("userid");
String title  = db.GetValue("title");
String kind   = db.GetValue("kind");
String note   = db.GetValue("note");
String pname  = db.GetValue("pname");
String fname  = db.GetValue("fname");
String wdate  = db.GetValue("wdate");
String hit    = db.GetValue("hit");
String name   = db.GetValue("name");

db.DBClose();
%>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<table border="0" style="width:100%;">
	<tr>
		<td style="height:40px">
			<span style="font-weight:bold; color:red;">※ 글보기</span>
		</td>
	</tr>
</table>
<table border="1" style="width:100%;">
	<tr>
		<td style="background-color:#f4f4f4; width:120px;">제목</td>
		<td>자바 기초 문법에 대한 강의 입니다.</td>
	</tr>
	<tr>
		<td style="background-color:#f4f4f4; width:120px;">작성자</td>
		<td>홍길동</td>
	</tr>
	<tr>
		<td style="background-color:#f4f4f4; width:120px;">작성일</td>
		<td>2021.11.10</td>
	</tr>
	<tr>
		<td style="background-color:#f4f4f4; width:120px;">조회수</td>
		<td>10회</td>
	</tr>
	<tr>
		<td colspan="2">	
			자바 기초 문법에 대한 강의 입니다.
			<br>
			자바 기초 문법에 대한 강의 입니다.
			<br>
			자바 기초 문법에 대한 강의 입니다.
		</td>
	</tr>	
	<tr>
		<td style="background-color:#f4f4f4; width:120px;">첨부파일</td>
		<td>test.hwp</td>
	</tr>	
	<tr>
		<td colspan="2" align="center" style="height:40px;">
		<a href="index.jsp">글목록</a>
		&nbsp;|&nbsp;
		<a href="modify.jsp">글수정</a>
		&nbsp;|&nbsp;
		<a href="delete.jsp">글삭제</a>
		</td>
	</tr>																													
</table>

<br>
<table border="1" style="width:100%;">
	<tr>
		<td width="110px">홍길동</td>
		<td><input type="text" style="width:95%"></td>
		<td width="110px" align="center"><input type="submit" value="작성완료"></td>
	</tr>					
	<tr>
		<td width="110px">홍길동</td>
		<td>댓글 입니다. 댓글입니다.</td>
		<td width="110px" align="center">2021.12.01</td>
	</tr>
	<tr>
		<td width="110px">홍길동</td>
		<td>댓글 입니다. 댓글입니다.</td>
		<td width="110px" align="center">2021.12.01</td>
	</tr>
	<tr>
		<td width="110px">홍길동</td>
		<td>댓글 입니다. 댓글입니다.</td>
		<td width="110px" align="center">2021.12.01</td>
	</tr>
	<tr>
		<td width="110px">홍길동</td>
		<td>댓글 입니다. 댓글입니다. [ <a href="#">삭제</a> ]</td>
		<td width="110px" align="center">2021.12.01</td>
	</tr>																		
</table>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>