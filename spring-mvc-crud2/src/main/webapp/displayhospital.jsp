<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
th {
	background-color: green;
}
</style>
</head>
<body>
	<table border="2px" style="border-collapse: collapse;">



		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Website</th>
			<th>Edit</th>
			<th>Delete</th>

		</tr>
		<c:forEach var="hosp" items="${list }">
			<tr>
				<td>${hosp.getId() }</td>
				<td>${hosp.getName() }</td>
				<td>${hosp.getWebsite() }</td>
				<td><a href="edithospital?id=${hosp.getId() }">edit</a></td>
				<td><a href="deletehospital?id=${hosp.getId() }">delete</a></td>




			</tr>

		</c:forEach>
  

	</table>

</body>
</html>