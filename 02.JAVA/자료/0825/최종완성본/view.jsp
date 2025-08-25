<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ezen.*" %>
<%
//�޸��ȣ(no)�� �޴´�.
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

//< �� >�� �����Ѵ�.
note = note.replace("<","&lt;");
note = note.replace(">","&gt;");

//���͹��ڸ� �����Ѵ�.
note = note.replace("\n","<br>\n");
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>�޸� ����</title>
	</head>
	<body>
		<script>
		function DoDelete()
		{
			if( confirm("�����Ͻðڽ��ϱ�?") == false )
			{
				return;	
			}
			document.location="delete.jsp?no=<%= no %>";
		}
		</script>
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
							<td><%= title %></td>
						</tr>
						<tr>
							<th>��¥</th>
							<td><%= wdate %></td>
						</tr>						
						<tr>
							<th>����</th>
							<td><%= note %></td>
						</tr>				
					</table>
				</td>
			</tr>
			<tr>
				<td align="center">
				<a href="list.jsp">����̵�</a>
				&nbsp;&nbsp;
				<a href="update.jsp?no=<%= no %>">�����ϱ�</a>
				&nbsp;&nbsp;
				<a href="javascript:DoDelete();">�����ϱ�</a>
				</td>
			</tr>
		</table>
	</body>
</html>