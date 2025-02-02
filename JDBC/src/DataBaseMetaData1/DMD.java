package DataBaseMetaData1;
import java.sql.*;
import java.util.*;
public class DMD
{
   	public static void main(String[] args)throws Exception
   	{
  		Class.forName("org.postgresql.Driver");
  		Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
  		DatabaseMetaData dmd=con.getMetaData();
 		
		System.out.println("Database Product Name="+dmd.getDatabaseProductName());
  		System.out.println("Database Product Version="+dmd.getDatabaseProductVersion());
  		
		System.out.println("Database Driver Name="+dmd.getDriverName());
  		System.out.println("Database Driver Version Name="+dmd.getDriverVersion());
		
		System.out.println("Database User Name="+dmd.getUserName());
   		
		ResultSet rs=dmd.getTables(null, null,null, new String[]{"TABLE"});
   		
		System.out.println("All Tables=");
     		while(rs.next())
     		{
	    		//System.out.println(rs.getString(3));
    	 		System.out.println(rs.getString("TABLE_NAME"));
     		}
     	}
}


