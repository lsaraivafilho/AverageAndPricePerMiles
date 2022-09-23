<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Average Miles And Gallons</title>
</head>
<body>
<form action="getAverageServlet" method="post">
<br />
Miles:
<input type="text" name="userMiles" size="10"><br />
Gallons:
<input type="text" name="userGallons" size="10">
<input type="submit" value="Calculate Average" />
</form>
</body>
</html>

