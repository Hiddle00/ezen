<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>�޸� ���</title>
	</head>
	<body>
		<form name="insertForm" method="post" action="insertok.jsp">
		<table border="0" width="600px" align="center">
			<tr>
				<td align="center">
				�޸� ���
				</td>
			</tr>
			<tr>
				<td>
					<table border="1" style="width:100%">
						<tr>
							<th width="100px">����</th>
							<td><input style="width:98%" type="text" name="title"></td>
						</tr>
						<tr>
							<th>����</th>
							<td>
							<textarea style="width:98%;height:300px;"></textarea>
							</td>
						</tr>				
					</table>
				</td>
			</tr>
			<tr>
				<td align="center">
				<input type="submit" value="��ϿϷ�">
				&nbsp;
				<a href="list.jsp">���</a>
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>