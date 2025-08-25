<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ezen.*" %>
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

String sql = "";
sql += "select no,title,note,wdate ";
sql += "from memo ";
sql += "where no = " + no;
db.OpenSelect(sql);
if(db.Next() == false)
{
	//해당 번호 게시물이 없는 경우임.
	db.DBClose();
	response.sendRedirect("list.jsp");
	return;	
}
String title = db.GetValue("title");
String note  = db.GetValue("note");
String wdate = db.GetValue("wdate");
db.CloseSelect();

db.DBClose();

//< 와 >를 변경한다.
note = note.replace("<","&lt;");
note = note.replace(">","&gt;");

//엔터문자를 변경한다.
note = note.replace("\n","<br>\n");
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>메모 보기</title>
	</head>
	<body>
		<script>
		function DoDelete()
		{
			if( confirm("삭제하시겠습니까?") == false )
			{
				return;	
			}
			document.location="delete.jsp?no=<%= no %>";
		}
		</script>
		<table border="0" width="600px" align="center">
			<tr>
				<td align="center">
				메모 보기
				</td>
			</tr>
			<tr>
				<td>
					<table border="1" style="width:100%">
						<tr>
							<th width="100px">제목</th>
							<td><%= title %></td>
						</tr>
						<tr>
							<th>날짜</th>
							<td><%= wdate %></td>
						</tr>						
						<tr>
							<th>내용</th>
							<td><%= note %></td>
						</tr>				
					</table>
				</td>
			</tr>
			<tr>
				<td align="center">
				<a href="list.jsp">목록이동</a>
				&nbsp;&nbsp;
				<a href="update.jsp?no=<%= no %>">변경하기</a>
				&nbsp;&nbsp;
				<a href="javascript:DoDelete();">삭제하기</a>
				</td>
			</tr>
		</table>
	</body>
</html>