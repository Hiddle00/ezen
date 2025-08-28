<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include/head.jsp" %>
<%
if(login == null){
	response.sendRedirect("index.jsp");
	return;
}
%>
<script>
		//1. 포커스
		//2. 공란체크
		//3. 작성할지 예,아니오
	window.onload = function(){
		document.write.title.focus();
	}
	function DoWrite(){
		let f = document.write;
		if(f.title.value == ""){
			alert("제목을 입력해주세요.");
			f.title.focus();
			return false;
		}
		if(f.note.value == ""){
			alert("내용을 입력해주세요.");
			f.note.focus();
			return false;
		}
		if(confirm("작성하시겠습니까?") != false){
			return false;
		}
		return true;
	}
</script>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<table border="0" style="width:100%;">
	<tr>
		<td style="height:40px">
			<span style="font-weight:bold; color:red;">※ 글쓰기</span>
		</td>
	</tr>
</table>		
<form name="write" method="post" action="writeok.jsp" enctype="multipart/form-data" onsubmit="reture DoWrite()">
<table border="0" style="width:100%; margin:0px 0px 0px 0px;padding:0px 0px 0px 0px ; border: 1px;">
	<tr>
		<td style="width:120px; text-align:center; background-color:#f4f4f4">제목</td>
		<td><input type="text" name="title" style="width:95%"></td>
	</tr>
	<tr>
		<td style="width:120px; text-align:center; background-color:#f4f4f4">구분</td>
		<td>
			<input type="radio" name="kind" value="J" checked>자바 학습 게시판
			<input type="radio" name="kind" value="H">HTML 학습 게시판
		</td>
	</tr>						
	<tr>
		<td style="width:120px; text-align:center; background-color:#f4f4f4">내용</td>
		<td><textarea name="note" style="width:95%; height:200px;"></textarea></td>
	</tr>
	<tr>
		<td style="width:120px; text-align:center; background-color:#f4f4f4">첨부파일</td>
		<td><input name="attach" type="file" style="width:95%"></td>
	</tr>
	<tr>
		<td colspan="2" style="height:1px;background-color:#cccccc"></td>
	</tr>
	<tr>
		<td style="text-align:center;" colspan="2">
			<input type="submit" value="글쓰기 완료">
		</td>
	</tr>
</table>					
</form>			
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="include/tail.jsp" %>