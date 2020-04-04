<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
<style>
.leftdiv{
  background-color:white}
 .box{
    margin-top:50px;
    margin-left:400px;
    margin-right:400px;
    margin-bottom:150px;
    width:40%;
        padding:10px;
    }
</style>
</head>
<body bgcolor="grey">
<br><br>
<div class="leftdiv">
<p align="center"><font size="14"><b> update Employee Details!</b></font></p>
</div>
<p>
	<a href="${pageContext.request.contextPath}/employee/list">Back to
			List</a>
	</p>
<div class="box">
	<form:form action="saveEmployee" modelAttribute="employee"
		method="POST">
		<form:hidden path="id"/>
		<table>
			<tbody>
			<tr>
					<td><label>EmployeeId:</label></td>
				<td> &nbsp;&nbsp;&nbsp;&nbsp;<form:input path="id" /></td>
					</tr>
				<tr>
					<td><label>FirstName:</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;<form:input path="firstName" /></td>
				</tr>
				<tr>
					<td><label>LastName:</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;<form:input path="lastName" /></td>
				</tr>
				<tr>
					<td><label>Email:</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;<form:input path="email" /></td>
				</tr>
				<tr>
					<td><label>ContactNumber:</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;<form:input path="contactNumber" /></td>
				</tr>
		<tr>
<td><label>Gender:</label></td>
         <td> &nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="gender"value="male">Male
             &nbsp; &nbsp;  <input type="radio" name="gender"value="female">female
                  </td>
	
	         				</tr>
	         				
	<tr>
					<td><label>Age:</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;<form:input path="age" /></td>
				</tr> 
		<tr>
					<td><label>JobLocation:</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;<form:input path="jobLocation" /></td>
				</tr>
			<tr>
					<td><label>BusinessUnit:</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;<form:input path="businessUnit" /></td>
				</tr>	
				
				
				
		<tr>
					<td><label>Projectid:</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;<form:input path="projectId" /></td>
				</tr> 
				<tr>
					<td><label>JobTitle:</label></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;<form:input path="jobTitle" /></td>
				</tr> <br>
				<tr>
					<td><label for="Date">dateOfJoining:</label></td>
	<td>&nbsp;&nbsp;&nbsp;&nbsp;<input type="date" name="dateOfJoining"></td>
					
				</tr> 
				<tr>
					<td><label>Salary</label></td>
	<td>&nbsp;&nbsp;&nbsp;&nbsp;<form:input path="salary" /></td>
					
				</tr>			   		        						
				
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Save" class="save"></td>
				</tr>
			</tbody>
		</table>
	</form:form>
	</div>
	
</body>
</html>