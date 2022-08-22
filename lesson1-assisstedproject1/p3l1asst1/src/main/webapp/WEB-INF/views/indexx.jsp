<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Manager</title>
</head>
<body>
<div align="center">
  <h2>User Manager</h2>
  <h3>Enter user id to be searched:</h3>
    <form method="get" action="search">
        <input type="text" name="keyword" /><br><br>
        <input type="submit" value="Search" />
    </form>
   <h3><a href="list">List All</a></h3>
</div>
</body>
</html>