<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	request.setAttribute("v1", "값1");

	//리스트를 하나 생성하고, 값을 넣은 후 request객체에 저장
	List<String> l = new ArrayList<>();
	l.add("a");
	l.add("b");
	l.add("c");
	
	request.setAttribute("l", l);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>JSTL(JSP Standard Tag Library, jsp 표준 태그 라이브러리)</div>
	<%--
		<% %> 대체하기 위해 사용
		JSTL로, 변수선언, 반복문, 조건문 등이 가능하다.
	--%>
	<div>1. jstl을 이용한 값 출력</div>
	<c:out value="hi" />
	<%-- <%= hi %>,  --%>
	<c:out value="${55}" />
	<c:out value="${null}" default="대체 텍스트"/>
	
	<div>2. jstl을 이용한 변수 생성</div>
	<c:set var="data" value="hello" />
	${data}
	
	<c:set var="data2" value="${data}" />
	${data2}
	
	<div>3. jstl을 이용한 url 생성</div>
	<!-- 입력된 url 앞에 contextPath를 붙여서 반환한다. -->
	<div>/home.jsp</div>
	<div>
		<c:url value="/home.jsp" />
	</div>
	
	<a href="/home.jsp">home으로 이동</a><br>
	<a href="/JstlEx/home.jsp">home으로 이동</a><br>
	<a href="<%= request.getContextPath() %>/home.jsp">home으로 이동</a><br>
	<a href="${pageContext.request.contextPath}/home.jsp">home으로 이동</a><br>
	<a href="<c:url value="/home.jsp" />">home으로 이동</a><br>
	
	<div>4. jstl을 이용한 if문</div>
	<c:if test="${ture}">
		<div>참입니다.</div>
	</c:if>
	
	<div>jstl의 if문을 이용한 로그인(세션) 검증</div>
	<c:if test="${not empty sessionScope.user}">
		<div>로그인 했습니다.</div>
	</c:if>
	<c:if test="${empty sessionScope.user}">
		<div>로그인 했습니다.</div>
	</c:if>
	
	<div>5. jstl의 if, else-if, else문</div>
	jstl 태그를 이용해 v라는 이름의 변수를 선언하고 1,2,3,4 중 하나의 정수값을 넣는다.<br>
	v변수의 값이 1이면 "금메달"
	v변수의 값이 2이면 "은메달"
	v변수의 값이 3이면 "동메달"
	v변수의 값이 1,2,3이 아니면 "등외"라고 화면에 출력
	<c:set var="v" value="${4}"/>
	<c:choose>
		<c:when test="${v == 1}">
			<div>금메달</div>
		</c:when>
		<c:when test="${v == 2}">
			<div>은메달</div>
		</c:when>
		<c:when test="${v == 3}">
			<div>동메달</div>
		</c:when>
		<c:otherwise>
			<div>등외</div>
		</c:otherwise>
	</c:choose>
	
	<div>6. jstl의 반복문</div>
	<c:forEach var="i" begin="1" end="5">
		<div>${i}</div>
	</c:forEach>
	
	<c:forEach var="i" begin="1" end="5" step="2">
		<div>${i}</div>
	</c:forEach>
	
	<div>jstl에서 리스트를 순회하는 반복문</div>
	<c:forEach var="i" items="${l}">
		<div>${i}</div>
	</c:forEach>
	${l}
</body>
</html>