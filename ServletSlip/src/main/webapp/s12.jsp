 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
 String no=request.getParameter("number"); 
 if(no!=null) 
 { 
 int n=Integer.parseInt(no); 
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
 
