<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Create New Person</h1>
	<hr>
	<form:form method="POST" action="/new" ModelAttribute="person">
	<p>
		<form:label path="firstName">First Name</form:label>
		<form:errors path="firstName"/>
		<form:input path="firstName"/>
	</p>
	<p>
		<form:label path="lastName">Last Name</form:label>
		<form:errors path="lastName"/>
		<form:input path="lastName"/>
	</p>
	<button>Add New Person</button>
	</form:form>
</body>
</html>