package ezen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal.do")
public class Cal extends HttpServlet {
    public Cal() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
//		String x = "aa";
//		String y = "22";
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		System.out.println("���� x : " + x);
		System.out.println("���� y : " + y);
		
		//ȭ�鿡 "11 + 22 = 33"�̶�� ����ϼ���.
		int ix = 0;
		int iy = 0;
		int iz = 0;
		
		try
		{
			ix = Integer.parseInt(x);
			iy = Integer.parseInt(y);
			iz = ix + iy;
			
			String html = "";
			html = String.format("%d + %d = %d", ix, iy, iz);
			out.println(html);
			
		}catch(Exception e)
		{
			out.println("Bad value");
		}
		
	}

}
