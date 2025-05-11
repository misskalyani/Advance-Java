

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String nm=request.getParameter("t1");
		pw.print("Welcome ....!"+nm);
	}

}
