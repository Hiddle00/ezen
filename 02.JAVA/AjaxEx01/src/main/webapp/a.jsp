<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.7.1.min.js"></script>
</head>
<body>
	<button type="button" id="btn">요청</button>
	<script>
		$("#btn").click(function(){
			console.log("a");
			
			$.ajax({
				url : "b.jsp",
				type : "get",
				async : true,
				data : {
					name : "hong"
				},
				success : function(response){
					console.log(response);
				},
				error : function(){
					console.log("에러!");
				}
			});
			
			console.log("b");
		});
	</script>
</body>
</html>