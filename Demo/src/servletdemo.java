

import java.io.*;
import javax.servlet.*;


/**
 * Servlet implementation class servletdemo
 */
public class servletdemo extends GenericServlet 
{
	
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
	      PrintWriter pw=res.getWriter();
	      pw.println("<h1>Hiii.....I am first Servlet...ok");
	  }
 
}
