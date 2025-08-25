<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ezen.*"%>
<%
//메모 번호를 받는다.
String no = request.getParameter("no");
if(no == null){
	response.sendRedirect("list.jsp");
	return;
}

ezen.DBManager db = new ezen.DBManager();				//클래스 생성
db.DBOpen();								//DB 로드

String sql = "";
sql  = "select no, title, note, wdate ";
sql += "from memo ";
sql += "where no = " + no;

db.OpenSelect(sql);
if(db.Next() == false){
	//해당 번호 게시물이 없는 경우임.
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
		<title>메모 변경</title>
	</head>
	<body>
	<script>
		window.onload = function(){
			//let title = document.getElementsByName("title") //메소드
			document.updateForm.title.focus(); //필드이름
		}
		function DoSubmit(){
			//제목,내용 입력여부 검사
			if(document.updateForm.title.value == ""){
				alert("제목을 입력하세요.");
				document.updateForm.title.focus();
				return false;
			}
			if(document.updateForm.note.value == ""){
				alert("내용을 입력하세요.");
				document.updateForm.note.focus();
				return false;
			}
			if(confirm("변경하시겠습니까?") != true){
				//전송안함
				return false;
			}
			return true;
		}
	</script>
		<form name="updateForm" method="post" action="updateok.jsp" onsubmit="return DoSubmit()">
		<!-- no값 넘겨주는 히든박스 -->
		<input type="hidden" name="no" value="<%= no %>">
		<table border="0" width="600px" align="center">
			<tr>
				<td align="center">
				메모 변경
				</td>
			</tr>
			<tr>
				<td>
					<table border="1" style="width:100%">
						<tr>
							<th width="100px">제목</th>
							<td><input style="width:98%" type="text" name="title" value="<%= title %>"></td>
						</tr>
						<tr>
							<th>날짜</th>
							<td><%= wdate %></td>
						</tr>						
						<tr>
							<th>내용</th>
							<td>
							<textarea style="width:98%;height:300px;" name="note"><%= note %></textarea>
							</td>
						</tr>				
					</table>
				</td>
			</tr>
			<tr>
				<td align="center">
				<input type="submit" value="변경완료">
				&nbsp;
				<a href="view.jsp?no=<%= no %>">취소</a>
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>