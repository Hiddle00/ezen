

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.UserVO;

/**
 * Servlet implementation class HomeServlet
 */
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//프로젝트마다 별도의 contextPath를 지정해주지않으면 주소가 겹침
		//server side rendering
		//get으로 요청하면 응답으로 문자열(append) 응답을 보냄
		//OOP 하나의 파일이 너무 많은 일을 하게 되니 요청은 서블릿이 받고 응답은 jsp로 떠넘긴다(포워딩)
		
		//응답을 jsp에 떠넘김(전달,포워딩)
		//요청을 받는건 서블릿, 화면을 보여주는건 jsp
		//jsp화면을 보여주는 방법
		//1. redirect
		//브라우저한테 jsp에 요청하라는 명령을 하달
		//요청이 두번 발생
		//첫번째 요청 : 서블릿 /home으로 요청
		//첫번째 응답 : home.jsp로 다시 요청하라는 명령
		//두번째 요청 : home.jsp에 요청
		//두번째 응답 : home.jsp 화면
		//2. foward
		//요청을 받은 서블릿이 화면만 다른 jsp로 갈아끼는것
		//첫번째 요청 : 서블릿 /home으로 요청
		//서블릿에서 응답을 보내주기 전에 내부적으로 jsp에게 화면 요청
		//첫번째 응답 : 서블릿에서 jsp화면을 브라우저에 응답
		
		//redirect
		//response.sendRedirect("home.jsp");
		
		//forward 하기 전 jsp에게 데이터 넣어주기
		//1. session
		//오래 유지 
		//한시간 or 브라우저가 꺼지기 전 or 서버가 재시작 되기 전
		//모든 파일에서 접근 가능(jsp, servlet)
		request.getSession().setAttribute("key", "hello");
		
		UserVO user = new UserVO();
		user.setAge(20);
		user.setHeight(180.5);
		user.setName("홍길동");
		// /home url을 거치지 않으면 세션에 저장되지 않음
		
		request.getSession().setAttribute("user", user);
		//2. request
		//요청하는 동안에만 유지
		//요청이 끝나고 응답이 오면 사라짐
		//포워딩은 요청이 한번만 발생하기 때문에 서블릿에서 jsp에 데이터를 담아줄 수 있다.
		request.setAttribute("key", "hi");
		
		//forward
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
