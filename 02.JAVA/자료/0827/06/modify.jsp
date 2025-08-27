<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<%
//1. no 값을 받는다.
String no = request.getParameter("no");
if( no == null )
{
	response.sendRedirect("index.jsp");
	return;
}

DBManager db = new DBManager();
db.DBOpen();

//2. select 로 데이터를 읽는다.
String sql = "";
sql += "select no,userid,title,kind,note,pname,fname,wdate,hit, ";
sql += "(select name from user where user.userid = board.userid) as name ";
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
<script>
	window.onload = function()
	{
		document.modify.title.focus();
	}
	
	function DoSubmit()
	{
		if( document.modify.title.value == "" )
		{
			alert("제목을 입력하세요.");
			document.modify.title.focus();
			return false;
		}	
		if( document.modify.note.value == "" )
		{
			alert("내용을 입력하세요.");
			document.modify.note.focus();
			return false;
		}		
		
		if(confirm("게시물을 변경하시겠습니까?") == false)
		{
			return false;
		}
		return true;
	}
</script>
<table border="0" style="width:100%;">
	<tr>
		<td style="height:40px">
			<span style="font-weight:bold; color:red;">※ 글수정</span>
		</td>
	</tr>
</table>		
<form name="modify" method="post" action="modifyok.jsp"
	onsubmit="return DoSubmit();" enctype="multipart/form-data">
<input type="hidden" name="no" value="<%= no %>">	
<table border="0" style="width:100%; margin:0px 0px 0px 0px;padding:0px 0px 0px 0px ; border: 1px;">
	<tr>
		<td style="width:120px; text-align:center; background-color:#f4f4f4">제목</td>
		<td><input type="text" name="title" style="width:95%" value="<%= title %>"></td>
	</tr>
	<tr>
		<td style="width:120px; text-align:center; background-color:#f4f4f4">구분</td>
		<td>
			<input type="radio" name="kind" value="J" <%= kind.equals("J") ? "checked" : "" %>>자바 학습 게시판
			<input type="radio" name="kind" value="H" <%= kind.equals("H") ? "checked" : "" %>>HTML 학습 게시판
		</td>
	</tr>						
	<tr>
		<td style="width:120px; text-align:center; background-color:#f4f4f4">내용</td>
		<td><textarea name="note" style="width:95%; height:200px;"><%= note %></textarea></td>
	</tr>
	<tr>
		<td rowspan="2" style="width:120px; text-align:center; background-color:#f4f4f4">첨부파일</td>
		<td><input name="attach" type="file" style="width:95%"></td>
	</tr>
	<tr>		
		<td>
		<%
		if(fname == null || fname.equals(""))
		{
			//첨부파일 없음
			%>등록된 첨부파일 없음<%
		}else
		{	
			//첨부파일 있음
			%><a href="down.jsp?no=<%= no %>"><%= fname %></a><%
		}
		%>
		</td>
	</tr>	
	<tr>
		<td colspan="2" style="height:1px;background-color:#cccccc"></td>
	</tr>
	<tr>
		<td style="text-align:center;" colspan="2">
			<input type="submit" value="글수정 완료">
			<a href="view.jsp?no=<%= no %>">글수정 취소</a>
		</td>
	</tr>
</table>					
</form>			
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>