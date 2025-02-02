


import java.sql.*;
import java.util.*;
public class Mobile
{
  public static void main(String[] args)throws Exception
  {
	  ResultSet rs=null;
	  Class.forName("org.postgresql.Driver");
      Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
      Statement st=con.createStatement();
      Scanner sc=new Scanner(System.in);
      
      int ch=0;
      do
      {
    	  System.out.println("1-insert \n2-modify \n 3-del \n 4-search \n 5-view All");
    	  System.out.println("\nEnter choice:");
    	  ch=sc.nextInt();
    	  switch(ch)
    	  {
    	      case 1:System.out.println("Enter model Number:");
	           String model_number=sc.next();
	           System.out.println("Enter model Name:");
	           String model_name=sc.next();
	           System.out.println("Enter model colour:");
	           String model_color=sc.next();
	           System.out.println("Enter SIM TYPE:");
	           String sim_type=sc.next();
	           System.out.println("Enter NEtwork Type:");
	           String network_type=sc.next();
	           System.out.println("Enter battery Capacity:");
	           String battery_capacity=sc.next();
	           System.out.println("Enter Internal Storage:");
	           String internal_storage=sc.next();
	           System.out.println("Enter RAM:");
	           String ram=sc.next();
	           System.out.println("Enter processor type:");
	           String p_type=sc.next();
	            String query="insert into mobile ValueS ('"+model_number+"','"+model_name+"','"+model_color+"','"+sim_type+"','"+network_type+"','"+battery_capacity+"','"+internal_storage+"','"+ram+"','"+p_type+"') ";
	           int k=st.executeUpdate(query);
	           if(k>=1)
	        	   System.out.println("Record Inserted.....");
	           break;
    	    case 2:
    	    	System.out.println("Enter model Number to update:");
 	            model_number=sc.next();
 	           System.out.println("Enter Updated model Name:");
 	            model_name=sc.next();
 	           System.out.println("Enter Updated model colour:");
 	            model_color=sc.next();
 	           System.out.println("Enter Updated SIM TYPE:");
 	            sim_type=sc.next();
 	           System.out.println("Enter Updated NEtwork Type:");
 	            network_type=sc.next();
 	           System.out.println("Enter Updated battery Capacity:");
 	           battery_capacity=sc.next();
 	           System.out.println("Enter Updated Internal Storage:");
 	            internal_storage=sc.next();
 	           System.out.println("Enter Updated RAM:");
 	            ram=sc.next();
 	           System.out.println("Enter Updated processor type:");
 	           p_type=sc.next();
 	          
 	            query="update mobile set Model_Name ='"+model_name+"','"+model_color+"','"+sim_type+"','"+network_type+"','"+battery_capacity+"','"+internal_storage+"','"+ram+"','"+p_type+"' where  Model_Number = "+model_number;
 	           k=st.executeUpdate(query);
 	           if(k>=1)
 	        	   System.out.println("Record Updated.....");
 	           break;
    	    case 3:	System.out.println("Enter model number to del:");
	    	            String m_n=sc.next();
    	           k=st.executeUpdate("delete from mobile where model_number='"+m_n+"'");
    	                 if(k>=1)
    	                	 System.out.println("Record deleted");
    	                 else
    	                	  System.out.println("Record not found..");
    	    	break;
    	    case 4:
    	    	System.out.println("Enter model number to search:");
    	    	String m_num=sc.next();
    	    	String q="select * from mobile where model_number='"+m_num+"'";
    	    	 rs=st.executeQuery(q);
    	    	if(rs.next())
    	    	{
    	    		System.out.println("Record found...");
    	    		System.out.println("Model Name="+rs.getString(2));
    	    	}
    	    	else
    	    		System.out.println("Record not found...");
    	    	break;
    	    case 5:
    	    	rs=st.executeQuery("select * from mobile");
    	    	while(rs.next())
    	    	{
    	    		for(int cols=1;cols<=9;cols++)
    	    		{
    	    		System.out.print(rs.getString(cols)+"    ");
    	    		}
    	    		System.out.println();
    	    	}
    	    	break;
    	  }
      }
      while(ch<6);
  }
}


