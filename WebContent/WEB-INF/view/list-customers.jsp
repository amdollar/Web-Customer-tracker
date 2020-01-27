<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers - List</title>
</head>
<body>


	<div id="wrapper">
		<div id="header">
			<h2>CRM- Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>First name</th>
					<th>Last name</th>
					<th>Email</th>
				</tr>
				<c:forEach var="temp" items="${customers}">
					<tr>
						<td>${temp.firstName}</td>
						<td>${temp.lastName}</td>
						<td>${temp.email}</td>
					</tr>

				</c:forEach>
			</table>

		</div>
	</div>

</body>
</html>