

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HomeServlet
 */
//가상경로(url)
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//화면은 서블릿에서 제공X
		//요청(controller)만 담당하고 화면(view)는 다른 파일에 전달(forward)
		
		RequestDispatcher rd = request.getRequestDispatcher("/a.jsp");
		
		//a.jsp에 포워딩할 때 reuqest객체에 값을 넣는다.
		request.setAttribute("user", "hong");
		
		//세션에 "name"이라는 키로 "jeon" 저장
		HttpSession session = request.getSession();
		session.setAttribute("name", "jeon");
		
		//세션에 "user"라는 키로 "sung" 저장
		session.setAttribute("user", "sung");
		
		rd.forward(request, response);
		
		//request.getContextPath() -> /ForwardTest
		
		///ForwardTest/a.jsp
		//response.sendRedirect(request.getContextPath() + "/a.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
