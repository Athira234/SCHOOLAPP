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
		<U> SCHOOL DETAILS</U><br>
		<br> School Name : ${school.schoolName}<br>
		<br> Address : ${school.schoolAddress}<br>
		<br> Phone : ${school.schoolPhone}<br>
		<br> <a href="${school.schoolId}/classes"> <input
			type="submit" value="Classes" />&nbsp;&nbsp;&nbsp;&nbsp; <a
			href="${school.schoolId}/students"> <input type="submit"
				value="Students" />&nbsp;&nbsp;&nbsp;&nbsp; <a
				href="${school.schoolId}/subjects"> <input type="submit"
					value="Subjects" />&nbsp;&nbsp;&nbsp;&nbsp; <a
					href="${school.schoolId}/exams"> <input type="submit"
						value="Exams" />&nbsp;&nbsp;&nbsp;&nbsp; 
	</center>
</body>
</html>