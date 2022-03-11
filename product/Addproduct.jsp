<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product details</title>
</head>
<body>

<div align="center">
		<h2>Insert Product</h2>
		<form action="insert" method="post">
		Product ID: <input type="text" name="productId"><br/>
		Product Name: <input type="text" name="productName"><br/>
		Category: <input type="text" name="productCategory"><br/>
		price: <input type="number" name="price"><br/>
			<input type="submit" value="Submit">
		<%
			session.invalidate();
		%>
		</form>
	</div>
</body>
</html>
