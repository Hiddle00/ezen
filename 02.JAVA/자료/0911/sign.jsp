<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>캡차연습</title>
		<script src="resources/js/jquery-3.7.1.min.js"></script>
	</head>
	<body>
		<script>
			function DoSign()
			{
				$.ajax({
					type: "get",
					url : "getsign.do",
					dataType: "html",
					success : function(data){
						// 통신이 성공적으로 이루어졌을때 이 함수를 타게된다.
						data = data.trim();
						//alert(data);
						sign = $("#sign").val();
						if(data != sign){
							alert("입력값이 올바르지 않음");
						}else
						{
							alert("OK");	
						}
					},
					error: function(xhr, status, error){
						// 통신 오류 발생시	
					},
					complete : function(){
						// 통신이 성공하거나 실패했어도 마지막으로 이 함수를 타게된다.
					}			
				});			
			}
		</script>
		<img src="sign.do">
		<input type="text" id="sign" name="sign">
		<input type="button" value="확인" onclick="DoSign();">
	</body>
</html>