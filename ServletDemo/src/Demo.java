import javax.servlet.*;
import java.io.*;
public class Demo extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		pw.println("<h1>Heellloo....I Am First Servlet.......");
	}
}