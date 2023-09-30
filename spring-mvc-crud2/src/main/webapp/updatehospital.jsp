<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="updatehospital" modelAttribute="update">
 Id: <form:input path="id"/><br><br>
 Name: <form:input path="name"/><br><br>
Website: <form:input path="website"/><br><br>
<form:button>Update</form:button>
</form:form>

</body>
</html>