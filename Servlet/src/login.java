import java.io.*;
import javax.servlet.*;
public class AddDemo extends GenericServlet
{
 
	public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException
	{
  		res.setContentType("text/html");
  		PrintWriter pw=res.getWriter();
  
  		String u=req.getParameter("t1");
  		String p=req.getParameter("t2");
  		if(u.equals("admin")&&p.equals("123"))
	  		pw.println("Login Succ....");
  		else
	  		pw.println("Invalid user or pass....");
	}	
}