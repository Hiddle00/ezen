<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<script>
//아이디가 중복되었는지 검사용
//플래그를 논리로 줘도 되지만 
let IdCheckFlage; //전역변수?
let CaptchaFlage;
	
window.onload = function(){
	$("#userid").focus();		//포커스
	
	//userid 키보드 입력 이벤트 처리
	$("#userid").keyup(function(){
		CheckUserID();
	});
	//$("#msg_box").html($("#userid").val());
	//submit 이벤트 처리 -> 가입 이벤트 처리
	//$("#join").submit(function(){
	$("#btnSubmit").click(function(){
		//alert("false!!");
		DoJoin();
	});
}
//4글자미만
//글자색변환
//
//아이디 중복 검사용 함수
function CheckUserID(){
	let userid = $("#userid").val();
	if(userid == ""){
		$("#msg_box").html("아이디를 입력하세요.");
		return;
	}
	$.ajax({
		url  : "idcheck.do?id=" + userid,
		type : "get",
		dataType : "html",
		success : function(res){
			res = res.trim();
			//아이디 중복 검사 결과 변수
			IdCheckFlage = res;
			//스위치case
			switch(res) {
				case "ERROR": 
					$("#msg_box").html("중복 체크 중 오류가 발생했습니다.");
					break;
				case "DUPLICATED" : 
					//$("#msg_box").css("color","red");
					$("#msg_box").html("<span style='color:red'>중복된 아이디입니다.</span>");
					break;
				case "NOT_DUPLICATED" :
					$("#msg_box").html("사용 가능한 아이디입니다.");
					break;
			}
			//if문
			//플래그 변수로 검증하면 간단하지 않나?
		}
	});
	
}
//회원가입 폼 validation
function DoJoin(){
	if($("#userid").val() == ""){
		alert("아이디를 입력하세요.");
		$("#userid").focus();
		return; //false;
	}
	if($("#userpw").val() == ""){
		alert("비밀번호를 입력하세요.");
		$("#userpw").focus();
		return;
	}
	if($("#pwcheck").val() != $("#userpw").val()){
		alert("비밀번호 확인이 일치하지 않습니다.");
		$("#pwcheck").focus();
		return;
	}
	if($("#name").val() == ""){
		alert("이름을 입력하세요.");
		$("#name").focus();
		return;
	}
	if(IdCheckFlage != "NOT_DUPLICATED"){
		alert("사용가능한 아이디가 아닙니다.");
		return;
	}
	//return false;
	//가입방지코드가 일치하는지 검사
	$.ajax({
		url : "getsign.do",
		type : "get",
		dataType : "html",
		success : function(res){
			sign = res.trim();
			if($("#sign").val() != sign ){
				alert("자동가입 방지코드가 일치하지 않습니다.")
			}else{
				if(!confirm("회원가입을 진행하시겠습니까?")){
					return;
				}
			$("#join").submit();
			}
		}
	});
}
//협업중 작성된 태그속성이 날아갈 수 있으니 스크립트로 작성 ->> node.js,react로 발전
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
				<input type="radio" id="gender" name="gender" value="F">여자
			</td>
		</tr>		
		<tr>
			<td>취미 (*)</td>
			<td>
				<select id="hobby" name="hobby" >
					<option value="1" selected>낚시</option>
					<option value="2">여행</option>
					<option value="3">게임</option>
				</select>
			</td>
		</tr>		
		<tr>
			<td>관심분야</td>
			<td>
				<input type="checkbox" value="1" id="fav" name="fav" checked>책
				<input type="checkbox" value="2" id="fav" name="fav">영화					
			</td>
		</tr>		
		<tr>
			<td>자동가입방지코드</td>
			<td>
				<img alt="captcha" src="sign.do">
				<input type="text" id="sign" name="sign" size="6">
				<input type="button" value="검사"> <!-- 방지코드 새로요청(이미지,코드) -->
			</td>
		</tr>
		<tr>
			<td colspan="2" style="text-align:center;">
				<input type="button" id="btnSubmit" value="가입완료">
				<input type="button" id="btnCancle" value="취소">
			</td>							
		</tr>																															
	</table>
</form>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>