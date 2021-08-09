<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Overflow App</title>
</head>
<body>
	<div class="container">
		<h1>What is your question</h1>
		<form:form action="/" method="post" modelAttribute="newQuest">
			 <div class="form-group">
		        <form:label path="question">Question</form:label>
		        <form:errors path="question"/>
		        <form:textarea class="form-control" path="question"></form:textarea>
		    </div>
		    <div class="form-group">
		        <form:label path="tags">Tags</form:label>
		        <form:errors path="tags"/>
		        <form:input class="form-control" path="tags"/>
		    </div>
		    <button>Submit</button>
		</form:form>
	</div>
</body>
</html>