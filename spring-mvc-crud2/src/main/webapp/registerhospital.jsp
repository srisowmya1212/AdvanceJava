<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register hospital</title>
</head>
<body>
<form:form action="savehospital" modelAttribute="hospital">
 Id: <form:input path="id"/><br><br>
 Name: <form:input path="name"/><br><br>
Website: <form:input path="website"/><br><br>
<form:button>Register</form:button>
</form:form>


</body>
</html>