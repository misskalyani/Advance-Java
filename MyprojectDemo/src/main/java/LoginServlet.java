import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.*;
import java.sql.*;
import jakarta.annotation.*;
import jakarta.servlet.http.*;
@WebServlet("/Login")
public class LoginServlet extends HttpServlet 
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("t1");
		String pass=req.getParameter("t2");
		Connection con=null;
		ResultSet rs=null;
		Statement st=null;
		RequestDispatcher rd;
		try
		{
			con=DBConnect.fetchConnection();
			st=con.createStatement();
			String q="select * from users where username='"+name+"' and Password='"+pass+"'";
			rs=st.executeQuery(q);
			if(rs.isBeforeFirst())
			{
				rd=req.getRequestDispatcher("WelcomeServlet.java");
				rd.forward(req, res);
			}
			else
			{
				res.sendRedirect("Error.html");
			}
		}catch(Exception e) {}
		
	}
}
