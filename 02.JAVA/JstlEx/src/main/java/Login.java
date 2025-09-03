import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		///login으로 get요청이 왔을 때 login.jsp로 포워딩
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}

	//loginok.jsp
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(id);
		System.out.println(pw);
		//select * from user where id = ? and pw = ?
		
		UserVO user = new UserVO();
		user.setId(id);
		user.setPw(pw);
		user.setNick("나뭇잎");
		
		request.getSession().setAttribute("user", user);
		//session
		
		response.sendRedirect("home");
		//브라우저에게 /home이라는 url을 가지고있는 서블릿클래스에게 get요청보내라는 명령
		
		//아이디 비밀번호 받아서, 데이터베이스 연결하고 조회
		//조회정보가 있으면? userVO에 담고, 세션에 저장 -> home redirect
		//조회정보가 없으면? 다시 로그인하세요 -> login redirect
	}

}
