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
		<form:form method="POST" action="studentdetails"
			modelAttribute="student">
Class ID:<form:input path="studentClassId" />
			<br>
			<br>
Student Name :<form:input path="studentName" />
			<br>
			<br>
 Roll Number :<form:input path="rollNumber" />
			<br>
			<br>
 Email :<form:input path="studentEmail" />
			<br>
			<br>
 Address :<form:input path="studentAddress" />
			<br>
			<br>
Phone :<form:input path="studentPhone" />

			<input type="submit" value="ADD" />
		</form:form>
	</center>
</body>
</html>