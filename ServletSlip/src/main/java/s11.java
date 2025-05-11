import java.io.IOException; 
import java.io.PrintWriter; 
import java.sql.*; 
import jakarta.servlet.ServletException; 
import jakarta.servlet.annotation.WebServlet; 
import jakarta.servlet.http.*; 
 
@WebServlet("/customer") 
public class s11 extends HttpServlet 
{ 
 
 @Override 
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws 
ServletException, IOException { 
  try 
  { 
   Class.forName("org.postgresql.Driver"); 
   Connection 
con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root"); 
   String no=req.getParameter("number"); 
   int number=Integer.parseInt(no); 
   PrintWriter out=resp.getWriter(); 
   String q="select * from customer where cno=?"; 
   PreparedStatement p=con.prepareStatement(q); 
   p.setInt(1, number); 
   ResultSet rs=p.executeQuery(); 
   while(rs.next()) 
   { 
    out.println(rs.getInt(1)+" "+rs.getString(2)); 
   } 
    
  }catch(Exception e) 
  { 
   System.out.println(e); 
  } 
   
 } 
} 
 
 
