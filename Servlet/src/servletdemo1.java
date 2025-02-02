import javax.servlet.*;
import java.io.*;
public class HelloDemo extends GenericServlet
{
   public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
   {
      PrintWriter pw=res.getWriter();
       pw.println("<h1>Hiii.....I am first Servlet...ok");
   }   
}