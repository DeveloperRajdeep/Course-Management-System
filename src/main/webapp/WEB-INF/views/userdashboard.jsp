<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Dashboard</title>

<style>
div {
    width: 1000px;
    height:30px;
    padding: 50px;
    margin: 40px;
}
a:link, a:visited {
    background-color:#00ccff;
    color: black;
    padding: 14px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
}
a:hover, a:active {
   background-color: #4CAF50;
    color: white;
}

 body { 
/*  		background-color: #ccccff; */
/*   		backgroung-image: url(resources/image/backg.jpg); */
}
</style>


</head>
<body background="resources/images/newww.jpg">
<div align="center">
<h2 style="color:#d9d9d9;"><u>Student Dashboard</u></h2>

<h3 style="color:#d9d9d9;" align="center"> Adding Information To Database</h3>

<a href="studentregisterPage" target="_blank">Create Account</a>
<a href="">Go For Payment</a>
<a href="">Login</a>
<!-- <a href="categoryPage">Add New Category</a> -->
<!-- <a href="cutoffpercentagePage">Add New Cut_off_Percentage</a><br><br> -->
<!-- <a href="seatdetailsPage">Add Seat Details</a> -->
<!-- <a href="seatdetailsPage">Add Seat Details</a> -->
<!-- <a href="seatdetailsPage">Add Seat Details</a> -->
</div>
<br>
<div align="center">
<h3 style="color:#d9d9d9;" align="center"> Viewing Information From Database</h3>
<a href="">View Account</a>
<a href="">View Payment</a>
<!-- <a href="viewBranchmaster">View Branches</a> -->
<!-- <a href="viewCategorymaster">View Category Types</a> -->
<!-- <a href="viewCutoffpercentage">View Cut_off_Percentage Data</a><br><br> -->
<!-- <a href="viewSeatdetails">View Seat Details</a> -->
</div>


</body>
</html>