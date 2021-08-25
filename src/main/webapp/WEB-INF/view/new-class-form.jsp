<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>School Form</title>
</head>
<body><center>
Enter The Details
<form:form method="POST"  action="classdetails"  modelAttribute="schoolClass">
School ID:<form:input path="classSchoolId" />
<br>
<br>

Class Name :<form:input path="className" />
<br>
<br>
 Class Teacher Name :<form:input path="classTeacherName" />


<input type="submit" value="ADD"/>
</form:form>
</center>
</body>
</html>