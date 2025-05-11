

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;


@WebServlet("/Login")
public class Login extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String nm=request.getParameter("t1");
		String p=request.getParameter("t2");
		
		pw.println("Conratulations..."+nm+"<br>");
		pw.print("User Name = "+nm+"<br>");
		pw.print("Password = "+p);
	}

}
