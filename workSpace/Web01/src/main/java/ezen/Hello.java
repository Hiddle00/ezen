package ezen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ezen.do")//URL Mapper
public class Hello extends HttpServlet {
 
    public Hello() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		
		//브라우저에 문서내용을 전송한다.
//		out.println("Send to Browser Hello?");
		String html = "";
		html += "<html>";
		html += "<body>";
		html += "Hello, World!!!";
		html += "</body>";
		html += "</html>";
		out.println(html);
		
		//콘솔로 내용이 출력된다.
		System.out.println("브라우저로 데이터가 전송되었습니다.");
	}

}
