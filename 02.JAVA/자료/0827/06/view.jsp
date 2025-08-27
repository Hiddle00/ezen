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

//3. 조회수를 증가시킨다.
sql = "update board set hit = hit + 1 where no = " + no;
db.RunSQL(sql);

//< 와 >를 변경한다.
note = note.replace("<","&lt;");
note = note.replace(">","&gt;");

//엔터문자를 변경한다.
note = note.replace("\n","<br>\n");

//4. 화면에 데이터를 출력한다.
%>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<script>
function DoDelete()
{
	if( confirm("해당 게시물을 삭제하시겠습니까?") == false)
	{
		return;	
	}
	document.location = "delete.jsp?no=<%= no %>";
}
</script>
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
		<td><%= title %></td>
	</tr>
	<tr>
		<td style="background-color:#f4f4f4; width:120px;">작성자</td>
		<td><%= name %></td>
	</tr>
	<tr>
		<td style="background-color:#f4f4f4; width:120px;">작성일</td>
		<td><%= wdate %></td>
	</tr>
	<tr>
		<td style="background-color:#f4f4f4; width:120px;">조회수</td>
		<td><%= hit %>회</td>
	</tr>
	<tr>
		<td colspan="2"><%= note %></td>
	</tr>	
	<tr>
		<td style="background-color:#f4f4f4; width:120px;">첨부파일</td>
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
		<td colspan="2" align="center" style="height:40px;">
		<a href="index.jsp">글목록</a>
		<% 
		//로그인한 유저아이디 == 게시글 작성자 아이디
		if( login != null && login.getUserid().equals(userid) )
		{ 
			%>
			&nbsp;|&nbsp;
			<a href="modify.jsp?no=<%= no %>">글수정</a>
			&nbsp;|&nbsp;
			<a href="javascript:DoDelete();">글삭제</a>
			<% 
		}		
		%>
		</td>
	</tr>																													
</table>

<br>
<script>
function DoReply()
{
	if(document.reply.rnote.value == "")
	{
		alert("댓글 내용을 입력하세요.");
		document.reply.rnote.focus();
		return false;
	}
	return true;
}

function DelReply(rno)
{
	document.location = "delreply.jsp?no=<%= no %>&rno=" + rno;
}
</script>
<form name="reply" method="post" action="replyok.jsp"
	onsubmit="return DoReply();">
<input type="hidden" name="no" value="<%= no %>">
<table border="1" style="width:100%;">
	<% 
	if(login != null)
	{
		%>
		<tr>
			<td width="110px"><%= login.getName() %></td>
			<td>			
			<input type="text" name="rnote" style="width:95%">
			</td>
			<td width="110px" align="center"><input type="submit" value="작성완료"></td>
		</tr>
		<% 					
	}
	sql  = "select rno,rnote,date(rwdate) as rwdate,userid, ";
	sql += "(select name from user where userid = reply.userid) as name ";
	sql += "from reply ";
	sql += "where no = " + no + " ";
	sql += "order by rno desc ";
	db.OpenSelect(sql);
	while( db.Next() == true)
	{
		String rno    = db.GetValue("rno");
		String rnote  = db.GetValue("rnote");
		String rwdate = db.GetValue("rwdate");
		String rname  = db.GetValue("name");
		String ruserid = db.GetValue("userid");
		%>
		<tr>
			<td width="110px"><%= rname %></td>
			<td><%= rnote %>
			<% 
			if(login != null && login.getUserid().equals(ruserid))
			{ 
				%>
				[ <a href="javascript:DelReply('<%= rno %>');">삭제</a> ]
				<% 
			}
			%>
			</td>
			<td width="110px" align="center"><%= rwdate %></td>
		</tr>																		
		<%
	}
	db.CloseSelect();
	%>
</table>
</form>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%
db.DBClose();
%>
<%@ include file="./include/tail.jsp" %>
