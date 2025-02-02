package JDBC;

import java.sql.*;
public class MD {

	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		DatabaseMetaData dmd;
		try{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
			st=con.createStatement();
			dmd=con.getMetaData();
			rs=dmd.getTables(null,null,null,new String []{"TABLE"});
			while(rs.next())
			{
				//System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));
				//System.out.println(rs.getString("table_schem")+"\t\t"+rs.getString("table_name")+"\t\t"+rs.getString("table_type")+"\t\t"+rs.getString("Owner"));
				//System.out.println(rs.getString(3));
				System.out.println(rs.getString("table_name"));
			}
			System.out.println("UserName = "+dmd.getUserName());
			System.out.println("URL = "+dmd.getURL());
			System.out.println("DB Product Name = "+dmd.getDatabaseProductName());
			System.out.println("DB Product Version = "+dmd.getDatabaseProductVersion());
			System.out.println("Driver Name = "+dmd.getDriverName());
			System.out.println("Driver Version Name = "+dmd.getDriverVersion());
			System.out.println("Driver major Version= "+dmd.getDriverMajorVersion());
			System.out.println("Driver Minor Version = "+dmd.getDriverMinorVersion());
		}catch(Exception e){}
	}

}
