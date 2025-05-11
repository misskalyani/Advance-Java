
//Transaction Control Langauge
import java.util.*;
import java.sql.*;
public class TCL
{
   public static void main(String[] args)throws Exception
   {
  	Class.forName("org.postgresql.Driver");
  	Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
  	con.setAutoCommit(false);
  
  	Statement st=con.createStatement();
  	Scanner sc=new Scanner(System.in);
  	System.out.println("Enter emp no:");
  	int no=sc.nextInt();
  	int k=st.executeUpdate("delete from emp where  eno="+no);
  	System.out.println("Record Deleted....");
  	System.out.println("Are u Sure? yes/no");
  	String s1=sc.next();
   	if(s1.equals("yes"))
   	{
	   con.commit();
	   System.out.println("Record commited/delete pernmently...");
   	}
   	else
   	{
	   con.rollback();
	   System.out.println("Record Rollback...");
  	}
   
  	st.close();
  	con.close();
}
}