<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ezen.*"%>
<%
//�޸� ��ȣ�� �޴´�.
String no = request.getParameter("no");
if(no == null){
	response.sendRedirect("list.jsp");
	return;
}

ezen.DBManager db = new ezen.DBManager();				//Ŭ���� ����
db.DBOpen();								//DB �ε�

String sql = "";
sql  = "select no, title, note, wdate ";
sql += "from memo ";
sql += "where no = " + no;

db.OpenSelect(sql);
if(db.Next() == false){
	//�ش� ��ȣ �Խù��� ���� �����.
	db.DBClose();
	response.sendRedirect("list.jsp");
	return;
}
String title = db.GetValue("title");
String note  = db.GetValue("note");
String wdate = db.GetValue("wdate");
db.CloseSelect();

db.DBClose();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>�޸� ����</title>
	</head>
	<body>
	<script>
		window.onload = function(){
			//let title = document.getElementsByName("title") //�޼ҵ�
			document.updateForm.title.focus(); //�ʵ��̸�
		}
		function DoSubmit(){
			//����,���� �Է¿��� �˻�
			if(document.updateForm.title.value == ""){
				alert("������ �Է��ϼ���.");
				document.updateForm.title.focus();
				return false;
			}
			if(document.updateForm.note.value == ""){
				alert("������ �Է��ϼ���.");
				document.updateForm.note.focus();
				return false;
			}
			if(confirm("�����Ͻðڽ��ϱ�?") != true){
				//���۾���
				return false;
			}
			return true;
		}
	</script>
		<form name="updateForm" method="post" action="updateok.jsp" onsubmit="return DoSubmit()">
		<!-- no�� �Ѱ��ִ� ����ڽ� -->
		<input type="hidden" name="no" value="<%= no %>">
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
							<td><input style="width:98%" type="text" name="title" value="<%= title %>"></td>
						</tr>
						<tr>
							<th>��¥</th>
							<td><%= wdate %></td>
						</tr>						
						<tr>
							<th>����</th>
							<td>
							<textarea style="width:98%;height:300px;" name="note"><%= note %></textarea>
							</td>
						</tr>				
					</table>
				</td>
			</tr>
			<tr>
				<td align="center">
				<input type="submit" value="����Ϸ�">
				&nbsp;
				<a href="view.jsp?no=<%= no %>">���</a>
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>