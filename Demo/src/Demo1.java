import java.io.*;
import javax.servlet.*;
/**
 * Servlet implementation class Demo1
 */
public class Demo1 extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		pw.println("Hii");
	}

}
