<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<script>

window.onload = function()
{
	document.join.userid.focus();
}

function DoCancel()
{
	document.location = "index.jsp";
}

function DoSubmit()
{
	var f = document.join;
	
	if(f.userid.value == "")
	{
		alert("아이디를 입력하세요.");
		f.userid.focus();
		return false;
	}
	if(f.userpw.value == "")
	{
		alert("비밀번호를 입력하세요.");
		f.userpw.focus();
		return false;
	}
	if(f.userpw.value != f.pwcheck.value)
	{
		alert("비밀번호가 일치하지 않습니다.");
		f.userpw.focus();
		return false;
	}	
	if(f.name.value == "")
	{
		alert("이름을 입력하세요.");
		f.name.focus();
		return false;
	}	
	
	if(confirm("회원 가입을 진행하시겠습니까?") != true)
	{
		return false;
	}
	
	return true;
}
</script>
<form name="join" method="post" action="joinok.jsp" onsubmit="return DoSubmit();">
	<table border="0" style="width:100%;">
		<tr>
			<td style="height:40px">
				<span style="font-weight:bold; color:red;">※ 회원가입</span>
			</td>
		</tr>																		
	</table>
	<table border="1" style="width:100%;">
		<tr>
			<td style="width:130px;">아이디 (*)</td>
			<td><input type="text" name="userid" placeholder="아이디는 영문자로만 입력하세요." style="width:95%"></td>
		</tr>
		<tr>
			<td>비밀번호 (*)</td>
			<td><input type="password" name="userpw"  style="width:95%"></td>
		</tr>
		<tr>
			<td>비밀번호 확인 (*)</td>
			<td><input type="password" name="pwcheck" style="width:95%"></td>
		</tr>			
		<tr>
			<td>이름 (*)</td>
			<td><input type="text" name="name"  style="width:95%"></td>
		</tr>		
		<tr>
			<td>성별 (*)</td>
			<td>
				<input type="radio" name="gender" value="M" checked>남자
				<input type="radio" name="gender" value="F">여자
			</td>
		</tr>		
		<tr>
			<td>취미 (*)</td>
			<td>
				<select name="hobby" >
					<option value="1">낚시</option>
					<option value="2">여행</option>
					<option value="3" selected>게임</option>
				</select>
			</td>
		</tr>		
		<tr>
			<td>관심분야</td>
			<td>
				<input type="checkbox" value="1" name="fav"  checked>책
				<input type="checkbox" value="2" name="fav">영화					
			</td>
		</tr>		
		<tr>
			<td colspan="2" style="text-align:center;">
				<input type="submit" value="가입완료">
				<input type="button" value="취소" onclick="DoCancel();">
			</td>							
		</tr>																															
	</table>
</form>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>  