<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>�޸� ����</title>
	</head>
	<body>
		<form name="insertForm" method="post" action="updateok.jsp">
		<table border="0" width="600px" align="center">
			<tr>
				<td align="center">
				�޸� ����
				</td>
			</tr>
			<tr>
				<td>
					<table border="1" style="width:100%">
						<tr>
							<th width="100px">����</th>
							<td><input style="width:98%" type="text" name="title" value="�����Դϴ�."></td>
						</tr>
						<tr>
							<th>��¥</th>
							<td>2024.01.01</td>
						</tr>						
						<tr>
							<th>����</th>
							<td>
							<textarea style="width:98%;height:300px;">�����Դϴ�.
�����Դϴ�.
�����Դϴ�.</textarea>
							</td>
						</tr>				
					</table>
				</td>
			</tr>
			<tr>
				<td align="center">
				<input type="submit" value="����Ϸ�">
				&nbsp;
				<a href="view.jsp">���</a>
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>