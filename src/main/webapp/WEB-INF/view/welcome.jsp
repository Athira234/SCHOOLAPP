
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
<a href="classes">Classes</a><br>
<a href="students">Students</a><br>
<a href="exams">Exams</a><br>
<a href="subjects">Subjects</a><br>
</center><br><br>
<form action="students">
<center>
Students List
<select name="classId" size=1 multiple="multiple">
  <option value="1" >1
  <option value="2" >2
  <option value="3" >3
  <option value="4" >4
  <option value="5" >5
  </center>
</select>

 <%--
<input type="text" name="classId"><br>
<input type="text" name="classId"><br> --%>
<input type="submit">
</form>

</body>
</html>