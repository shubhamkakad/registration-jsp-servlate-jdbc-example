<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/register" method="post">  

<label> FirstName </label>         
<input type="text" name="firstname" size="15"/> <br> <br>  
<label> LastName: </label>         
<input type="text" name="lastname" size="15"/> <br> <br>  
<label> UserName </label>         
<input type="text" name="Username" size="15"/> <br> <br> 
<label>pass</label>         
<input type="text" name="pass" size="15"/> <br> <br> 
<label>City</label>     
<input type="text" name="City" size="15"/> <br> <br> 
<input type= "Submit" value="Submit"/>
</form>
</body>
</html>