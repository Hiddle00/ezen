<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	요청 데이터 : ${user}
	<%--
		EL(Expression Language, 표현식) <%= %>를 대체하여 사용
		${객체}형태로 사용
		
		${}안에서 사용 가능한 기본 객체
		1. session
		2. request
		3. param(파라미터 내장객체(사용자가 선언하지 않고 미리 포함하고있는 객체))
		
		EL은 웹페이지 내에서 setAttribute로 넣은 값을 "키"만 이용해서 꺼낼 수 있다.
		순서에 따라 다른 데이터가 꺼내질 수 있다.
		1. jspContext
		2. ServletRequest
		3. HttpSession
		4. ServletContext	
	--%>
	
	<div>
		${user} 
		<!-- 
			el을 이용한 객체 접근
			session객체에도 user키(sung)가 있고, request객체에도 user키(hong)가 있다.
			request의 우선순위가 높기 때문에 위에 작성한 ${user}는
			request.getAttribute("user")랑 동일한 코드
			
			여러개의 객체(request, session)에 동일한 키에 데이터가 들어가있다면
			명확히 sessionScope나 requestScope를 작성해야 한다.
		 -->
	</div>
	<%-- pageContext --%>
	<div>
		1. session객체 접근
		스크립틀릿 : <%= session.getAttribute("name") %><br>
		el : ${sessionScope.name}<br>
		el : ${name}<br>
	</div>
	<div>
		2. request객체 접근<br>
		스크립틀릿 : <%= request.getAttribute("user") %><br>
		el : ${requestScope.user}<br>
		el : ${user}<br>
	</div>
	<div>
		3. 파라미터 접근<br>
		스크립틀릿 : <%= request.getParameter("no") %><br>
		el : ${param.no}<br>
		el : ${no}<br>
	</div>
	
	<div>el의 리터럴(값) 표현식</div>
	정수 : ${5}<br>
	실수 : ${2.5 }><br>
	논리 : ${ture }<br>
	문자열 : ${"문자열1" }<br>
	문자열 : ${'문자열2'}<br>
	null : ${null }<br>
	<!-- el에서 null은 빈문자로 변환 -->
	
	<div>el의 산술연산자</div>
	덧셈 : ${1 + 1 }<br>
	뺄셈 : ${2 - 1 }<br>
	곱셈 : ${4 * 5 }<br>
	나눗셈 : ${5 / 2 }<br>
	나눗셈 : ${4 div 2 }<br>
	나머지 : ${5 % 2 }<br>
	나머지 : ${4 mod 2 }<br>
	<!-- el에서 나눗셈은 실수로 결과를 반환 -->
	
	<div>el의 비교연산자</div>
	같다 : ${10 == 10 }<br>
	같다 : ${10 eq 10 } equal<br>
	같지않다 : ${10 != 10 }<br>
	같지않다 : ${10 ne 10 } not equal<br>
	크다 : ${10 > 10 }<br>
	크다 : ${10 gt 10 } greater then<br>
	작다 : ${10 < 10 }<br>
	작다 : ${10 lt 10 } less then<br>
	크거나같다 : ${10 >= 10 }<br>
	크거나같다 : ${10 ge 10 } greater equal<br>
	작거나같다 : ${10 <= 10 }<br>
	작거나같다 : ${10 le 10 } less equal<br>
	
	문자열 같다 : ${"a" == "a" }<br>
	문자열 같다 : ${sessionScope.user == "sung" }<br>
	<div>el의 논리연산자</div>
	and : ${true && true }<br>
	and : ${true and true }<br>
	or : ${true || true }<br>
	or : ${true or true }<br>
	not : ${!true }<br>
	not : ${not true }<br>
	
	<div>삼항연산자</div>
	${1 > 0 ? "크다" : "작다"}
</body>
</html>