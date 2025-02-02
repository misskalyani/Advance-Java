import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class dispatient extends GenericServlet
{
	public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException
	{
  		res.setContentType("text/html");
  		PrintWriter pw=res.getWriter();
  		try
  		{
			Class.forName("org.postgresql.Driver");
    			Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
    			Statement st=con.createStatement();
    			ResultSet rs=st.executeQuery("select * from emp");
    			pw.println("<table border=1>");
    			pw.println("<tr><th>Eno <th>name <th>sal </tr>");
    			while(rs.next())
    			{
				pw.println("<tr><td>"+rs.getString(1));
    				pw.println("<td>"+rs.getString(2));
    				pw.println("<td>"+rs.getString(3));
    				pw.println("</tr>");
    			}
    			pw.println("</table>");

  		}catch(Exception e)
  		{
  			System.out.println(e);
  		}
  		
	}	
}