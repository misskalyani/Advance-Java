<%@ page language="java" contentType="text/html"%>

<%
	String m=request.getParameter("m");
	float p=Float.parseFloat(m);
	out.println("<h1>Marks </h1>"+p);
%>
