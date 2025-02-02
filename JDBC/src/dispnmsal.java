//Search eno display name sal 
import java.sql.*;
import java.util.*;
public class dispnmsal
{
  public static void main(String[] args)throws Exception
  {
	  Class.forName("org.postgresql.Driver");
      Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
      Statement st=con.createStatement();

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Emp No To search =");
      int no=sc.nextInt();

      ResultSet rs=st.executeQuery("select * from emp where eno="+no);
 
 if(rs.next())
  {
      System.out.println("Emp Name ="+rs.getString(2));
      System.out.println("Emp Sal ="+rs.getString(3));
  }
 else
  {
	System.out.println("Record Not Found .....");
  }
  rs.close();
  st.close();
  con.close();
 }
}