import java.sql.*;
public class commmitrollback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
			con.setAutoCommit(false);
			String q="update emp set sal=? where eid=?";
			pst=con.prepareStatement(q);
			pst.setFloat(1,65000);
			pst.setInt(2,1);
			pst.executeUpdate();
			
			Savepoint sv=con.setSavepoint("save");
			
			pst.setFloat(1,450);
			pst.setInt(2,2);
			pst.executeUpdate();
			
			pst.setFloat(1,20);
			pst.setInt(2,3);
			pst.executeUpdate();
			
			
			pst=con.prepareStatement("select sal from emp");
			rs=pst.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getFloat(1));/*65000.0
													450.0	
													20.0*/


				if(rs.getFloat(1)<50000)
				{
					con.rollback(sv);
				}
			}
			con.commit();
		}catch(Exception e){}
		
		
/* 
postgres=# select * from emp;
 eid |  sal
-----+-------
   2 | 45000
   3 | 25000
   1 | 65000
(3 rows)
 */ 
		 
	}

}
