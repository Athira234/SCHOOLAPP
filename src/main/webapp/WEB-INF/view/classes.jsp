<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	counter-reset: Serial;
}

table {
	border-collapse: separate;
}

tr td:first-child:before {
	counter-increment: Serial;
	content: counter(Serial);
}
</style>
</head>
<body>
	<center>
		<U> CLASSES LIST </U><br>
		<br>
		<table border=1>
			<th>Sl.No</th>
			<th>Class Name</th>

			<c:forEach items="${classList}" var="sclass">
				<tr>
					<td></td>
					<td><c:out value="${sclass.className}" /></td>

				</tr>

			</c:forEach>
		</table>
		<br>
		<br>
		<%-- <a href="/myschoolapp/classes/addClassForm"> <input type="submit" value="ADD NEW CLASS" /></a><br><br>--%>
	</center>
</body>
</html>