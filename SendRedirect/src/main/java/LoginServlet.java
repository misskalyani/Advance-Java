

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

@WebServlet("/LoginDB")
public class LoginServlet extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String nm=request.getParameter("t1");
		String p=request.getParameter("t2");
		
		Connection con;
		Statement st;
		ResultSet rs;
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
			 st=con.createStatement();
			 rs=st.executeQuery("Select * from users where unm='"+nm+"' and pass='"+p+"'");
			 if(rs.isBeforeFirst())
			 {
				 response.sendRedirect("success.html");
			 }
			 else
			 {
				response.sendRedirect("error.html");
			 }
		}catch(Exception e)
		{
			pw.print(e);
		}
	}

}
