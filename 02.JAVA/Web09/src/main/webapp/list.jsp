<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ezen.*" %>
<%
DBManager db = new DBManager();
db.DBOpen();
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>�޸� ���</title>
	</head>
	<body>
		<table border="0" width="600px" align="center">
			<tr>
				<td align="right" style="height:30px;"><a href="insert.jsp">����ϱ�</a></td>
			</tr>
			<tr>
				<td>
					<table border="1" style="width:100%">
						<tr>
							<th style="width:100px;">��ȣ</th>
							<th>����</th>
							<th style="width:100px;">��¥</th>
						</tr>
						<%
						String sql = "";
						
						sql += "select no,title,date(wdate) as wdate ";
						sql += "from memo ";
						sql += "order by no desc ";
						db.OpenSelect(sql);
						
						while(db.Next())
						{
							String no    = db.GetValue("no");
							String title = db.GetValue("title");
							String wdate = db.GetValue("wdate");
							%>
							<tr>
								<td style="text-align:center;"><%= no %></td>
								<td><a href="view.jsp?no=<%= no %>"><%= title %></a></td>
								<td align="center"><%= wdate %></td>
							</tr>
							<%
						}
						
						db.CloseSelect();
						%>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>
<%
db.DBClose();
%>

