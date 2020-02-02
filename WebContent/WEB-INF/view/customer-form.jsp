<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is simple add customer form...</title>
<link type="text/css" type="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
<link type="text/css" type="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM- Customer Relationship Form</h2>
		</div>
	</div>
	<div id="container">
		<h3>Save</h3>
		<form:form action="addCustomer" modelAttribute="customer"
			method="POST">

			<form:hidden path="id" />
			<table>
				<tbody>
					<tr>
						<td><label>First Name</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr>
						<td><label>Last Name</label></td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr>
						<td><label>Email</label></td>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</div>

	<div style=""></div>
	<p>
		<a href="${pageContext.request.contextPath}/customer/list">Customers
			List</a>
	</p>

</body>
</html>