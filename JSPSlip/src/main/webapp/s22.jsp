<!-- 
2. Write a JSP program which accepts UserName in a TextBox and greets the user 
according to the time on server machine.   
 -->
 <%@page import="java.util.*"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%> 

<% 

Date d=new Date();
String name=request.getParameter("name"); 
int hours=d.getHours(); 
String greet=""; 
if(hours>=5 && hours<=12) 
{ 
greet="Good morning"; 
} 
else if(hours>12 && hours<=18) 
{ 
greet="Good Afternoon"; 
} 
else 
{ 
greet="Good Evening"; 
} 
out.println("<h1>"+greet+" "+name+ "</h1>"); 
%>