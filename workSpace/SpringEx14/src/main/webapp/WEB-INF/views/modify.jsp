<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<script>
window.onload = function(){
	$("#title").focus();
	
	$("#modify").submit(function(){
		return DoReply();
	});
}
function DoReply(){
	if($("#title").val() == ""){
		alert("제목을 입력하세요.");
		$("#title").focus();
		return false;
	}
	
	if($("#note").val() == ""){
		alert("내용을 입력하세요.");
		$("#note").focus();
		return false;
	}
	
	if(!confirm("게시물을 수정하시겠습니까?")){
		return false;
	}
	
	return true;
}
</script>
<table border="0" style="width:100%;">
	<tr>
		<td style="height:40px">
			<span style="font-weight:bold; color:red;">※ 글수정</span>
		</td>
	</tr>
</table>		
<form id="modify" name="modify" method="post" action="modifyok.do" enctype="multipart/form-data">
<table border="0" style="width:100%; margin:0px 0px 0px 0px;padding:0px 0px 0px 0px ; border: 1px;">
	<tr>
		<td style="width:120px; text-align:center; background-color:#f4f4f4">제목</td>
		<td><input type="text" id="title" name="title" style="width:95%" value="${ item.title }"></td>
	</tr>
	<tr>
		<td style="width:120px; text-align:center; background-color:#f4f4f4">구분</td>
		<td>
		<c:if test="${ item.kind.equals('J') }">
			<input type="radio" id="kind" name="kind" value="J" checked>자바 학습 게시판
			<input type="radio" id="kind" name="kind" value="H">HTML 학습 게시판
		</c:if>
		<c:if test="${ item.kind.equals('K') }">
			<input type="radio" id="kind" name="kind" value="J">자바 학습 게시판
			<input type="radio" id="kind" name="kind" value="H" checked>HTML 학습 게시판
		</c:if>
		</td>
	</tr>						
	<tr>
		<td style="width:120px; text-align:center; background-color:#f4f4f4">내용</td>
		<td><textarea id="note" name="note" style="width:95%; height:200px;">${ item.note }</textarea></td>
	</tr>
	<tr>
		<td style="width:120px; text-align:center; background-color:#f4f4f4">첨부파일</td>
		<td>
		<input name="attach" type="file" style="width:95%">
		<c:choose>
			<c:when test="${ item.fname != null and !item.fname.equals('') }">
				<a href="down.jsp?no=${ item.no }">${ item.fname }</a>
			</c:when>
			<c:otherwise>
				등록된 첨부파일 없음
			</c:otherwise>
		</c:choose>
		</td>
	</tr>
	<tr>
		<td colspan="2" style="height:1px;background-color:#cccccc"></td>
	</tr>
	<tr>
		<td style="text-align:center;" colspan="2">
			<input type="submit" value="글수정 완료">
			<a href="view.do">글수정 취소</a>
		</td>
	</tr>
</table>					
</form>			
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>