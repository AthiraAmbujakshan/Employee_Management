<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%> 
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

<div id="wrapper">
<div id="header">
<center>
<h2>Employee Management System</h2>
</center>
</div>
</div>
<div id="container">
<div id="content">
<p align="right"><input type="button" value="Add New Employee"
		onclick="window.location.href = 'showFormForAdd'; return false;"
		class="add-button" />

<table>
<tr>
<th>EmployeeId</th>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>ContactNumber</th>
<th>Gender</th>
<th>Age</th>
<th>JobLocation</th>
<th>BusinessUnit</th>
<th>ProjectId</th>
<th>JobTitle</th>
<th>DateofJoining</th>
<th>Salary</th>
<td>Action</td>
</tr>

<c:forEach  var="tempEmployee" items="${employees}">
<c:url var="updateLink" value="/employee/showFormForUpdate">
				<c:param name="EmployeeId" value="${tempEmployee.id}"></c:param>
			</c:url>
<c:url var="deleteLink" value="/employee/delete">
				<c:param name="EmployeeId" value="${tempEmployee.id}"></c:param>
			</c:url>
		
<tr>
<td>${tempEmployee.id}</td>
<td>${tempEmployee.firstName}</td>
<td>${tempEmployee.lastName}</td>
<td>${tempEmployee.email}</td>
<td>${tempEmployee.contactNumber}</td>
<td>${tempEmployee.gender}</td>
<td>${tempEmployee.age}</td>
<td>${tempEmployee.jobLocation}</td>
<td>${tempEmployee.businessUnit}</td>
<td>${tempEmployee.projectId}</td>
<td>${tempEmployee.jobTitle}</td>
<td>${tempEmployee.dateOfJoining}</td>
<td>${tempEmployee.salary}</td>
<td><a href="${updateLink}">update</a></td>
<td><a href="${deleteLink}" onclick="if(!(confirm('Are you sure to delete'))) return false">Delete</a></td>
</tr>
</c:forEach> 
  </table>
</div>
</div>
</body>
</html>