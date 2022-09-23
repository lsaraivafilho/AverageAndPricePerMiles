<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cost per Mile</title>
</head>
<body>
<form action="getPriceServlet" method="post">
<br />
Miles:
<input type="text" name="userMiles" size="10"><br />
Cost:
<input type="text" name="userCost" size="10">
<input type="submit" value="Calculate Price" />
</form>
</body>
</html>

