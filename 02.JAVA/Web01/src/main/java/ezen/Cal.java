package ezen;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal.do")
public class Cal extends HttpServlet 
{
    public Cal() 
    {
        super();
    }

    protected void doGet(HttpServletRequest request, 
    		HttpServletResponse response) 
    				throws ServletException, IOException 
    {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
    	PrintWriter out = response.getWriter();
    	String x = request.getParameter("x");
    	String y = request.getParameter("y");
    	
    	System.out.println("x값:" + x);
    	System.out.println("y값:" + y);
    	
    	//화면에 "11 + 22 = 33" 이라고 출력하세요.
    	try
    	{
    		int 	ix = Integer.parseInt(x);	    	int 	iy = Integer.parseInt(y);	    	int 	iz = ix + iy;
	    	
	    	String html ="";
	    	html = String.format("%d + %d = %d",ix,iy,iz);
	    	out.println(html);	    	
    	}catch(Exception e)
    	{
    		out.println("Bad value for plus express.");
    	}
    	
	}

}
