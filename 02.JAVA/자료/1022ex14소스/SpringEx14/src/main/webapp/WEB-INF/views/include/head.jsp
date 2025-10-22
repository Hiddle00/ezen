<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>	
		<meta charset="UTF-8">
		<title>이젠IT 클라우드 학습 커뮤니티</title>
		<link rel="stylesheet" href="resources/css/board.css"/>
		<script src="resources/js/jquery-3.7.1.min.js"></script>
	</head>
	<body>
		<table border="1" width="900px" align="center">
			<tr>
				<td colspan="3" style="height:60px;">
					<table border="0" style="width:100%; height:60px;">
						<tr>
							<td>
								<a href="index.do">
								<span style="color:red; font-size:15pt; font-weight:bold;">
								이젠IT 클라우드 학습 커뮤니티
								</span>
								</a>
							</td>
							<td style="text-align:right;">
								<c:if test="${ sessionScope.login == null }">
									<a href="join.do">회원가입</a>
									&nbsp;&nbsp;
									<a href="login.do">로그인</a>
									&nbsp;
								</c:if>
								<c:if test="${ sessionScope.login != null }">
									[ ${ login.name } ]님 
									&nbsp;&nbsp;
									<a href="logout.do">로그아웃</a>
								</c:if>								
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td style="width:200px" valign="top">
					<div class="submenu"><a href="index.do?kind=J">자바 학습 게시판</a></div>
					<div style="height:2px; background-color:#ffffff;"></div>
					<div class="submenu"><a href="index.do?kind=H">HTML학습 게시판</a></div>
				</td>
				<td style="width:5px"></td>
				<td>