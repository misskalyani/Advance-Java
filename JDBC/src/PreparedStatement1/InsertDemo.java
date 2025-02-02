package PreparedStatement1;

//Insert Record  Using PreparedStatement:
import java.sql.*;
import java.util.*;
public class InsertDemo
{
   public static void main(String[] args)throws Exception
   {
	 Scanner sc=new Scanner(System.in);
         try
	 {
	   Class.forName("org.postgresql.Driver");
	   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
      	   PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");
           for(int i=1;i<=5;i++)
   	   {
    	      System.out.println("Enter Emp no:");
              int num=sc.nextInt();
              System.out.println("Enter Emp name:");
              String nm=sc.next();
              System.out.println("Enter Emp sal:");
              float s=sc.nextFloat();
        
              pst.setInt(1, num);
              pst.setString(2, nm);
              pst.setFloat(3, s);
              pst.executeUpdate();
              System.out.println("Record inserted....");
       }
	 }
       catch(Exception e)
       {
	  System.out.println(e);
       }

	 }
   }
