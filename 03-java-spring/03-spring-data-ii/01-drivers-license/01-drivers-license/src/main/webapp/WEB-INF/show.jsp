<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DMV App</title>
</head>
<body>
<h1>${ person.firstName } ${ person.lastName }</h1>
	<hr>
	<p><strong>License Number</strong> ${ person.license.getNumberAsString() }</p>
	<p><strong>Expiration Date</strong> ${person.license.expirationDate } </p>
	<p><strong>State</strong> ${person.license.state } </p>
</body>
</html>