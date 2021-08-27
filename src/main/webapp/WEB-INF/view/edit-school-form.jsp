<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EDIT SCHOOL DETAILS</title>
</head>
<body>
	<form:form method="POST" action="editdetails" modelAttribute="school">
School Id :<form:hidden path="SchoolId" />
		<br>
		<br>
School Name :<form:input path="SchoolName" />
		<br>
		<br>
 Address :<form:input path="SchoolAddress" />
		<br>
		<br>
 Phone :<form:input path="SchoolPhone" />
		<br>
		<br>
 Email :<form:input path="SchoolEmail" />

		<input type="submit" value="UPDATE" />
	</form:form>
</body>
</html>