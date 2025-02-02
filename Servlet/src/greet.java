import javax.servlet.*;
import java.io.*;
import java.util.*;
public class Greet extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException
	{
  		res.setContentType("text/html");
  		PrintWriter pw=res.getWriter();
  		String u=req.getParameter("t1");
  		Date d1=new Date();
  		int hr=d1.getHours();
  		if(hr>12 && hr<=17)
	  		pw.println("Good Afternoon:"+u);
  		else if(hr>17&&hr<=21)
	  		pw.println("Good Evening:"+u);
  		else if(hr>21&&hr<=24)
	  		pw.println("Good Night:"+u);
  		else
		  	pw.println("Good Morning"+u);
	}	
}