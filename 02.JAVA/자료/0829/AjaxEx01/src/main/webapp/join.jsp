<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.7.1.min.js"></script>
<style>
	#idValid{
		display:none;
	}
</style>
</head>
<body>
	<form action="joinOk.jsp" method="post" onsubmit="return formCheck()">
		<input type="text" name="id">
		<input type="button" value="아이디 중복체크" id="idCheck">
		<br>
		<div id="idValid"></div>
		<input type="password" name="pw"><br>
		<input type="submit" value="회원가입">
	</form>
	<script>
		
		//아이디 중복확인이 되었는지 여부
		let idChecked = false;
	
		function formCheck(){
			//submit이 불가능해야하는 조건
			//1. id가 빈값
			let id = $("input[name='id']");
			if(id.val().trim() == ""){
				alert("아이디는 필수입력값 입니다.");
				id.focus();
				return false;
			}
			
			//2. id 중복 체크 여부
			if(idChecked == false){
				alert("아이디 중복확인은 필수입니다.");
				id.focus();
				return false;
			}
			
			//3. pw가 빈값
			let pw = $("input[name='pw']");
			if(pw.val().trim() == ""){
				alert("비밀번호는 필수입력값 입니다.");
				pw.focus();
				return false;
			}
			
			return true;
		}
		
		//id입력창에 키보드 이벤트가 발생했을 때 동작하는 이벤트
		//아이디 중복확인 버튼 클릭 후 id입력창의 값이 바뀌면 재검증이 필요
		$("input[name='id']").keyup(function(){
			idChecked = false;
			
			//id입력창에 키보드 이벤트가 발생했는데 빈문자면(지웠으면)
			//아래 코드를 실행하지 않고 함수를 종료
			if($(this).val().trim() == ""){
				return;		
			}
			
			//ajax를 이용해 idCheck.jsp에 입력된 id를 전달하고 중복되는 id가 존재하는지 확인
			$.ajax({
				url : "idCheck.jsp",
				type : "post",
				data : {
					id : $(this).val()
				},
				success : function(response){
					/* 
						" 0", " 1", " 2"중에 하나가 응답
					*/
					//" 0" -> 내가 보낸 아이디가 user테이블에 없다.(사용 가능)
					//" 1" -> 내가 보낸 아이디가 user테이블에 이미 있다.(사용 불가능)
					//" 2" -> 쿼리에서 에러(사용 불가능)
					let res = response.trim();
					//"0", "1", "2"중에 하나
					if(res == "0"){
						idChecked = true;
						$("#idValid")
							.show()
							.css("color", "green")
							.text("사용 가능한 id입니다.");
					}else if(res == "1"){
						idChecked = false;
						$("#idValid")
							.show()
							.css("color", "red")
							.text("이미 존재하는 id입니다.");
					}else{
						idChecked = false;
						$("#idValid").hide();
						alert("아이디 중복체크 중 오류가 발생했습니다.");
					}
				},
				error : function(){
					console.log("에러 발생!");
				}
			});
			
		});
	
		//1. id가 idCheck인요소 찾기
		//2. 버튼 클릭 이벤트 부여
		//3. 버튼이 클릭 될 때 중복된 아이디가 있는지 확인
		//4. 중복된 아이디가 있는지 조회할 jsp파일을 생성
		//5. 해당 jsp파일에서 jdbc를 이용해 id중복 체크 쿼리
		//6. 해당 jsp파일에서 요청한 곳에 응답
		
		
		//ajax의 진행 순서
		//1. idCheck버튼이 클릭됨
		//2. idCheck.jsp파일에 post방식으로 요청을 보냄
		//2-1. id라는 이름의 키에 input 중 name속성의 값이 id인 요소의 밸류값을 담아서 요청
		//3. join.jsp에서는 응답을 기다리지 않고 비동기적으로 다른코드들을 실행
		
		
		//4. idCheck.jsp가 요청을 받음
		//4-1. 요청온 데이터를 보니 id키에 무언가가 담겨져있음
		//4-2. request.getParameter("id")로 데이터를 꺼냄
		//4-3. 해당 값이 "hong"이면 1을 응답으로 반환
		//4-4. 해당 값이 "hong"이 아니면 0을 응답으로 반환
		
		//5. idCheck.jsp가 보낸 응답이 ajax의 success함수의 파라미터로 담겨옴
		//6. success함수에 담겨진 응답값이 "0"이면 가입가능 "1"이면 가입 불가능
		$("#idCheck").click(function(){
			
			let id = $("input[name='id']").val();
			if(id.trim() == ""){
				alert("아이디는 필수입력값 입니다.");
				return;
			}
			
			$.ajax({
				url : "idCheck.jsp",
				type : "post",
				data : {
					id : $("input[name='id']").val()
				},
				success : function(response){
					//0이 응답으로 오면 사용가능 id
					//1이 응답으로 오면 사용불가능 id
					//2가 응답으로 오면 조회가 안된 것
					if(response.trim() == "1"){
						idChecked = false;
						$("#idValid")
							.show()
							.css("color","red")
							.text("이미 존재하는 id입니다.");
					}else if(response.trim() == "0"){
						idChecked = true;
						$("#idValid")
							.show()
							.css("color","green")
							.text("사용 가능한 id입니다.");
					}else{
						idChecked = false;
						$("#idValid").hide();
						alert("쿼리 실행 중 문제가 발생했습니다.");
					}
				},
				error : function(){
					console.log("error");
				}
			});
		});
	</script>
</body>
</html>