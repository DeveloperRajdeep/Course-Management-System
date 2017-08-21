<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Payment</title>
</head>
<body>
<center>
<h3>Pay Registration Fees</h3>
<c:url var="addAction" value="addpayment"></c:url>
<form:form role="form" action="${addAction}" modelAttribute="PaymentInfo" commandName="PaymentInfo">

<c:if test="${!empty studentRegistration}">

	<label>Enrollment id: ${studentRegistration.enrollment_id}</label>
	</br>
	<label>Student Name: ${fullname}</label>
	
	</br>
	<label>Course Name: ${coursename}</label>
	
	</br>
	<label>Fee Amount: ${feesmaster.fee_amount}</label>


</c:if>
<br>
Name on card:<form:input path="card_name" required="required"/><br><br>
Card Number:<form:input path="card_number" required="required"/><br><br>
Status:<form:input path="status" required="required"/><br><br>
 <c:set var="now" value="<%=new java.util.Date()%>"/>
        <fmt:formatDate pattern="dd/MM/yyyy hh:mm:ss" value="${now}" var="fmdtt"/>
Date_time: <form:input path="date_time" value="${fmdtt}"  class="form-control"  readonly="true"/><br><br>
<input type="submit" value="Submit"><br><br>


</form:form>
</center>
</body>
</html>



