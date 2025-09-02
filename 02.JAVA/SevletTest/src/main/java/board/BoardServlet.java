package board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		System.out.println("서블릿 초기화!!!!!!");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String a = getInitParameter("a");
		System.out.println(a);
		
		String b = getServletContext().getInitParameter("b");
		System.out.println(b);
		
		resp.getWriter().append("board servlet!");
	}
}
