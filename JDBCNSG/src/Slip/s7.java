package Slip;
/*. Write a java program for the following:
i. To create a Product(Pid, Pname, Price) table.
ii. Insert at least five records into the table.
iii. Display all the records from a table*/
import java.sql.*;
import java.util.*;
public class s7 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement s;
		String q;
		ResultSet rs;
		try{
			Class.forName("org.postgresql.Driver");
		
			con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		}catch(Exception e)
		{}
		Scanner sc=new Scanner(System.in);
		int ch,pid,pr,n;
		String pnm;
		do
		{
			System.out.println("1-Create table \n2-Insert\n3-Display");
			System.out.println("Enter Choice ");
		    ch=sc.nextInt();
			switch(ch)
			{
				case 1:
						
						q="create table product(pid int ,pnm varchar(10),pr float)";
						s=con.prepareStatement(q);
						s.execute();
						System.out.println("TABLE CREATED");
						break;
						
				case 2:
						
							System.out.println("Enter Product Id ");
							pid=sc.nextInt();
							System.out.println("Enter Product Name ");
							pnm=sc.next();
							System.out.println("Enter Product Price ");
							pr=sc.nextInt();
						
						q="insert into product values(?,?,?)";
						s=con.prepareStatement(q);
						s.setInt(1, pid);
						s.setString(2,pnm);
						s.setFloat(3,pr);
						s.executeUpdate();
						System.out.println("Value Inserted");
						break;
				case 3:
						q="select * from product";
						s=con.prepareStatement(q);
						rs=s.executeQuery();
						System.out.println("PID   \t PNM  \t PRi  \t");
						System.out.println("-----------------------------------");
						while(rs.next())
						{
							System.out.println(rs.getInt(1)+"  |\t"+rs.getString(2)+"  |\t"+rs.getFloat(3));
						}
			}
		}while(ch<4);
	}
}
