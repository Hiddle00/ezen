<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include/head.jsp" %>
<%
request.setCharacterEncoding("utf-8");  //인코딩 변환

String userid = request.getParameter("userid");
String userpw = request.getParameter("userpw");
String name   = request.getParameter("name");
String gender = request.getParameter("gender");
String hobby  = request.getParameter("hobby");
String[] fav  = request.getParameterValues("fav");

//잘못된 경로 접근 차단
if(userid == null || userpw == null || name == null){
	response.sendRedirect("join.jsp");
	return;
}
if(userid == "" || userpw == "" || name == ""){
	response.sendRedirect("join.jsp");
	return;
}

//관심분야 문자열로 변환
String fav_list = "";
if(fav != null){
	for(String s : fav){
		fav_list += s + ",";
	}
}

//회원가입을 DB에 처리한다
DBManager db = new DBManager();
db.DBOpen();

String sql = "";

//아이디 중복 검사
sql  = "select userid ";
sql += "from user ";
sql += "where userid = '" + userid + "'";

db.OpenSelect(sql);
if(db.Next() == true){
	//기존 회원 아이디가 존재
	%>
	<script>
	alert("중복된 회원아이디입니다.");
	document.location("join.jsp");
	</script>
	<%
											//입력값 되돌려주는 코드 작성 필요
	db.CloseSelect();
	db.DBClose();
	return;	
}
db.CloseSelect();

//회원가입을 진행한다.
sql  = "insert into user ( ";
sql += "userid,userpw,name,gender,hobby,fav) ";
sql += "values ( ";
sql += "'" + userid + "', ";
sql += "md5('" + userpw + "'), ";
sql += "'" + name + "', ";
sql += "'" + gender + "', ";
sql += "'" + hobby  + "', ";
sql += "'" + fav_list    + "' ";
sql += ") ";
db.RunSQL(sql);

db.DBClose();
%>
아이디 : <%= userid %><br>
비밀번호 : <%= userpw %><br>
이름 : <%= name %><br>
성별 : <%= gender %><br>
취미 : <%= hobby %><br>
관심분야 : <%= fav_list %><br>
관심분야 : <%= fav %><br>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
회원가입이 완료되었습니다.
<br>
<a href="index.jsp">처음 화면으로 돌아가기</a>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%@ include file="include/tail.jsp" %>