import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;
public class NCheckPonit {

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
			
			Savepoint sv1=con.setSavepoint("save");
			
			pst.setFloat(1,20);
			pst.setInt(2,3);
			pst.executeUpdate();
			
			
			pst.setFloat(1,320);
			pst.setInt(2,4);
			pst.executeUpdate();
			
			Savepoint sv2=con.setSavepoint("save");
			
			pst.setFloat(1,20000);
			pst.setInt(2,5);
			pst.executeUpdate();
			
			pst.setFloat(1,340000);
			pst.setInt(2,6);
			pst.executeUpdate();
			
			pst=con.prepareStatement("select sal from emp");
			rs=pst.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getFloat(1));
										


				if(rs.getFloat(1)>50000)
				{
					con.rollback(sv);
					con.rollback(sv1);
					con.rollback(sv2);
				}
			}
			con.commit();
		}catch(Exception e){}
		
		

		 
	}

}
