import java.sql.*;
import java.util.*;

public class DROPTABLE
{
   public static void main(String[] args)throws Exception
   {
	   try
	   {
  		Class.forName("org.postgresql.Driver");
  		Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
  		Statement st=con.createStatement();
  		Scanner sc=new Scanner(System.in);
  		System.out.println("Enter Table name:");
  		String tn=sc.next();
  		System.out.println("Enter new column name:");
  		String col=sc.next();
  		System.out.println("Enter datatype:");
  		String dt=sc.next();
  		st.executeUpdate("alter table "+tn+" add column "+col+"  "+dt+"");
  		System.out.println("Column Added......");
  		System.out.println("Enter Table name to drop:");
  		String tn1=sc.next();
  		st.executeUpdate("drop table "+tn1);
  		System.out.println("Table Drop succ...");
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
}
 }