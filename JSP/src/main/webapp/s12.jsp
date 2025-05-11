<%@ page language="java" contentType="text/html"%>
 <%@ include file="s12.html" %>
<%
	String m=request.getParameter("number");
	if(m!=null)
	{
	int n=Integer.parseInt(m); 
	 int sum=0; 
	 for(int i=1;i<n;i++) 
	 { 
	  if(n%i==0) 
	  { 
	   sum=sum+i; 
	  } 
	 } 
	 if(sum==n) 
	 { 
	  out.println("no is perfect"); 
	 } 
	 else 
	 { 
	  out.println("no is not perfect"); 
	 } 
	}
	
%>
