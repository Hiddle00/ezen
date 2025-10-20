<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<script>

//아이디가 중복되었는지 검사용
let dupCheckID = "";

window.onload = function()
{
	$("#userid").focus();
	
	//userid 키보드 입력 이벤트 처리
	$("#userid").keyup(function(){
		CheckUserID();
	});	
	
	//가입하기 이벤트처리
	$("#btnSubmit").click(function(){
		DoJoin();
	});
	
	//메일인증 코드 발송
	$("#btnMail").click(function(){
		SendMail();
	});	
}

//아이디 중복 검사용 함수
function CheckUserID()
{
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
			
			//아이디 중복 검사 결과를 기억한다.
			dupCheckID = res;
			
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
}

function DoJoin()
{
	// id 입력값이 없으면 메세지 출력하고 submit 중지
	if($("#userid").val() == "")
	{
		alert("아이디를 입력하세요");
		$("#userid").focus();
		return;
	}	
	
	if($("#userpw").val() == "")
	{
		alert("비밀번호를 입력하세요");
		$("#userpw").focus();
		return;
	}
	
	if($("#userpw").val() != $("#pwcheck").val())
	{
		alert("비밀번호가 일치하지 않습니다.");
		$("#userpw").focus();
		return;
	}	
	
	if($("#name").val() == "")
	{
		alert("이름을 입력하세요");
		$("#name").focus();
		return;
	}	
	
	if( dupCheckID != "NOT_DUPLICATED")
	{
		alert("사용가능한 아이디가 아닙니다.");
		return ;
	}
	
	if( $("#code").val() == "")
	{
		alert("인증코드를 입력하세요");
		$("#code").focus();
		return;		
	}
	if( $("#code").val() != $("#sendcode").val())
	{
		alert("인증코드가 일치하지 않습니다.");
		$("#code").focus();
		return;		
	}	
	
	//가입방지코드가 일치하는지 검사
	$.ajax({
		url : "getsign.do",
		type: "get",
		dataType: "html",
		success : function(res)
		{
			sign = res.trim();
			if( $("#sign").val() != sign )
			{
				alert("자동가입 방지코드가 일치하지 않습니다.");
			}else
			{
				if(confirm("회원가입을 진행하시겠습니까?") == false)
				{
					return;
				}
				//document.join.submit();
				$("#join").submit();
			}
		}
	});
}

function SendMail()
{
	if( $("#mail").val() == "")
	{
		alert("메일주소를 입력하세요");
		$("#mail").focus();
		return;		
	}	
	$.ajax({
		url : "sendmail.do?mail=" + $("#mail").val(),
		type: "get",
		dataType: "html",
		success : function(res)
		{
			code = res.trim();
			if( code == "ERROR" )
			{
				alert("인증메일 발송 오류가 발생하였습니다.");
			}else
			{
				alert("인증코드를 메일로 발송하였습니다.");
				$("#sendcode").val(code);
			}
		}
	});	
}

</script>
<form id="join" name="join" method="post" action="joinok.do">
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
			<td>메일주소</td>
			<td>
				<input type="text" id="mail" name="mail" style="width:50%">
				<input type="button" id="btnMail" value="코드발송">
				<br>
				<input type="hidden" id="sendcode" name="sendcode">
				코드입력 : <input type="text" id="code" name="code" size="10">
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
				<input type="button" id="btnSubmit" value="가입완료">
				<input type="button" id="btnCancel" value="취소">
			</td>							
		</tr>																															
	</table>
</form>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>