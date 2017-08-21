<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title></title>
<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>


<c:url var="addAction" value="/addTest"></c:url>

<form:form role="form" action="${addAction}" modelAttribute="test" commandName="test">

<form:input path="id"/>

<form:input path="message"/><br>
<input type="submit" value="Submit">
<br>
</form:form>
<br>

<br>
<h3>Persons List</h3>
 <c:if test="${!empty listTest}"> 
	<table class="tg">
	<tr>
		<th width="80">Person ID</th>
		<th width="120">Person Name</th>
		<th width="60">Edit</th>
	</tr>
	<c:forEach items="${listTest}" var="test"> 
		<tr>
			<td>${test.id}</td>
			<td>${test.message}</td>
			<td><a href="<c:url value='/test/${test.id}' />" >Edit</a></td>
		</tr>
 	</c:forEach> 
	</table>
 </c:if> 
</body>
</html>