package Slip;
/* Write a Java program to accept the details of Teacher (TNo, TName, Subject). Insert at
least 5 Records into Teacher Table and display the details of Teacher who is teaching 
“JAVA” Subject. (Use PreparedStatement Interface) */
import java.sql.*;
import java.util.*;
public class s16 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		try{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		Scanner sc=new Scanner(System.in);
		int ch;
		String q;
		PreparedStatement pst = null;
		do
		{
			System.out.println("1-Insert \n 2-Display");
			System.out.println("Enter choice ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
						for(int i=0;i<5;i++)
						{
							System.out.println("Enter TNO = ");
							int tno=sc.nextInt();
							System.out.println("Enter TName = ");
							String tnm=sc.next();
							System.out.println("Enter Subject = ");
							String sub=sc.next();
							q="insert into teacher values(?,?,?)";
							pst=con.prepareStatement(q);
							pst.setInt(1,tno);
							pst.setString(2, tnm);
							pst.setString(3,sub);
							pst.executeUpdate();
						}
						
					
						System.out.println("Insert Successfully...");
						break;
				case 2:		
					    q="Select * from teacher where sub='java'";
						pst=con.prepareStatement(q);
						ResultSet rs=pst.executeQuery();
						while(rs.next())
						{
							System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
						}
						break;
			}
			}while(ch<3);
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
