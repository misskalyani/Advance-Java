package Slip;
//1. Write a Java program to display information about the database and list all the tables in the database. (Use DatabaseMetaData). 
import java.sql.*;
public class s13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		ResultSet rs;
		DatabaseMetaData dmd;
		try{
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		dmd=con.getMetaData();
		rs=dmd.getTables(null, null, null, new String[]{"TABLE"} );
		while(rs.next())
		{
			//System.out.println(rs.getString("TABLE_NAME"));
			System.out.println(rs.getString(3));
		}
		
		}catch(Exception e){}
	}

}
