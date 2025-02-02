package ResultSet1;

//ResultSet MetaData::Extra Info of Data 
import java.sql.*;
public class RSMD
{
public static void main(String[] args)throws Exception
{
	  Class.forName("org.postgresql.Driver");
    Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from emp");
 ResultSetMetaData rsm=rs.getMetaData();
   int cols=rsm.getColumnCount();
   System.out.println("Number of Cols="+cols);
for(int i=1;i<=cols;i++)
{
    System.out.println("\nColumn Name="+rsm.getColumnName(i));
    System.out.println("Datatype="+rsm.getColumnTypeName(i));
    System.out.println("size="+rsm.getColumnDisplaySize(i));
}
rs.close();
st.close();
con.close();
}
}
