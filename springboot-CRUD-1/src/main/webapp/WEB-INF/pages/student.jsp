<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<html>
<head>
<meta charset="UTF-8">
<title>Fetch All Student Data</title>
</head>
<body>
<h3> Student Data Page</h3>
<table border="1">
	<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Gender</th>
	<th>Cource</th>
	<th>DOB</th>
	<th>Address</th>
	<th>Languages</th>
	</tr>
	<c:forEach items="${list}" var="ob">
		<tr>
			<td>${ob.stdId} </td>
			<td>${ob.stdName} </td>
			<td>${ob.stdGen} </td>
			<td>${ob.stdCourse} </td>
			<td>${ob.stdAddr} </td>
			<td>${ob.stdLang} </td>
			<td>
				<a href="delete?id=${ob.stdId}">DELETE</a> |
				<a href="edit?id=${ob.stdId}">EDIT</a>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>