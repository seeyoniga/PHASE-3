<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ECommerce Products </h1>

<table>
	<tr><th>ID</th><th>NAME</th><th>PRICE</th><th>DATE</th></tr>
	<c:forEach var="p" items="${list }">
	
		<tr>
			<td><c:out value="${p.id}"/></td>
			<td>${p.name}</td>
			<td>${p.price}</td>
			<td>${p.dateAdded}</td>
		
		</tr>
	
	</c:forEach>
	
	

</table>


</body>
</html>