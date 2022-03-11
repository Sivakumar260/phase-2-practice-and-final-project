<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form action="create" method="post">
        <p>Name</p> 
        <input type="text" name="name"/>
        <br/>
        <p>City</p> 
        <input type="text" name="city"/>
        <br/><br/>
        <p>Value</p> 
        <input type="number" name="value"/>
        <br/>
        <input type="submit" value="Create"/>
    </form>
  <br>
<a href="fetch">Fetch the List</a>
</body>
</html>