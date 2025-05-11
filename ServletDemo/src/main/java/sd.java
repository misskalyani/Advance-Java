

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

/**
 * Servlet implementation class sd
 */
@WebServlet("/sd")
public class sd extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("html/text");
		PrintWriter out=response.getWriter();
		out.print(request.getHeader("User-Agent"));
		out.print(request.getLocalPort()+"<br>"+request.getLocalAddr()+"<br>"+request.getScheme());
		ServletContext context =getServletContext();
		Set<String> names= context.getServletRegistrations().keySet();
		  for(String servletname:names) 
		  { 
		   out.println(servletname); 
		  }
		
	}

}
