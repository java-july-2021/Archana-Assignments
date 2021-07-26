<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>date display</title>
<script src="js/alert.js"></script>
</head>
<body>
<script>dateAlert()</script>

	<h1> The time is: <c:out value="${date}"/></h1>

</body>
</html>