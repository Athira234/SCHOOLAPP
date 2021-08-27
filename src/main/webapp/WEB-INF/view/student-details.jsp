<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<br>
		<br>
		<br>
		<U> STUDENT DETAILS</U><br>
		<br> Name : ${student.studentName}<br>
		<br> RollNumber : ${student.rollNumber}<br>
		<br> Address : ${student.studentAddress}<br>
		<br> Phone : ${student.studentPhone}<br>
		<br> Email : ${student.studentEmail}<br>
		<br> <a href="${student.studentId}/subjects"><input
			type="submit" value="ADD SUBJECT" /><br>
		<br> <a href="${student.studentId}/exams"><input
				type="submit" value="ADD EXAM" /><br>
			<br>
	</center>
</body>
</html>