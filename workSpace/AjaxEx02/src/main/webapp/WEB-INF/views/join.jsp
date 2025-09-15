<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/jquery-3.7.1.min.js"></script>
</head>
<body>
	회원가입
	<form action="/ezen/joinok" method="post">
		아이디 : <input type='text' name="id" id="id"><br>
		비밀번호 : <input type="password" name="pw"><br>
		<input type="submit" value="회원가입">
	</form>
	<script>
		//아이디 입력창에 키보드 이벤트가 발생할 때 마다
		//입력된 텍스트와 동일한 아이디가 있는지 확인
		$("#id").keyup(function(){
			console.log($(this).val());
			//ajax
			
		//데이터 타입과 응답 타입이 다르면 수신 과정에서 오류 발생
			$.ajax({
				url : "/ezen/idcheck",
				type : "post",
				data : {
					id : $(this).val()
				},
				success : function(result){
					console.log(result);
				},
				error : function(){
					console.log("에러발생!!!");
				}
				
			});
		});
	</script>
</body>
</html>