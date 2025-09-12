<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/jquery-3.7.1.min.js"></script>
</head>
<body>
	<form action="/ezen/joinok" method="post">
		id : <input type="text" name="id" id="id"><br>
		pw : <input type="password" name="pw"><br>
		<input type="submit" value="회원가입">
	</form>
	<script>
		//아이디 입력창에 키보드 이벤트가 발생할 때 마다
		//입력된 텍스트와 동일한 아이디가 있는지 확인
		//document.getElementById("id")
		$("#id").keyup(function(){
			console.log($(this).val())
			//ajax
			
			$.ajax({
				url : "/ezen/idcheck",
				type : "post",
				data :{
					"id" : $(this).val()
				},
				success : function(result){
					console.log(result);
				},
				error : function(){
					console.log("에러발생!")
				}
			});
		});
		
		
		
		
		
		
	</script>
</body>
</html>