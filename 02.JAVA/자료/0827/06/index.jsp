<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/head.jsp" %>
<%
//index.jsp?kind=J 로 넘어오는 경우에 대한 처리
String kind = request.getParameter("kind");
if(kind == null) kind = "J";

String board_name = "자바학습 게시판";
if( kind.equals("H") )
{
	board_name = "HTML 학습 게시판";
}

//index.jsp?page=2 로 넘어오는 경우에 대한 처리
String curPage = request.getParameter("page");
int pageNo  = 1; //페이지 번호
try
{
	pageNo = Integer.parseInt(curPage);
}catch(Exception e){};
int startNo = 0; //limit 시작 번호
startNo = (pageNo - 1) * 10;

DBManager db = new DBManager();
db.DBOpen();

String sql = "";

//전체 게시물의 갯수를 조회한다.
sql  = "select count(*) as total ";
sql += "from board ";
sql += "where kind = '" + kind + "' ";
db.OpenSelect(sql);
db.Next();
//total : 전체 게시물 갯수
int total = Integer.parseInt(db.GetValue("total"));

//totalPage : 전체 페이지 갯수 
int totalPage = total / 10;
if( total % 10 != 0 ) totalPage++;

db.CloseSelect();

//페이지당 10개의 게시물을 조회한다.
sql  = "select no,title,date(wdate) as wdate,hit, ";
sql += "(select name from user where userid = board.userid) as name, ";
sql += "(select count(*) from reply where no = board.no) as rcount ";
sql += "from board ";
sql += "where kind = '" + kind + "' ";
sql += "order by no desc ";
sql += "limit " + startNo + ",10 ";
db.OpenSelect(sql);
%>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<table border="0" style="width:100%;">
	<tr>
		<td style="height:40px">
			<span style="font-weight:bold; color:red;">※ <%= board_name %></span>
		</td>
	</tr>
	<tr>
		<td style="height:25px; text-align:right;">
			<% 
			if( login != null )
			{
				%>
				<a href="write.jsp">글쓰기</a>
				<% 
			}
			%>
		</td>
	</tr>						
	<tr>
		<td>
			<table border="0" style="width:100%;">
				<tr>
					<td style="text-align:center; background-color:#f2f2f2; width: 60px;">번호</td>
					<td style="text-align:center; background-color:#f2f2f2;">제목</td>
					<td style="text-align:center; background-color:#f2f2f2;width: 100px;">작성일</td>
					<td style="text-align:center; background-color:#f2f2f2;width: 80px;">작성자</td>
					<td style="text-align:center; background-color:#f2f2f2;width: 70px;">조회수</td>						
				</tr>
				<%
				int seqNo = total - (pageNo - 1) * 10;
				while(db.Next() == true)
				{
					String no    = db.GetValue("no");
					String title = db.GetValue("title");
					String wdate = db.GetValue("wdate");
					String hit   = db.GetValue("hit");
					String name  = db.GetValue("name");
					String rcount  = db.GetValue("rcount");
					%>
					<tr>
						<td style="text-align:center;"><%= seqNo-- %></td>
						<td><a href="view.jsp?no=<%= no %>"><%= title %></a>
							<% 
							if(!rcount.equals("0"))
							{ 
								%>
								<span style="color:#ff6600">(<%= rcount %>)</span>
								<% 
							}
							%>
						</td>
						<td style="text-align:center;"><%= wdate %></td>
						<td style="text-align:center;"><%= name %></td>
						<td style="text-align:center;"><%= hit %></td>
					</tr>
					<%
				}
				%>
				
			</table>							
		</td>
	</tr>
	<tr>
		<td style="text-align:center;">
		<% 
		//시작블럭 = (현재페이지/10) * 10 + 1
		//끝블럭 = 시작블럭 + 10 - 1
		int startBlock = ((pageNo-1) / 10) * 10 + 1;
		int endBlock    = startBlock + 10 - 1;
		//끝블럭 > 전체페이지 갯수 크면 
		//끝블럭 = 전체페이지 갯수
		if( endBlock > totalPage )
		{
			endBlock = totalPage;
		}
		
		if(startBlock > 1)
		{
			%>
			<a href="index.jsp?page=<%= startBlock - 1 %>&kind=<%= kind %>">◀</a>
			<%
		}
		
		for(int i = startBlock; i <= endBlock; i++)
		{
			if(pageNo == i)
			{
				//현재 보고 있는 페이지임.
				%>
				<a href="index.jsp?page=<%= i %>&kind=<%= kind %>"><span style="color:red"><%= i %></span></a>
				<%				
			}else
			{
				%>
				<a href="index.jsp?page=<%= i %>&kind=<%= kind %>"><%= i %></a>
				<%
			}
		}
		
		//다음 블럭 표시
		if( endBlock < totalPage)
		{
			%>
			<a href="index.jsp?page=<%= endBlock + 1 %>&kind=<%= kind %>">▶</a>
			<%			
		}
		%>
		<!--  ◀ 1 2 3 4 5 6 7 8 9  ▶ -->
		</td>
	</tr>												
</table>
<!-- 컨텐츠 출력 되는곳 -------------------------- -->
<%
db.DBClose();
%>
<%@ include file="./include/tail.jsp" %>
