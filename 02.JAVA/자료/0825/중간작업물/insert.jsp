<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>�޸� ���</title>
	</head>
	<body>
		<script>
			window.onload = function()
			{
				document.frm.title.focus();
			}
			
			function DoSubmit()
			{
				if( document.frm.title.value == "" )
				{
					alert("������ �Է��ϼ���.");
					document.frm.title.focus();
					return false;
				}
				if( document.frm.note.value == "" )
				{
					alert("������ �Է��ϼ���.");
					document.frm.note.focus();
					return false;
				}
				if(confirm("�޸� ����Ͻðڽ��ϱ�?") == false)
				{
					return false;
				}
				return true;
			}

		</script>
		<form name="frm" method="post" action="insertok.jsp" onsubmit="return DoSubmit();">
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
							<textarea style="width:98%;height:300px;" name="note"></textarea>
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