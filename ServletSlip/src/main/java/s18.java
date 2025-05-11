/*. Write a SERVLET program in java to accept details of student (SeatNo,   Stud_Name, 
Class, Total_Marks). Calculate percentage and grade obtained and     
display details on 
page.*/
import java.io.IOException; 
import java.io.PrintWriter; 
import jakarta.servlet.ServletException; 
import jakarta.servlet.annotation.WebServlet; 
import jakarta.servlet.http.*; 
@WebServlet("/student") 
public class s18 extends HttpServlet 
{ 
 @Override 
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws 
ServletException, IOException { 
  try 
  { 
   String rno=req.getParameter("rno"); 
   String name=req.getParameter("name"); 
   String clas=req.getParameter("class"); 
   String mark=req.getParameter("mark"); 
   int marks=Integer.parseInt(mark); 
   int per=marks/5; 
   String grade=""; 
   if(per>=70 && per<=100) 
    grade="O"; 
   else if(per>=60 && per<70) 
    grade="A"; 
   else if(per>=50 && per<60) 
    grade="B"; 
   else if(per>=40 && per<50) 
    grade="C"; 
   else 
    grade="fail"; 
 
   resp.getWriter().println("Rollno::"+rno); 
   resp.getWriter().println("Student Name::"+name); 
   resp.getWriter().println("Student Class::"+clas); 
   resp.getWriter().println("Percenatge::"+per); 
   resp.getWriter().println("Grade::"+grade); 
  }catch(Exception e) 
  { 
    
  } 
 } 
} 
