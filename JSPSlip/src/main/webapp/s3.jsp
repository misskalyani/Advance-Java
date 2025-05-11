<!--
Write a JSP program to display the details of Patient (PNo, PName, Address, age, 
disease) in tabular form on browser.   
-->
<html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.sql.*" %>
<% 
	Connection con;
	PreparedStatement pst;
	ResultSet rs= null;
	try
	{
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql:postgres","postgres","root");
		out.println("Success");
		String sql="Select * from emp";
		pst=con.prepareStatement(sql);
		rs=pst.executeQuery();
	}
	catch(Exception e)
	{
		out.println(e);
	}
%>
	<table border=1>
			<tr><th>Name</th>
				<th>No</th>
			</tr>
		<%
			while(rs.next())
			{
		%>
			<tr>
				<td><%=rs.getString(1)%> </td>
				<td><%=rs.getInt(2)%></td>
			</tr>
		<%
			}
		%>
	</table>
</html>