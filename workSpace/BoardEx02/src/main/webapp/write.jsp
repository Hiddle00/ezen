<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>	
		<meta charset="utf-8">
		<title>자바 학습 커뮤니티</title>
		 <link rel="stylesheet" href="board.css"/>
		 <scrpt src="board.js"/>
	</head>
	<body>
		<table border="1" width="900px" align="center">
			<tr>
				<td colspan="3" style="height:60px;">
					<table border="0" style="width:100%; height:60px;">
						<tr>
							<td>
								<a href="index.jsp">
								<span style="color:red; font-size:15pt; font-weight:bold;">
								자바학습 커뮤니티
								</span>
								</a>
							</td>
							<td style="text-align:right;">
								<a href="join.jsp">회원가입</a>
								&nbsp;&nbsp;
								<a href="login.jsp">로그인</a>
								&nbsp;
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td style="width:200px" valign="top">
					<div class="submenu"><a href="index.jsp">자바 학습 게시판</a></div>
					<div style="height:2px; background-color:#ffffff;"></div>
					<div class="submenu"><a href="index.jsp">HTML학습 게시판</a></div>
				</td>
				<td style="width:5px"></td>
				<td>
					<!-- 컨텐츠 출력 되는곳 -------------------------- -->
					<table border="0" style="width:100%;">
						<tr>
							<td style="height:40px">
								<span style="font-weight:bold; color:red;">※ 글쓰기</span>
							</td>
						</tr>
					</table>		
					<form name="login" method="post" action="writeok.jsp">
					<table border="0" style="width:100%; margin:0px 0px 0px 0px;padding:0px 0px 0px 0px ; border: 1px;">
						<tr>
							<td style="width:120px; text-align:center; background-color:#f4f4f4">제목</td>
							<td><input type="text" name="title" style="width:95%"></td>
						</tr>
						<tr>
							<td style="width:120px; text-align:center; background-color:#f4f4f4">구분</td>
							<td>
								<input type="radio" checked>자바 학습 게시판
								<input type="radio" >HTML 학습 게시판
							</td>
						</tr>						
						<tr>
							<td style="width:120px; text-align:center; background-color:#f4f4f4">내용</td>
							<td><textarea name="contents" style="width:95%; height:200px;"></textarea></td>
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
				</td>
			</tr>
		</table>
	</body>
</html>