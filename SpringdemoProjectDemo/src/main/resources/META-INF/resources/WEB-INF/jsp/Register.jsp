<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<title>Registration page</title>
</head>
<h1>REGISTER</h1>
<body>
<div class="container text-center">
				<h3>New Registration</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-Employee">
					<input type="hidden" name="id" value="${user.id }" />
					<div class="form-group">
						<label class="control-label col-md-3">FIRSTNAME</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="firstname"
								value="${emp.firstname }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">LASTNAME Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="lastname"
								value="${emp.lastname }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">EMAIL</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="email"
								value="${emp.email}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Password </label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="password"
								value="${emp.password }" />
						</div>
						</div>
					
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Register" />
					</div>
				</form>
			</div>
			</body>
</html>