<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>메모목록</title>
	</head>
	<body>
		<style>
			td
			{
				text-align:center;
			}
		</style>
		<table border="1" align="center" style="width:600px">
			<tr>
				<td colspan="3" style="text-align:right">
				<a href="write.do">글쓰기</a>
				</td>
			</tr>
			<tr>
				<td style="width:60px;">번호</td>
				<td>제목</td>
				<td style="width:100px;">작성일</td>
			</tr>
			<c:forEach var="vo" items="${ list }">
				<tr>
					<td>${ vo.no }</td>
					<td style="text-align:left">
						<a href="view.do?no=${ vo.no }">${ vo.title }</a>
					</td>
					<td  style="text-align:center">
						${ vo.wdate }
					</td>
				</tr>
			</c:forEach>
		</table>		
		<table border="1" align="center" style="width:600px">
			<tr>
				<td>전체게시물 :  ${ total } </td>
			</tr>
			<tr>
				<td>
				<!--   이전페이지 | 1 | 2 | 3 | 4 | 5 | 다음페이지 -->
				<c:forEach var="i" begin="1" end="${ maxpage }">
					<a href="index.do?page=${ i }">${ i }</a>
				</c:forEach>
				</td>
			</tr>
		</table>
	</body>
</html>
