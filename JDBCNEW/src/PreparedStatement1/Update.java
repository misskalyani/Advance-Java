package PreparedStatement1;

//Update Record  Using PreparedStatement:
import java.sql.*;
import java.util.*;
public class Update
{
   public static void main(String[] args)throws Exception
   {
       Scanner sc=new Scanner(System.in);
       try
       {
	   Class.forName("org.postgresql.Driver");
	   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
           PreparedStatement pst=con.prepareStatement("update emp set ename=?,sal=? where eno=?");
    	   System.out.println("Enter Emp no to update Record:");
           int num=sc.nextInt();
           System.out.println("Enter new Emp name:");
           String nm=sc.next();
           System.out.println("Enter new Emp sal:");
           float s=sc.nextFloat();
        
           pst.setString(1, nm);
           pst.setFloat(2, s);
           pst.setInt(3,num);
           pst.executeUpdate();
           System.out.println("Record Updated...");
    }
    catch(Exception e)
    {  
	 System.out.println(e);
    }
}
}
