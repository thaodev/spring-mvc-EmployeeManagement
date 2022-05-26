<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Employee Management Program</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Year Born</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempEmployee" items="${employees}">
				
					<tr>
						<td> ${tempEmployee.firstName} </td>
						<td> ${tempEmployee.lastName} </td>
						<td> ${tempEmployee.email} </td>
						<td> ${tempEmployee.yearBorn} </td>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
</body>
</html>