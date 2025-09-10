<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>     
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>메모조회</title>
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
				<td style="width:100px;">제목</td>
				<td style="text-align:left">${ memo.title }</td>
			</tr>
			<tr>
				<td style="width:100px;">내용</td>
				<td style="text-align:left">${ memo.note }</td>
			</tr>			
			<tr>
				<td colspan="2" style="text-align:center">
				<a href="index.do">목록</a>
				&nbsp; | &nbsp; 
				<a href="modify.do?no=${ memo.no }">수정</a>
				&nbsp; | &nbsp;
				<a href="delete.do?no=${ memo.no }">삭제</a>				
				</td>
			</tr>			
		</table>
	</body>
</html>
