package JDBC;
import java.sql.*;
public class RSMD {

	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		ResultSetMetaData rsmd;
		try{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
			st=con.createStatement();
			rs=st.executeQuery("select * from emp");
			rsmd=rs.getMetaData();
			int n=rsmd.getColumnCount();
			System.out.println("Number Of Colum = "+n);
			for(int i=1;i<n;i++)
			{
				System.out.println("Colum Name = "+rsmd.getColumnName(i));
				System.out.println("Colum Label = "+rsmd.getColumnLabel(i));
				System.out.println("Colum Display Size = "+rsmd.getColumnDisplaySize(i));
				System.out.println("Nullable = "+rsmd.isNullable(i));
				System.out.println("Writeable = "+rsmd.isWritable(i));
				System.out.println("Readable = "+rsmd.isReadOnly(i));
				System.out.println("Colum Type Name = "+rsmd.getColumnType(i));
			}
		}catch(Exception e){}

	}

}
