//Count emp
import java.sql.*;
public class Countemp
{
  public static void main(String[] args)throws Exception
  {
	  Class.forName("org.postgresql.Driver");
      Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery("select * from emp");
  int cnt=0;
  while(rs.next())
  {
      cnt++;
  }
  System.out.println("Number of record ="+cnt);
  rs.close();
  st.close();
  con.close();
 }
}