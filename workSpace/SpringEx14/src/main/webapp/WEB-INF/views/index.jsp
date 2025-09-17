<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<table border="0" style="width:100%;">
	<tr>
		<td style="height:40px">
			<span style="font-weight:bold; color:red;">※ 자바학습 게시판</span>
		</td>
	</tr>
	<tr>
		<td style="height:25px; text-align:right;">
			<c:choose>
				<c:when test="${ login != null }">
					<a href="write.do">글쓰기</a>
				</c:when>
				<c:otherwise>
					<a href="javascript:alert('로그인 후에 글쓰기가 가능합니다.');">글쓰기</a>
				</c:otherwise>
			</c:choose>
		</td>
	</tr>						
	<tr>
		<td>
			<table border="0" style="width:100%;">
				<tr>
					<td style="text-align:center; background-color:#f2f2f2; width: 60px;">번호</td>
					<td style="text-align:center; background-color:#f2f2f2;">제목</td>
					<td style="text-align:center; background-color:#f2f2f2;width: 100px;">작성일</td>
					<td style="text-align:center; background-color:#f2f2f2;width: 80px;">작성자</td>
					<td style="text-align:center; background-color:#f2f2f2;width: 70px;">조회수</td>						
				</tr>
				<c:forEach var="item" items="${ list }">
				<tr>
					<td style="text-align:center;">${ item.no }</td>
					<td><a href="view.do?no=${ item.no }">${ item.title }</a>
					<c:if test="${ item.rcount  != '0'}">
						<span style="color:#ff6600">(12)</span></td>
					</c:if>
					<td style="text-align:center;">${ item.wdate }</td>
					<td style="text-align:center;">${ item.name }</td>
					<td style="text-align:center;">${ item.hit }</td>
				</tr>
				</c:forEach>
			</table>							
		</td>
	</tr>
	<tr>
		<td style="text-align:center;">
		◀ 1 2 3 4 5 6 7 8 9  ▶
		</td>
	</tr>												
</table>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>