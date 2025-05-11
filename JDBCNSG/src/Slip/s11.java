package Slip;
//Write a Java program to display information about all columns in the DONAR table using ResultSetMetaData.
import java.sql.*;
public class s11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		ResultSetMetaData rsmd;
		ResultSet rs ;
		Statement st;
		String q;
		try{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","root");
			st=con.createStatement();
			q="Select * from DONOR";
			rs=st.executeQuery(q);
			rsmd=rs.getMetaData();
			int n;
			n=rsmd.getColumnCount();
			for(int i=1;i<n;i++)
			{
				System.out.println("Column Name = "+rsmd.getColumnName(i));
				System.out.println("Column Label = "+rsmd.getColumnLabel(i));
				System.out.println("Column Type Name = "+rsmd.getColumnTypeName(i));
				System.out.println("Column Type Name = "+rsmd.getColumnDisplaySize(i));
				System.out.println("Read Only= "+rsmd.isReadOnly(i));
				System.out.println("Writable = "+rsmd.isWritable(i));
				System.out.println("Nullable = "+rsmd.isNullable(i));
			}
		}catch(Exception e){}
		}
	}


