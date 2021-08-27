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
		<br> SELECT EXAM
		<form:form method="POST" action="addexamdetails"
			modelAttribute="stexams">

			<br>
			<br>

Exam Name :
<select id="examId" name="examId">
				<c:forEach items="${exams}" var="exam">
					<option value="${exam.examId}">${exam.examName}</option>

				</c:forEach>
			</select>



			<input type="submit" value="ADD" />
		</form:form>
	</center>
</body>
</html>