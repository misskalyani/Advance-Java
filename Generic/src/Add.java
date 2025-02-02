

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;


/**
 * Servlet implementation class Add
 */
public class Add extends GenericServlet {
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		PrintWriter pw=res.getWriter();
		String s1=req.getParameter("t1");
		String s2=req.getParameter("t2");
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=a+b;
		pw.println("Addition ="+c);
	}

}
