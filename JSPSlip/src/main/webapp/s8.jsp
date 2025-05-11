<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 
	2. Write a JSP program to check whether a given number is prime or not. Display the result 
in red color.   
 -->

<%
	int f=0;
	String no=request.getParameter("t1");

	if(no!=null)
	{
		int n=Integer.parseInt(no);
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			f=1;
			break;
		}
	}
	if(f==1)
		out.println("<h1 color:red>Number Is Prime</h1>");
	else
		out.println("<h1 style=color:red;>Number Is NOT Prime</h1>");
	}
%>