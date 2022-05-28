<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="text-center">Employee Form</div>
		<form:form action="saveEmployee" modelAttribute="employee" method="POST">
			<div class="form-group">
				<label for="formGroupExampleInput">First Name</label> 
				<form:input path="firstName"
					type="text" class="form-control" id="formGroupExampleInput"
					placeholder="Enter your first name"/>
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Last Name</label> 
				<form:input path="lastName"
					type="text" class="form-control" id="formGroupExampleInput2"
					placeholder="Enter your last name"/>
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput">Email Address</label> 
				<form:input path="email"
					type="text" class="form-control" id="formGroupExampleInput"
					placeholder="Enter your email"/>
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Year Born</label> 
				<form:input path="yearBorn"
					type="text" class="form-control" id="formGroupExampleInput2"
					placeholder="Enter your year born"/>
			</div>
			<input class=" btn btn-secondary btn-lg center" type="submit" value="Save Employee"/>
			<!-- onclick="window.location.href='saveEmployee'; return false;"  -->
			
		</form:form>
		
		<p ><a href="${pageContext.request.contextPath}/employee/list">Back to List</a></p>
			
	</div>
	
</body>
</html>