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
		
		//�������� ���������� �����Ѵ�.
//		out.println("Send to Browser Hello?");
		String html = "";
		html += "<html>";
		html += "<body>";
		html += "Hello, World!!!";
		html += "</body>";
		html += "</html>";
		out.println(html);
		
		//�ַܼ� ������ ��µȴ�.
		System.out.println("�������� �����Ͱ� ���۵Ǿ����ϴ�.");
	}

}
