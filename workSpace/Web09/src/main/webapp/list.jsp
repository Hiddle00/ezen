<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
						for(int i=1; i <= 10; i++)
						{
							%>
							<tr>
								<td style="text-align:center;"><%= i %></td>
								<td><a href="view.jsp">�����Դϴ�.</a></td>
								<td align="center">2024.01.01</td>
							</tr>
							<%
						}
						%>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>