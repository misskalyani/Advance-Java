<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<% 
	Class.forName("org.postgresql.Driver");
	Connection con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
	out.print("connection successfully...");
	PreparedStatement pst=con.prepareStatement("select * from emp");
	ResultSet rs=pst.executeQuery();
	while(rs.next())
	{
		out.println(rs.getInt(1)+rs.getString(2)+rs.getFloat(3));
	}
%>