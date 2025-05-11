import java.sql.*;
public class ADDBATCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		PreparedStatement pst;
		
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
			String q="update emp set sal=? where eid=?";
			pst=con.prepareStatement(q);
			pst.setFloat(1,65000);
			pst.setInt(2,1);
			pst.addBatch();
			
			pst.setFloat(1,450);
			pst.setInt(2,2);
			pst.addBatch();
			
			pst.setFloat(1,20);
			pst.setInt(2,3);
			pst.addBatch();
			
			pst.executeBatch();
			
		}catch(Exception e){}
	}

}
