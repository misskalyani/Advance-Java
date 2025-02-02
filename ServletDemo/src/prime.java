import java.io.*;
import javax.servlet.*;


public class prime extends GenericServlet 
{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		int num=Integer.parseInt(req.getParameter("t1"));
		int i,n;
		for(n=1;n<=num;n++)
		{
			for(i=2;i<n;i++)
			{
				if(n%i==0)
					break;
			}
			if(i==n)
				pw.print("<font color='red'>"+n);
		}
	}

}
