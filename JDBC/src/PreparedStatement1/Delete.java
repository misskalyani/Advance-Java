package PreparedStatement1;

//Delete Record using PreparedStatement

import java.sql.*;
import java.util.*;
public class Delete
{
   public static void main(String[] args)throws Exception
   {
	Scanner sc=new Scanner(System.in);
        try
        {
	   Class.forName("org.postgresql.Driver");
	   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
           PreparedStatement pst=con.prepareStatement("delete from emp where eno=?");
    	   System.out.println("Enter Emp no to delete Record:");
           int num=sc.nextInt();
        
           pst.setInt(1,num);
           pst.executeUpdate();
           System.out.println("Record deleted...");
       }catch(Exception e)
	{

	   System.out.println(e);
	}
}
}