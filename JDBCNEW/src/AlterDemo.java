import java.sql.*;
public class AlterDemo
{
   public static void main(String[] args)throws Exception
   {
       try
	{
	   Class.forName("org.postgresql.Driver");
	   Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	   Statement st=con.createStatement();
	   st.executeUpdate("create table book(bno int,bname char(10),price float)"); 
	   System.out.println("Table Create");
	   
	   st.executeUpdate("alter table book drop column price"); 
	   System.out.println("Table alter");
	   st.executeUpdate("drop table book"); 
	   System.out.println("Table delete");
	}
	catch(Exception e)
	{
	   System.out.println(e);
	}

}
}