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
		<form:form method="POST" action="subjectdetails"
			modelAttribute="subject">
			<br>
			<br>
Subject Name :<form:input path="subjectName" />
			<br>
			<br>
IS_ELECTIVE:<form:input path="isElective" />
			<br>
			<br>

			<input type="submit" value="ADD" />
		</form:form>
	</center>
</body>
</html>