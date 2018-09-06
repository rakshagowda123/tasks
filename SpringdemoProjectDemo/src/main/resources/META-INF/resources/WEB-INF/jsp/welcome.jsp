<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>

<html>
<head>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Welcome </title>
</head>
<body>
<div class="container text-center" id="tasksDiv">
				<h3>WELCOME <c:out value="${users.firstName}"/></h3>
				<h2>**Your Details**</h2>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>FirstName</th>
								<th>LastName</th>
								<th>Email</th>
								
								<th>Delete</th>
								<th>Edit</th>
							</tr>
						</thead>
						<tbody>
							
								<tr>
									<td><c:out value="${users.id}"/></td>
									<td><c:out value="${users.firstName}"/></td>
									<td><c:out value="${users.email}"/></td>
									<td><c:out value="${users.password}"/></td>
									
									<td><a href="/delete-user?id=${users.id }"><span
											class="glyphicon glyphicon-trash"></span></a></td>
									<td><a href="/edit-user?id=${usesr.id }"><span
											class="glyphicon glyphicon-pencil"></span></a></td>
								</tr>
							
						</tbody>
					</table>
					
					</div>
								<div class="dropdown">
                            <button class="dropbtn">S</button>
                      <div class="dropdown-content">
                     <a href="SendMail">project 1</a>
                       <a href="SendMail">project 2</a>
                        <a href="SendMail">project 3</a>
                       </div>
                        </div>
				</div>
			</div>
	

</body>
</html>