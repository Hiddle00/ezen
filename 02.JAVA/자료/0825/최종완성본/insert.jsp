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
				document.insertForm.title.focus();
			}
			
			function DoSubmit()
			{
				//����/���� �Է� ���� �˻�
				if(document.insertForm.title.value == "")
				{
					alert("������ �Է��ϼ���.");
					document.insertForm.title.focus();
					return false;
				}
				if(document.insertForm.note.value == "")
				{
					alert("������ �Է��ϼ���.");
					document.insertForm.note.focus();
					return false;
				}				
				
				
				if(confirm("����Ͻðڽ��ϱ�?") != true)
				{
					//���۾���.
					return false; 
				}
				return true;
			}
		</script>
		<form name="insertForm" method="post" action="insertok.jsp" 
			onsubmit="return DoSubmit();">
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