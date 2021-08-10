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
	<center><U>
	CLASSES LIST </U><br><br>
		<table border=1>
			<th>Sl.No</th>
			<th>Class Name</th>

			<c:forEach items="${classList}" var="sclass">
				<tr>
					<td><c:out value="${sclass.classId}" /></td>
					<td><c:out value="${sclass.className}" /></td>

				</tr>

			</c:forEach>
		</table>
	</center>
</body>
</html>