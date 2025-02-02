package ResultSet1;

//ResultSet Display All data 
import java.sql.*;
public class ResultSetDisp
{
  public static void main(String[] args)throws Exception
  {
	  Class.forName("org.postgresql.Driver");
      	  Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select * from emp");
 
          while(rs.next())
  	  {
     	      System.out.println("Emp No ="+rs.getInt(1));
              System.out.println("Emp Name ="+rs.getString(2));
              System.out.println("Emp Sal ="+rs.getString(3));
          }
  rs.close();
  st.close();
  con.close();
 }
}