package PreparedStatement1;

//ResultSet Scroll Types and Concurrency
//Display last and last second record
import java.sql.*;
import java.util.*;
public class lastandlastseconddisp
{
   public static void main(String[] args)throws Exception
   {
  	Class.forName("org.postgresql.Driver");
  	Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
  	Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        //Statement st=con.createStatement();
  	ResultSet rs=st.executeQuery("select * from emp");
  	rs.last();
  	System.out.println("LAst Emp no="+rs.getInt(1));
  	System.out.println("Emp name="+rs.getString(2));
  	System.out.println("Emp sal="+rs.getFloat(3));
  	rs.previous();
  	System.out.println("secoond lastEmp no="+rs.getInt(1));
  	System.out.println("Emp name="+rs.getString(2));
  	System.out.println("Emp sal="+rs.getFloat(3));
}
}