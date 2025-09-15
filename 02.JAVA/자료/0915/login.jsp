<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<script>
	window.onload = function()
	{
		//$("#userid").val("ezen");
		//$("#userpw").val("ezen");	
		
		$("#userid").focus();
		
		$("#btnLogin").click(function(){
			DoLogin();
		});
	}
	
	function DoLogin()
	{
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
		$.ajax({
			url : "loginok.do",
			type: "post",
			data :
			{
				id : $("#userid").val(),
				pw : $("#userpw").val()
			},
			dataType: "html",
			success : function(res)
			{
			}
		});		
	}
</script>
<table border="0" style="width:100%;">
	<tr>
		<td style="height:40px">
			<span style="font-weight:bold; color:red;">※ 로그인</span>
		</td>
	</tr>
</table>		
<table border="1" style="width:100%;">
	<tr>
		<td style="text-align:center;width:120px;">아이디 (*) </td>
		<td><input type="text" id="userid" name="userid"></td>
	</tr>
	<tr>
		<td style="text-align:center;width:120px;">비밀번호 (*) </td>
		<td><input type="password" id="userpw" name="userpw"></td>
	</tr>
	<tr>
		<td colspan="2" style="text-align:center;">
			<input type="button" id="btnLogin" value="로그인하기">
		</td>
	</tr>					
</table>		
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="./include/tail.jsp" %>