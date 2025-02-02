import javax.servlet.*;
import java.io.*;
public class AddDemo extends GenericServlet
{
   public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
   {
     PrintWriter pw=res.getWriter();
     String s1=req.getParameter("t1");
     String s2=req.getParameter("t2");
     int a=Integer.parseInt(s1);
     int b=Integer.parseInt(s2);
     int c=a+b;
    pw.println("<h1> Addition="+c);
   }
}