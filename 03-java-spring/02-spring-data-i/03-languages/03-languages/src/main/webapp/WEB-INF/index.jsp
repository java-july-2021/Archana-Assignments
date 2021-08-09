<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Language</title>
</head>
<body>
<h1>Welcome to Languages</h1>
<table border=1>
<hr>
<thead>
<tr>
<td>Name:</td>
<td>Creator</td>
<td>Version</td>
<td>Action</td>
</tr>
</thead>
<tbody>

<c:forEach items="${ allLanguages}" var="Long">
<tr>
<td> ${lang.name}</td>
<td> ${lang.creator}</td>
<td> ${lang.currentVersion}</td>
<td><a href="/edit/${lang.id}"> Edit</a> |<a href="/delete/${lang.id }">Delete</a></td>
</tr>






</c:forEach>
<form:form action="/" method="POST" modelAttribute="language">
<p>
<form:label path="name" > Name: </form:label>
<form:errors path="name"/>
<form:input path="name"/>

</p>

<p>
<form:label path="creator" > Creator: </form:label>
<form:errors path="creator"/>
<form:input path="creator"/>

</p>

<p>
<form:label path="currentVersion" > CurrentVersion: </form:label>
<form:errors path="currentVersion"/>
<form:input path="currentVersion"/>

</p>

<button>Submit All Language</button>
</form:form>

</tbody>
</table>
<h1></h1>
</body>
</html>