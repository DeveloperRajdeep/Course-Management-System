<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Student Registration</title>
<style type="text/css">
#apDiv1 {
	position: absolute;
	width: 1362px;
	height: 628px;
	z-index: 1;
	left: 3px;
	top: 2px;

}
#apDiv2 {
	position: absolute;
	width: 367px;
	height: 530px;
	z-index: 1;
	left: 500px;
	top: 78px;
	font-size: 18px;
	font-weight: bold;
	color: #777;
	color: #FF4747;
	border: 1px #000;
	border: 1px solid #F1F1F1;
	-moz-border-radius: 5px;
	border-radius: 15px;
	-moz-box-shadow: 10px 10px 24px #000000;
	-webkit-box-shadow: 10px 10px 24px #000000;
	box-shadow: 10px 10px 24px #000000;
	background-color: #FFF;
}

#apDiv4 {
	position: absolute;
	width: 341px;
	height: 525px;
	z-index: 2;
	left: 13px;
	top: 2px;
}
.txtGen{
	border: 1px solid #B9C4CF;
	background: #FFFFFF;
	margin: 5px 30px 0px 30px;
	border-radius:5px;
	padding: 9px;
	display:block;
	font-size:13px;
	width:75%;
	background: 
		-webkit-gradient(
			linear,
			left top,
			left 25,
			from(#FFFFFF),
			color-stop(4%, #fff),
			to(#FFFFFF)
		);
	background: 
		-moz-linear-gradient(
			top,
			#FFFFFF,
			#fff 1px,
			#fff 25px
			);
	-moz-box-shadow: 0px 0px 3px #fff;
	-webkit-box-shadow: 0px 0px 3px #fff;
	box-shadow: 0px 2px 1px rgba(0, 0, 0, 0.1), 0px 2px 3px rgba(104, 122, 144, 0.25) inset;

}
.txtGen:focus{
	background:#fff;
	 -webkit-box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 5px rgba(0,0,0,0.4);
    -moz-box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 5px rgba(0,0,0,0.4);
    box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 5px rgba(0,0,0,0.4);
	text-shadow:0px 1px 1px rgba(0,0,0,0.2);
}
.txtGen1{
	border: 1px solid #B9C4CF;
	background: #FFFFFF;
	margin: 5px 30px 0px 30px;
	border-radius:5px;
	padding: 9px;
	display:block;
	font-size:13px;
	width:82%;
	background: 
		-webkit-gradient(
			linear,
			left top,
			left 25,
			from(#FFFFFF),
			color-stop(4%, #fff),
			to(#FFFFFF)
		);
	background: 
		-moz-linear-gradient(
			top,
			#FFFFFF,
			#fff 1px,
			#fff 25px
			);
	-moz-box-shadow: 0px 0px 3px #fff;
	-webkit-box-shadow: 0px 0px 3px #fff;
	box-shadow: 0px 2px 1px rgba(0, 0, 0, 0.1), 0px 2px 3px rgba(104, 122, 144, 0.25) inset;

}
.txtGen1:focus{
	background:#fff;
	 -webkit-box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 5px rgba(0,0,0,0.4);
    -moz-box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 5px rgba(0,0,0,0.4);
    box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 5px rgba(0,0,0,0.4);
	text-shadow:0px 1px 1px rgba(0,0,0,0.2);
}
.styled-button-1 {
	-webkit-box-shadow:rgba(0,0,0,0.2) 0 1px 0 0;
	-moz-box-shadow:rgba(0,0,0,0.2) 0 1px 0 0;
	box-shadow:rgba(0,0,0,0.2) 0 1px 0 0;
	color:#ffffff;
	background-color: #136EAC;
	border-radius:5px;
	-moz-border-radius:5px;
	-webkit-border-radius:5px;
	border:none;
	font-family:'Helvetica Neue',Arial,sans-serif;
	font-size:16px;
	font-weight:700;
	height:32px;
	width:335px;
	padding:4px 16px;
}

.styled-button-1:hover{
     height:32px;
	 cursor:pointer;
    -webkit-box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 5px rgba(0,0,0,0.4);
    -moz-box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 5px rgba(0,0,0,0.4);
    box-shadow:0px 1px 1px rgba(255,255,255,0.8) inset, 1px 1px 5px rgba(0,0,0,0.4);
	
    color:#fff;}
	.styled-buttn-1:active{
    position:relative;
    top:1px;
    background:#fec354;
    background:-webkit-gradient(linear,left top,left bottom,color-stop(#fec354,0),color-stop(#fecd61,1));
    background:-webkit-linear-gradient(top, #fec354 0%, #fecd61 100%);
    background:-moz-linear-gradient(top, #fec354 0%, #fecd61 100%);
    background:-o-linear-gradient(top, #fec354 0%, #fecd61 100%);
    background:linear-gradient(top, #fec354 0%, #fecd61 100%);
    filter:progid:DXImageTransform.Microsoft.gradient( startColorstr='#fec354', endColorstr='#fecd61',GradientType=0 );
    border-color:#d29a3a #cc9436 #c89133;
    text-shadow:0 1px 0 #fee1a0;
    -webkit-box-shadow:0 1px 1px #d4d4d4, inset 0 1px 0 #fed17e;
    -moz-box-shadow:0 1px 1px #d4d4d4, inset 0 1px 0 #fed17e;
    box-shadow:0 1px 1px #d4d4d4, inset 0 1px 0 #fed17e;
}
#apDiv3 {
	position: absolute;
	width: 373px;
	height: 48px;
	z-index: 2;
	left: 498px;
	top: 28px;
	text-align: center;
	font-family: Aparajita;
	font-size: 35px;
	font-weight: normal;
	background-color: #000066;
	border-radius: 4px;
	color: #E6E6E6;
}

#apDiv5 {
	position: absolute;
	width: 165px;
	height: 17px;
	z-index: 2;
	left: 10px;
	top: 502px;
	font-size: 14px;
}
#apDiv6 {
	position: absolute;
	width: 162px;
	height: 17px;
	z-index: 2;
	left: 180px;
	top: 503px;
	font-size: 14px;
}
#apDiv7 {
	position: absolute;
	width: 1045px;
	height: 140px;
	z-index: 3;
	left: 166px;
	top: 1px;
}
#apDiv8 {
	position: absolute;
	width: 321px;
	height: 315px;
	z-index: 3;
	left: 30px;
	top: 78px;
}
</style>

</head>

<body background="resources/images/road.jpg">

<div id="apDiv1">
  <div id="apDiv2">
   
    <div id="apDiv4">
    <c:url var="addAction" value="/addnewstudent"></c:url>
	<form:form role="form" action="${addAction}" modelAttribute="studentregistration" commandName="studentregistration">
      <table width="330" height="524">
        <tr>
          <td height="54"><label for="textfield"></label>
            <form:input path="s_first_name" required='required' placeholder="First Name"  class="txtGen"   /></td>
        </tr>
        <tr>
          <td height="54"><label for="textfield"></label>
            <form:input path="s_middle_name"  placeholder="Middle Name"  class="txtGen"  /></td>
        </tr>
         <tr>
          <td height="54"><label for="textfield"></label>
            <form:input path="s_last_name" required='required' placeholder="Last Name" class="txtGen"/></td>
        </tr>
        <tr>
          <td>
            <form:select path="degree_id" class="txtGen">
			<form:option value="0">GIMT Offers Degree</form:option>
			<c:if test="${!empty listdegree}">
			<c:forEach items="${listdegree}" var="DegreeMaster">
			<form:option value="${DegreeMaster.degree_id}">${DegreeMaster.degree_name}</form:option>
			</c:forEach>
			</c:if>
			</form:select></td>
        </tr>
        <tr>
          <td><form:select path="course_id" class="txtGen">
		<form:option value="0">GIMT Offers Courses</form:option>
		<c:if test="${!empty listcourse}">
		<c:forEach items="${listcourse}" var="CourseMaster">
		<form:option value="${CourseMaster.course_id}">${CourseMaster.course_name}</form:option>
		</c:forEach>
		</c:if>
		</form:select></td>
        </tr>
        <tr>
          <td> <form:input path="contact_number" required='required' placeholder="Enter Your Contact Number" class="txtGen"/></td>
        </tr>
        <tr>
          <td><form:input path="email_id" required='required' placeholder="Email Id:abc@gmail.com" class="txtGen"/></td>
        </tr>
        <tr>
          <td><form:password path="password" required='required' placeholder="Enter Your Password" class="txtGen"/></td>
        </tr>
        <c:set var="now" value="<%=new java.util.Date()%>"/>
        <fmt:formatDate pattern="yyyy/MM/dd HH:mm:ss" value="${now}" var="fmdtt"/>
        <form:hidden path="date_time" value="${fmdtt}"/>
         <form:hidden path="status" value="Y"/>
         <form:hidden path="payment_status" value="0"/>
        <tr>
          <td height="33"><input type="submit" class="styled-button-1" value="Register" /></td>
        </tr>
        <tr>
          <td height="22"><div id="apDiv5"><a style="text-decoration:none;" href="login.html" target="_blank">I already have an account</a></div>
          <div id="apDiv6"></div></td>
        </tr>
      </table>
      </form:form>
    </div>
  </div>
<!--   <div id="apDiv8"><img src="resources/images/GIMT_Tezpur_Logo.jpg" alt="" width="318" height="311" /></div> -->
  <div id="apDiv3">Student Registration Form</div>
</div>
</body>
</html>