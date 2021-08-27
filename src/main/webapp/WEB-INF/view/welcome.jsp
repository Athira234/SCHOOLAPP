<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<a href="schools">List All Schools</a><br>
<a href="schools/1">List One School</a><br>
<a href="schools/1/classes">List Classes of One School</a><br>
<a href="schools/1/students">List Students of One School</a><br>
<a href="schools/1/subjects">List Subjects of One School</a><br>
<a href="schools/1/exams">List Exams of One School</a><br>
<a href="classes">Add New Class</a><br>
<a href="students/addStudentForm"> Add Students</a><br>
<a href="students/1">Details of Student 1</a><br>
<a href="exams/addExamForm">Add new Exam</a><br>
<a href="subjects">Add new Subject</a><br>
</center><br><br>
<form action="students">
<center>
Students List
<br><br>
Select Class ID :
<select name="classId" size=1 multiple="multiple">
  <option value="1" >1
  <option value="2" >2
  <option value="3" >3
  <option value="4" >4
  <option value="5" >5
  </center>
</select>
<input type="submit">
</form>
<br><br>
<form action="exams">
Exam List<center>
<br>

Subject Name :
<select id="subjectId" name="subjectId">
<c:forEach items="${subjectList}" var="subject">
  <option value="${subject.subjectId}" >${subject.subjectName} 
  </option>
</c:forEach>
</select>
Class Name : <select id="classId" name="classId">
				<c:forEach items="${classList}" var="classes">
					<option value="${classes.classId}">${classes.className}</option>

				</c:forEach>
			</select> <input type="submit">
 </center>
 </form>
</body>
</html>