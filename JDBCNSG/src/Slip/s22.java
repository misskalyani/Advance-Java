package Slip;
/*. Write a Menu Driven program in Java for the following: Assume Employee table with 
attributes (ENo, EName, Salary) is already created. 1. Insert 2. Update 3. Display 4. 
Exit. */
import java.sql.*;
import java.util.*;
public class s22 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		int ch;
		PreparedStatement st;
		ResultSet rs;
		int eno;
		float sal;
		String nm,q;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println(" 1.Insert \n 2.Update \n3.Display\n 4.Exit");
			System.out.println("Enter Choice = ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:System.out.println("Enter Eno = ");
					   eno=sc.nextInt();
					   System.out.println("Enter name = ");
					   nm=sc.next();
					   System.out.println("Enter salary = ");
					   sal=sc.nextFloat();
					   st=con.prepareStatement("insert into emp values(?,?,?)");
					   st.setInt(1,eno);
					   st.setString(2,nm);
					   st.setFloat(3,sal);
					   st.executeUpdate();
					   System.out.println("Insert Succes...");
					   break;
			   case 2:	
				   	   System.out.println("Enter Eno to Update = ");
				   	   eno=sc.nextInt();
				   	   System.out.println("Enter Updated name = ");
				   	   nm=sc.next();
				   	   System.out.println("Enter Updated salary = ");
				   	   sal=sc.nextFloat();
				   	   st=con.prepareStatement("update emp set ename=?,salary=?  where no=? ");
				   	   st.setInt(3,eno);
				   	   st.setString(1,nm);
				   	   st.setFloat(2,sal);
				   	   st.executeUpdate();
				   	   System.out.println("Updated Succes...");
				   	   break;
			   case 3:
				   	   st=con.prepareStatement("select *from emp");
				   	   rs=st.executeQuery();
				   	   System.out.println("Eno\t Ename\tSalary\n");
				   	   System.out.println("---------------------------------");
				   	   while(rs.next())
				   	   {
				   		   System.out.println(rs.getInt(1)+"\t  |"+rs.getString(2)+"\t  |"+rs.getFloat(3));
				   	   }
			   case 4:break;
			}
		}while(ch>=5);
		
	}

}
