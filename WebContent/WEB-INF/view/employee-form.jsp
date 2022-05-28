<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<form>
			<div class="form-group">
				<label for="formGroupExampleInput">First Name</label> <input
					type="text" class="form-control" id="formGroupExampleInput"
					placeholder="Enter your first name">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Last Name</label> <input
					type="text" class="form-control" id="formGroupExampleInput2"
					placeholder="Enter your last name">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput">Email Address</label> <input
					type="text" class="form-control" id="formGroupExampleInput"
					placeholder="Enter your email">
			</div>
			<div class="form-group">
				<label for="formGroupExampleInput2">Year Born</label> <input
					type="text" class="form-control" id="formGroupExampleInput2"
					placeholder="Enter your year born">
			</div>
		</form>
		<input class=" btn btn-primary text-center" type="button" value="Add Employee To Database"
			onclick="window.location.href='employeeRegisterSuccess'; return false;" />
	</div>
	
</body>
</html>