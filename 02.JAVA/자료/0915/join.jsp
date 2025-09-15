<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<script>

window.onload = function()
{
	$("#userid").focus();
	
	//userid 키보드 입력 이벤트 처리
	$("#userid").keyup(function(){
		//$("#msg_box").html($("#userid").val());
		userid = $("#userid").val();
		if(userid == "")
		{
			$("#msg_box").html("아이디를 입력하세요.");
			return;
		}
		$.ajax({
			url : "idcheck.do?id=" + userid,
			type: "get",
			dataType: "html",
			success : function(res)
			{
				res = res.trim();
				switch(res)
				{
				case "ERROR":
					$("#msg_box").html("중복검사 오류가 발생했습니다.");
					break;
				case "DUPLICATED":					
					$("#msg_box").html("<span style='color:red'>중복된 아이디입니다.</span>");
					break;
				case "NOT_DUPLICATED":
					$("#msg_box").html("사용 가능한 아이디입니다.");
					break;					
				}				
			}
		});
	});
}

</script>
<form name="join" method="post" action="joinok.do">
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
			<td>
				<input type="text" id="userid" name="userid" placeholder="" style="width:95%">
				<br>
				<span id="msg_box">아이디를 입력하세요.</span>
			</td>
		</tr>
		<tr>
			<td>비밀번호 (*)</td>
			<td><input type="password" id="userpw" name="userpw"  style="width:95%"></td>
		</tr>
		<tr>
			<td>비밀번호 확인 (*)</td>
			<td><input type="password" id="pwcheck" name="pwcheck" style="width:95%"></td>
		</tr>			
		<tr>
			<td>이름 (*)</td>
			<td><input type="text" id="name" name="name"  style="width:95%"></td>
		</tr>		
		<tr>
			<td>성별 (*)</td>
			<td>
				<input type="radio" id="gender" name="gender" value="M" checked>남자
				<input type="radio" id="gender" value="F">여자
			</td>
		</tr>		
		<tr>
			<td>취미 (*)</td>
			<td>
				<select id="hobby" name="hobby">
					<option value="1" selected>낚시</option>
					<option value="2">여행</option>
					<option value="3">게임</option>
				</select>
			</td>
		</tr>		
		<tr>
			<td>관심분야</td>
			<td>
				<input type="checkbox" value="1" id="fav" name="fav"  checked>책
				<input type="checkbox" value="2" id="fav" name="fav">영화					
				<input type="checkbox" value="3" id="fav" name="fav">음악					
			</td>
		</tr>	
		<tr>
			<td>자동가입방지코드</td>
			<td>
				<img src="sign.do">
				<input type="text" id="sign" name="sign" size="6">
			</td>
		</tr>			
		<tr>
			<td colspan="2" style="text-align:center;">
				<input type="submit" value="가입완료">
				<input type="button" value="취소">
			</td>							
		</tr>																															
	</table>
</form>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>