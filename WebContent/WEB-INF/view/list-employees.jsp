<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

</head>
<body>
<div class="container">
	<div class=" col-xs-1 text_center">
		<div id="header">
			<h2>Employee Management Program</h2>
		</div>
	</div>

	<table class="table">

		<!--  add our html table here -->

		<thead class="thead-dark">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Year Born</th>
			</tr>
		</thead>
			
		<tbody>

			<!-- loop over and print our customers -->
			<c:forEach var="tempEmployee" items="${employees}">

				<tr>
					<td>${tempEmployee.firstName}</td>
					<td>${tempEmployee.lastName}</td>
					<td>${tempEmployee.email}</td>
					<td>${tempEmployee.yearBorn}</td>
				</tr>

			</c:forEach>
		</tbody>
		
	</table>
	<!-- put new button: Add Employee  -->
	<input class=" btn btn-primary" type="button" value="Add Employee"
			onclick="windown.location.href='showFormForAdd'; return false;" />
</div>
</body>
</html>