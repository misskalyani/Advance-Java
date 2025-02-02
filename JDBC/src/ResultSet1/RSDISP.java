package ResultSet1;

//ResultSet Display All data 
import java.sql.*;
public class RSDISP
{
  public static void main(String[] args)throws Exception
  {
	  Class.forName("org.postgresql.Driver");
      	  Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select * from emp");
 
	   System.out.println("Enmp no \t Emp Name\t EmpSal \t");
	   	   System.out.println("......................................................");
          while(rs.next())
  	  {
     	      System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
              
          }
  rs.close();
  st.close();
  con.close();
 }
}