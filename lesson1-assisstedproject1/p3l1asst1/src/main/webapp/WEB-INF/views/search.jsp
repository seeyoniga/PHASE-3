<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search User </title>
</head>
<body>
<div align="left">
  <h2>Search User</h2>
    
    <table border="1" cellpadding="5">
    <tr>
            <th>ID</th>
            <th>Name</th>
            <th>E-mail</th>
            <th>Address</th>
            <th>Action</th>
            
            
        </tr>
         <c:forEach items="${result}" var="customer">
         <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
            <td>${customer.email}</td>
            <td>${customer.address}</td>
             <td>
                <a href="edit?id=${customer.id}">Edit</a>
            </td>
            
         </tr>
         </c:forEach>
    </table>
</div>
</body>
</html>