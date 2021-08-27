<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>School Form</title>
</head>
<body>
	<center>
		<br> SELECT SUBJECT
		<form:form method="POST" action="addsubjectdetails"
			modelAttribute="stsubjects">

			<br>
			<br>
			<%-- Student ID:<form:input path="studentId"/>--%>
Subject Name :
<select id="subjectId" name="subjectId">
				<c:forEach items="${subjects}" var="subject">
					<option value="${subject.subjectId}">${subject.subjectName}
					</option>

				</c:forEach>
			</select>
			<%-- Attendance Percentage:<form:input path="attendancePercentage"/>
Number of Assignments :<form:input path="numberOfAssignments"/>--%>


			<input type="submit" value="ADD" />
		</form:form>
	</center>
</body>
</html>