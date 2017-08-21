<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<html>

<!-- Head -->
<head>

<title>Login Form</title>

<!-- Meta-Tags -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="keywords" content="Natural Signin Form Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //Meta-Tags -->

<!-- Style --> <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/login_css/css/style.css" type="text/css" media="all">

<!-- Fonts -->
<link href="//fonts.googleapis.com/css?family=Quicksand:300,400,500,700" rel="stylesheet">
<!-- //Fonts -->

</head>
<!-- //Head -->

<!-- Body -->
<body>
<div class="banner">
<div class="agileinfo-dot">
	<h1>Student Login Page</h1>

	<div class="w3layoutscontaineragileits">
	<h2>Sign In</h2>
	<c:url var="addAction" value="login_auth"></c:url>
		<form:form action="${addAction}" method="POST">
			<input type="text" Name="username" placeholder="Enrollment Id" required="required">
			<input type="password" Name="password" placeholder="Password" required="required">
			<ul class="agileinfotickwthree">
				<li>
					<input type="checkbox" id="brand1" value="">
					<label for="brand1"><span></span>Remember me</label>
					<a href="#">Forgot password?</a>
				</li>
			</ul>
			<div class="aitssendbuttonw3ls">
				<input type="submit" value="SIGNIN">
				<div class="clear"></div>
			</div>
		</form:form>
	</div>
	
	
	<div class="w3footeragile">
<!-- 		<p> &copy; 2017 Natural Signin Form. All Rights Reserved | Design by <a href="http://w3layouts.com" target="_blank">W3layouts</a></p> -->
	</div>

</div>
</div>
	
	
	

</body>
<!-- //Body -->

</html>