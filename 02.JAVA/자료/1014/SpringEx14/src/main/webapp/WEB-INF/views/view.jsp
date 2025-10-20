<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<script>
	window.onload = function()
	{
		$("#btnReply").click(function(){
			AddReply();
		});
	}
	
	function AddReply()
	{
		if($("#rnote").val() == "")
		{
			alert("댓글을 입력해주세요");
			$("#rnote").focus();
			return;
		}
		if(confirm("댓글을 등록하시겠습니까")==false)
		{
			return;
		}
		//게시물번호,작성자아이디,댓글내용
		$.ajax({
			url : "replyok.do",
			type: "post",
			data :
			{
				no : "${ item.no }",
				userid : "${ login.userid }",
				rnote : $("#rnote").val()
			},
			dataType: "html",
			success : function(res)
			{
				res = res.trim();
				alert(res);
				document.location.reload();
			}
		});		
	}
	
	function DelReply(rno)
	{
		if(confirm("댓글을 삭제하시겠습니까")==false)
		{
			return;	
		}
		
		$.ajax({
			url : "delreply.do?rno=" + rno,
			type: "get",
			dataType: "html",
			success : function(res)
			{
				res = res.trim();
				alert(res);
				document.location.reload();
			}
		});	
	}
	
	function Delete(no)
	{
		if(confirm("게시물을 삭제하시겠습니까")==false)
		{
			return;	
		}
		document.location = "delete.do?no=" + no;
	}

</script>
<table border="0" style="width:100%;">
	<tr>
		<td style="height:40px">
			<span style="font-weight:bold; color:red;">※ 글보기</span>
		</td>
	</tr>
</table>
<table border="1" style="width:100%;">
	<tr>
		<td style="background-color:#f4f4f4; width:120px;">제목</td>
		<td>${ item.title }</td>
	</tr>
	<tr>
		<td style="background-color:#f4f4f4; width:120px;">작성자</td>
		<td>${ item.name }</td>
	</tr>
	<tr>
		<td style="background-color:#f4f4f4; width:120px;">작성일</td>
		<td>${ item.wdate }</td>
	</tr>
	<tr>
		<td style="background-color:#f4f4f4; width:120px;">조회수</td>
		<td>${ item.hit }회</td>
	</tr>
	<tr>
		<td colspan="2">
			${ item.HTML }
		</td>
	</tr>	
	<tr>
		<td style="background-color:#f4f4f4; width:120px;">첨부파일</td>
		<td>
		<c:choose>
			<c:when test="${ item.fname != null and !item.fname.equals('') }">
				<a href="down.do?no=${ item.no }">${ item.fname }</a>
			</c:when>
			<c:otherwise>
				등록된 첨부파일 없음
			</c:otherwise>
		</c:choose>			
		</td>
	</tr>	
	<tr>
		<td colspan="2" align="center" style="height:40px;">
		<a href="index.do">글목록</a>
		<c:if test="${ login != null and login.userid.equals(item.userid) }">
			&nbsp;|&nbsp;
			<a href="modify.do?no=${ item.no }">글수정</a>
			&nbsp;|&nbsp;
			<a href="javascript:Delete(${ item.no });">글삭제</a>
		</c:if>
		</td>
	</tr>																													
</table>

<br>
<table border="1" style="width:100%;">
	<c:if test="${ login != null }">
		<tr>
			<td width="110px">${ login.name }</td>
			<td><input type="text" style="width:95%" id="rnote" name="rnote"></td>
			<td width="110px" align="center"><input type="button" id="btnReply" value="작성완료"></td>
		</tr>					
	</c:if>
	<c:forEach var="reply" items="${ reply }">
		<tr>
			<td width="110px">${ reply.name }</td>
			<td>${ reply.rnote }
			<c:if test="${ login != null and login.userid.equals(reply.userid) }">
				[ <a href="javascript:DelReply(${ reply.rno });">삭제</a> ]
			</c:if>
			</td>
			<td width="110px" align="center">${ reply.rwdate }</td>
		</tr>
	</c:forEach>																		
</table>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>