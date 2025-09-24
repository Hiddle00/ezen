<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<script>
	window.onload = function(){
		$("#btnReply").click(function(){
			AddReply();
		});
	}
	
	function AddReply(){
		if($('#rnote').val() == '' ){
			alert("댓글을 입력해주세요.")
			$("#rnote").focus()
			return false;
		}
		if(!confirm("댓글을 등록하시겠습니까?")){
			return;
		}
		$.ajax({
			url  : "replyok.do",
			type : "post",
			data : {
				no : "${ item.no }",
				userid : "${ login.userid }",
				rnote : $( "rnote" ).val()
			},
			dataType : "html",
			success : function(res){
				res = res.trim();
				alert(res);
				document.location.reload();
			}
		});
	}
	
	function DelReply(rno){
		if(!confirm("댓글을 삭제하시겠습니까?")){
			return;
		}
		
		$.ajax({
			url  : "delreply.do?rno=" + rno,
			type : "get",
			dataType : "html",
			success : function(res){
				res = res.trim();
				alert(res);
				document.location.reload();
			}
		});
	}
	
	function Delete(no){
		if(!confirm("게시물을 삭제하시겠습니까?")){
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
				<a href="down.jsp?no=${ item.no }">${ item.fname }</a>
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
			<a href="javascript:DelBoard()">글삭제</a>
		</c:if>
		</td>
	</tr>																													
</table>

<br>
<table border="1" style="width:100%;">
	<c:if test="${ login != null and login.userid.equals(item.userid) }">
		<tr>
			<td width="110px">${ item.name }</td>
			<td><input type="text" id="rnote" name="rnote" style="width:95%"></td>
			<td width="110px" align="center"><input type="button" id="btnReply" value="작성완료"></td>
		</tr>					
	</c:if>
	<c:forEach var="rList" items="${ rList }">
		<tr>
			<td width="110px">${ rList.name }</td>
			<td>${ rList.rnote }</td>
			<c:if test="${ login.userid != null and login.userid.equals(rList.userid)  }">
				[ <a href="javascript:DelReply(${ rList.rno });">삭제</a> ]
			</c:if>
			<td width="110px" align="center">${ rList.rwdate }</td>
		</tr>
	</c:forEach>																	
</table>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>