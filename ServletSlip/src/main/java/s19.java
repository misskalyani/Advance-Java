 /*
  2. Write a SERVLET application to accept username and password, search them into 
database, if found then display appropriate message on the browser otherwise display 
error message.        
  */
import java.io.*; 
import java.sql.*; 
import jakarta.servlet.ServletException; 
import jakarta.servlet.annotation.WebServlet; 
import jakarta.servlet.http.*; 
@WebServlet("/slip19") 
public class s19 extends HttpServlet 
{ 
 @Override 
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws 
ServletException, IOException { 
   
  try 
  { 
   resp.setContentType("text/html"); 
   PrintWriter out=resp.getWriter(); 
   String user=req.getParameter("user"); 
   String pass=req.getParameter("pass"); 
   Class.forName("org.postgresql.Driver"); 
   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root"); 
   String query="select * from user"; 
   PreparedStatement pmt=con.prepareStatement(query); 
   ResultSet rs=pmt.executeQuery(); 
   if(rs.next()) 
   { 
    if(rs.getString(1).equals(user) && rs.getString(2).equals(pass)) 
    { 
     out.println("Login Successfull"); 
    } 
    else 
    { 
     out.println("Please enter valid username and Password"); 
    } 
   } 
    
  }catch(Exception e) 
  { 
   System.out.println(e); 
  } 
 } 
} 
