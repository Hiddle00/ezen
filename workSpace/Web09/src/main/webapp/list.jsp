<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ezen.*"%>
<%
ezen.DBManager db = new ezen.DBManager();
db.DBOpen();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>메모 목록</title>
	</head>
	<body>
		<table border="0" width="600px" align="center">
			<tr>
				<td align="right" style="height:30px;"><a href="insert.jsp">등록하기</a></td>
			</tr>
			<tr>
				<td>
					<table border="1" style="width:100%">
						<tr>
							<th style="width:100px;">번호</th>
							<th>제목</th>
							<th style="width:100px;">날짜</th>
						</tr>
						<%
						String sql = "";
						sql  = "select no, title, date(wdate) as wdate ";
						sql += "from memo ";
						sql += "order by no desc ";
						db.OpenSelect(sql);
						while(db.Next()){
							String title = db.GetValue("title");
							String no    = db.GetValue("no");
							String wdate = db.GetValue("wdate");
							//wdate = wdate.substring(0,10);
							%>
							<tr>
								<td style="text-align:center;"><%= no %></td>
								<td><a href="view.jsp?no= <%= no %>"><%= title %></a></td>
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