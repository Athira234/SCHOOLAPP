<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>School Form</title>
</head>
<body><center>
Enter The Details
<form:form method="POST"  action="classdetails"  modelAttribute="schoolClass" >
<%-- School ID:<form:input path="classSchoolId" />--%>
<br>
<br>

School ID :
<select id="classSchoolId" name="classSchoolId">
<c:forEach items="${schools}" var="school">
  <option value="${school.schoolId}" >${school.schoolName} 
  </option>
  
  </c:forEach>
 </select>
<br><br>
Class Name :<form:input path="className" />
<br>
<br>
 Class Teacher Name :<form:input path="classTeacherName" />


<input type="submit" value="ADD"/>
</form:form>
</center>
</body>
</html>