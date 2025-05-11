<!-- 
1. Write a JSP script to accept a String from a user and display it in reverse order.   
 -->
 
 <%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="UTF-8"> 
<title>Insert title here</title> 
</head> 
<body> 
<form > 
<input type="text" name="string" placeholder="Enter String"> 
<input type="submit" value="Reverse"> 
</form> 
<% 
 String input=request.getParameter("string"); 
  
 if(input!=null) 
 { 
  char[] array=input.toCharArray(); 
  String reversed=""; 
  for(int i=array.length-1;i>=0;i--) 
  { 
   reversed+=array[i]; 
  } 
  out.println("Reversed String: "+reversed); 
 } 
  
%> 
</body> 
</html> 
 
 