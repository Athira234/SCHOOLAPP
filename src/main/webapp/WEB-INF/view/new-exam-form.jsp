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
		<form:form method="POST" action="examsdetails" modelAttribute="exam">
Class ID:<form:input path="classId" />
			<br>
			<br>
Subject ID :<form:input path="subjectId" />
			<br>
			<br>

Exam Name :<form:input path="examName" />
			<br>
			<br>
Exam Time :<form:input path="examTime" />
			<br>
			<br>
 Exam Date:<form:input path="examDate" />
			<br>
			<br>


			<input type="submit" value="ADD" />
		</form:form>
	</center>
</body>
</html>