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
		<h1>${ question.question }?</h1>
		<h3>Tags:</h3>
		<ul>
		<c:forEach items="${ question.tags }" var="tag">
			<li>${ tag.subject }</li>
		</c:forEach>
		</ul>
		<h3>Answers:</h3>
		<ul>
		<c:forEach items="${ question.answers }" var="answer">
			<li>${ answer.answer }</li>		
		</c:forEach>
		</ul>
		<hr />
		<h3>Add your answer:</h3>
		<form:form action="/answers" method="post" modelAttribute="ans">
			 <div class="form-group">
		        <form:label path="answer">Answer</form:label>
		        <form:errors path="answer"/>
		        <form:textarea class="form-control" path="answer"></form:textarea>
		    </div>
		    <form:hidden path="question" value="${ question.id }"/>
		    <button class="btn btn-primary">Answer it!</button>
		</form:form>
	</div>

</body>
</html>