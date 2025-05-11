/*Write a SERVLET program which counts how many times a user has visited a web 
page. If user is visiting the page for the first time, display a welcome message. If the 
user is revisiting the page, display the number of times visited. (Use Cookie) */
 
import java.io.*; 
import jakarta.servlet.*; 
import jakarta.servlet.annotation.WebServlet; 
import jakarta.servlet.http.*; 
@WebServlet("/counter") 
public class s15 extends HttpServlet 
{ 
   static int i=1; 
     public void doGet(HttpServletRequest request,HttpServletResponse response) 
             throws IOException,ServletException 
     { 
         response.setContentType("text/html"); 
         PrintWriter out=response.getWriter(); 
         String s=String.valueOf(i); 
         Cookie c=new Cookie("visit",s); 
         //c.setMaxAge(60*60*24*30); 
         response.addCookie(c); 
         int visit=Integer.parseInt(c.getValue()); 
         if(visit==1) 
         { 
             out.println("Welcome to web page "); 
         } 
         else         
         { 
             out.println("You are visited at "+i+" times"); 
         } 
         i++;     
    } 
}