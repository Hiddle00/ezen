<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
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
			${ item.note }
		</td>
	</tr>	
	<tr>
		<td style="background-color:#f4f4f4; width:120px;">첨부파일</td>
		<td>test.hwp</td>
	</tr>	
	<tr>
		<td colspan="2" align="center" style="height:40px;">
		<a href="index.do">글목록</a>
		&nbsp;|&nbsp;
		<a href="modify.do">글수정</a>
		&nbsp;|&nbsp;
		<a href="delete.do">글삭제</a>
		</td>
	</tr>																													
</table>

<br>
<table border="1" style="width:100%;">
	<tr>
		<td width="110px">홍길동</td>
		<td><input type="text" style="width:95%"></td>
		<td width="110px" align="center"><input type="submit" value="작성완료"></td>
	</tr>					
	<tr>
		<td width="110px">홍길동</td>
		<td>댓글 입니다. 댓글입니다.</td>
		<td width="110px" align="center">2021.12.01</td>
	</tr>
	<tr>
		<td width="110px">홍길동</td>
		<td>댓글 입니다. 댓글입니다.</td>
		<td width="110px" align="center">2021.12.01</td>
	</tr>
	<tr>
		<td width="110px">홍길동</td>
		<td>댓글 입니다. 댓글입니다.</td>
		<td width="110px" align="center">2021.12.01</td>
	</tr>
	<tr>
		<td width="110px">홍길동</td>
		<td>댓글 입니다. 댓글입니다. [ <a href="#">삭제</a> ]</td>
		<td width="110px" align="center">2021.12.01</td>
	</tr>																		
</table>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>