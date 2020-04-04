<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
<style>
.leftdiv{
  background-color:white}
.box{
    margin-top:100px;
    margin-left:100px;
    
    margin-bottom:400px;
    width:40%;
        padding:10px;
    }

</style>

</head>
<body bgcolor="grey">
<div class="leftdiv"> 
 <p align="left"><font size="14"><b>Welcome to Employee Management System
 </b></font></p>
</div>
<div class="box">

         <form action ="submitadmin" modelAttribute="admin"
		     method="POST">
<table>
			<tbody>
			<tr>
	<td><label>Enter UserName:
	<input type="text" name="userName">
	</label></td>
	
					</tr>
					<br>


<tr>
<td><label>Password:
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="password" name="password">
 </label></td>
					</tr>
					<br>
		<tr>
		
<td><input type="submit" value="Submit" class="submit"></td>
		</tr>
</tbody>
</table>
</form>
</div>
</body>
</html>