<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.User" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>adminova strana</title>
<link rel="stylesheet" type="text/css" href="../css/style.css"/>
</head>
<body>

<div id ="plavaCrta"> LOGO </div>
	<%
		
		User user = (User)session.getAttribute("userIzBaze");
	
	%>
	
	<h1> Hello <%=user.getUserName() %></h1>
	
	<a href ="../SviUseriServlet"> 
	
	<img src="../slike/Globus.jpg">
	
	</a>
	
	<a href = "../index.html"> back to index</a>

</body>
</html>