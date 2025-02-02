package JDBC;
import java.sql.*;
public class demo1 {

	public static void main(String[] args) {
		Connection con;
		ResultSet rs;
		Statement st;
		try{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
			st=con.createStatement();
			rs=st.executeQuery("select*from emp");
			while(rs.next()){
				System.out.println("Eno = "+rs.getString(1));
				System.out.println("Ename = "+rs.getString(2));
				System.out.println("Sal = "+rs.getString(3));
			}
		}catch(Exception e){}
	}

}
