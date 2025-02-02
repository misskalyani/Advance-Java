import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.*;
import java.sql.*;
public class insert extends GenericServlet {
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
			Statement st=con.createStatement();
			int eno=Integer.parseInt(req.getParameter("t1"));
			String name=req.getParameter("t2");
			int sal=Integer.parseInt(req.getParameter("t3"));
			String s="insert into emp values("+eno+",'"+name+"',"+sal+")";
			st.executeUpdate(s);
			pw.println("Insert Successfully....");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	
}
