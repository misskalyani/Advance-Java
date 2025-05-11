

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

@WebServlet("/Register")
public class Register extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		String name=request.getParameter("t1");
		String e=request.getParameter("t2");
		int age=Integer.parseInt(e);
		String mobile=request.getParameter("t3");
		String username=request.getParameter("t4");
		String pass=request.getParameter("t5");
		PrintWriter pw=response.getWriter();
		Connection con=null;
		RequestDispatcher rd;
		try
		{
			con=DBConnect.fetchConnection();
			System.out.println("Conn suc");
			/*Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");*/
			PreparedStatement pst=con.prepareStatement("insert into Users Values (?,?,?,?,?)");
			pst.setString(1,name);
			pst.setInt(2, age);
			pst.setString(3,mobile);
			pst.setString(4,username);
			pst.setString(5, pass);
			pst.executeUpdate();
			pw.println("<div style=color:green>Registration Successfull..!</div>");
			rd=request.getRequestDispatcher("Index.html");
			rd.include(request, response);
		}
		catch(Exception ex)
		{
			response.sendRedirect("Error.html");
		}
		}
	}
/*
web.xml
<web-app>
	<servlet>
			<servlet-name>Login<servlet-name>
			<servlet-class>LoginServlet</servlet-class>
	</servlet>
	<servlet-mapping>
			<servlet-name>Login</servlet-name>
			<url-pattern>/Login</url-pattern>
			
	</servlet-mapping>
	
	<servlet>
			<servlet-name>Register<servlet-name>
			<servlet-class>RegisterServlet</servlet-class>
	</servlet>
	<servlet-mapping>
			<servlet-name>Register</servlet-name>
			<url-pattern>/Register</url-pattern>
			
	</servlet-mapping>
	
	<servlet>
			<servlet-name>Welcome<servlet-name>
			<servlet-class>WelcomeServlet</servlet-class>
	</servlet>
	<servlet-mapping>
			<servlet-name>Welcome</servlet-name>
			<url-pattern>/Welcome</url-pattern>
			
	</servlet-mapping>
</web-app>
*/
	

