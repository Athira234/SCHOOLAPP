
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>School Form</title>
</head>
<body>
	<center>
		Enter The Details
		<form:form method="POST" action="details" modelAttribute="school">

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

			<input type="submit" value="ADD" />
		</form:form>
	</center>
</body>
</html>