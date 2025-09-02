package board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//HttpServlet를 상속받으면 서블릿클래스
//@WebServlet("/board") //이게 없으면 톰캣에서 경로를 못찾는다 지정해줘야함
public class BoardServlet extends HttpServlet{
	
	//초기화 될때 한 번 호출되는 메서드 다른 클래스들을 호출한다?
	@Override
	public void init() throws ServletException {
		System.out.println("서블릿 초기화!!!!!");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String a = getInitParameter("a");
		System.out.println(a);
		
		String b = getServletContext().getInitParameter("b");
		System.out.println(b);
		resp.getWriter().append("board Servlet!");
	}
}
