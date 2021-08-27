<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<U>SCHOOL LIST</U> <br> <br> <a href="schools/add"> <input
			type="submit" value="ADD NEW SCHOOL" /></a><br> <br>
		<table border=1>
			<th>Sl.No</th>
			<th>School Name</th>
			<th>School Address</th>
			<th>Edit</th>
			<th>Delete</th>

			<c:forEach items="${schoolList}" var="school">
				<tr>
					<td><c:out value="${school.schoolId}" /></td>
					<td><a href="schools/${school.schoolId}"><c:out
								value="${school.schoolName}" /></td>
					<td><c:out value="${school.schoolAddress}" /></td>
					<td><a href="schools/edit/${school.schoolId}"> Edit </a></td>
					<td><a href="schools/delete/${school.schoolId}"> Delete </a></td>
				</tr>

			</c:forEach>
		</table>
	</center>
</body>
</html>