import java.sql.*;
public class Demo {

	public static void main(String[] args)throws Exception
	{
		Class.forName("org.postgresql.Driver");
        Connection con= DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
        Statement st=con.createStatement();
        PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");
        pst.setInt(1,101);
        pst.setString(2,"om");
        pst.setFloat(3,555f);
        int k=pst.executeUpdate();
        if(k>0)
                System.out.println("Record inserted.............");

	}

}