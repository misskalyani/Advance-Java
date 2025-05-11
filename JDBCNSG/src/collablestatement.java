import java.util.*;
import java.sql.*;
public class collablestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		PreparedStatement st;
		
		try{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
			/*st=con.prepareStatement("Call student (?,?)");
			st.setInt(1,4);
			st.setString(2,"om");
			st.execute();
			System.out.println("Insert SuccesFuly..");*/
			
			/*CallableStatement ct=con.prepareCall("{call student(?,?)}");
			ct.setInt(1,4);
			ct.setString(2,"om");
			ct.execute();
			System.out.println("Insert SuccesFuly..");*/
			
			/*CallableStatement ct=con.prepareCall("{?=call student(?)}");//fist ?-Snmae second /-rno
			ct.setInt(2,4);
			ct.registerOutParameter(1,Types.VARCHAR);	
			ct.execute();
			String nm=ct.getString(1);
			System.out.println(nm);*/
		}catch(Exception e){}
	}

}
/*create or replace function student(IN rno int,IN name varchar(20)) returns void language plpgsql as '
begin
insert into student values(rno,name);
end;
';

create or replace function student(IN rno int,OUT name varchar(20)) language plpgsql as '
begin
select sname into snm from stud where rollno=rno;
return 0;
end;
';*/