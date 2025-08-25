<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>메모 등록</title>
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
					alert("제목을 입력하세요.");
					document.frm.title.focus();
					return false;
				}
				if( document.frm.note.value == "" )
				{
					alert("내용을 입력하세요.");
					document.frm.note.focus();
					return false;
				}
				if(confirm("메모를 등록하시겠습니까?") == false)
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
				메모 등록
				</td>
			</tr>
			<tr>
				<td>
					<table border="1" style="width:100%">
						<tr>
							<th width="100px">제목</th>
							<td><input style="width:98%" type="text" name="title"></td>
						</tr>
						<tr>
							<th>내용</th>
							<td>
							<textarea style="width:98%;height:300px;" name="note"></textarea>
							</td>
						</tr>				
					</table>
				</td>
			</tr>
			<tr>
				<td align="center">
				<input type="submit" value="등록완료">
				&nbsp;
				<a href="list.jsp">취소</a>
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>