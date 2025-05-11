import java.sql.*;
public class DBConnect {

	public static Connection fetchConnection() 
	{
		String driver="org.postgresql.Driver";
		String dbURL="jdbc:postgresql://localhost/";
		String dbDtabase="postgres";
		String dbUser="postgres";
		String dbPassword="root";
		 Connection con=null;
		 try
		 {
			Class.forName(driver);
			con=DriverManager.getConnection(dbURL+dbDtabase,dbUser,dbPassword);
			return con;
		 }catch(Exception e)
		 {
			 
		 }
		return con;
	

	}

}
