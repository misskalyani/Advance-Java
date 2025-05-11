import java.util.Set; 
import jakarta.servlet.*; 
import jakarta.servlet.annotation.WebServlet; 
import jakarta.servlet.http.*; 
import java.io.*;
@WebServlet("/info") 
public class s2 extends HttpServlet  
{ 
 @Override 
 protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
 { 
   
  PrintWriter out=resp.getWriter(); 
  //out.println("<h1>HTTP server info</h1>"); 
  out.println("IP Address:"+req.getLocalAddr()); 
  out.println("Browser Name:"+req.getHeader("User-Agent")); 
  out.println("Request Method:"+req.getMethod()); 
  out.println("Request URI:"+req.getRequestURI()); 
   
  out.println("Server Name:"+req.getServerName()); 
  out.println("Server Port:"+req.getServerPort()); 
   
  out.println("Operating Sytem:"+System.getProperty("os.name")); 
  out.println("Operating Sytem Version:"+System.getProperty("os.version")); 
   
  ServletContext context=getServletContext(); 
  Set<String> names=context.getServletRegistrations().keySet(); 
  for(String servletname:names) 
  { 
   out.println(servletname); 
  } 
   
   
 } 
} 
 
