<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Student DashBoard</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- daterange picker -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/plugins/daterangepicker/daterangepicker.css">
  <!-- bootstrap datepicker -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/plugins/datepicker/datepicker3.css">
  <!-- iCheck for checkboxes and radio inputs -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/plugins/iCheck/all.css">
  <!-- Bootstrap Color Picker -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/colorpicker/bootstrap-colorpicker.min.css">
  <!-- Bootstrap time Picker -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/plugins/timepicker/bootstrap-timepicker.min.css">
  <!-- Select2 -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/plugins/select2/select2.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/dist/css/skins/_all-skins.min.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body class="hold-transition skin-purple sidebar-mini">
<div class="wrapper">

  
 <jsp:include page="commonFiles/header.jsp"></jsp:include>
 
  <!-- Left side column. contains the logo and sidebar -->
 
 <jsp:include page="commonFiles/sidebar.jsp"></jsp:include>
 
  
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">

    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Student Registration Form
       
        <small>Enrollment Id: ${enrollment_id}</small>
        
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li><a href="#">####</a></li>
        <li class="active">#####</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">

      <!-- PERSONAL INFORMATION OF THE STUDENT PART STARTS HERE-->
      <div class="box box-success">
        <div class="box-header with-border">
		<button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
          <h3 class="box-title">Personal Information</h3>


         <!-- <div class="box-tools pull-right">
           <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
          </div> -->
        </div>
        <!-- /.box-header -->
         <c:url var="addAction" value="addstudentpinformation"></c:url>
		<form:form role="form" action="${addAction}" modelAttribute="studentpinfo" commandName="studentpinfo">
		 
        <div class="box-body">
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <div class="form-group">
<%--                <c:if test="${!empty studentRegistration}"> --%>
                  <label for="exampleInputEmail1">Full Name :</label>
                   
                  <div class="row">
					<div class="col-xs-4">
                   <form:input path="student_fname" class="form-control" value="${studentpinfo.student_fname}" readonly="true"/>
					</div>
                <div class="col-xs-4">
                  <form:input path="student_mname" class="form-control" value="${studentpinfo.student_mname}" readonly="true" />
                </div>
                <div class="col-xs-4">
                  <form:input path="student_lname" class="form-control" value="${studentpinfo.student_lname}" readonly="true" />
                </div>
<%--                 </c:if> --%>
              </div>

            </div>
				<div class="form-group">
                   <label>Date of Birth:</label>
					<c:if test="${!empty studentpinfo.dob}">
                <div class="input-group date">
                  <div class="input-group-addon">
                    <i class="fa fa-calendar"></i>
                  </div>
                  <form:input path="dob" class="form-control pull-right" id="datepicker" data-date-format="dd/mm/yyyy" disabled="true"/>
                </c:if>
                <c:if test="${empty studentpinfo.dob}">
                <div class="input-group date">
                  <div class="input-group-addon">
                    <i class="fa fa-calendar"></i>
                  </div>
                  <form:input path="dob" class="form-control pull-right" id="datepicker" data-date-format="dd/mm/yyyy"/>
                </c:if>
                </div>

                </div>
				<div class="form-group">
<%-- 				 <c:if test="${!empty studentRegistration}"> --%>
                   <label>Email Id:</label>
                <div class="input-group">
                <span class="input-group-addon"><i class="fa fa-envelope"></i></span>
                <form:input path="email_id" class="form-control" value="${studentpinfo.email_id}" readonly="true"/>
				</div>
                </div>
<%--                 </c:if> --%>
              </div>
              <!-- /.form-group -->

              <div class="form-group">
<%--               <c:if test="${!empty studentRegistration}"> --%>
                <label>Mobile Number:</label>
				
                <div class="input-group">
                  <div class="input-group-addon">
                    <i class="fa fa-phone"></i>
                  </div>
                  
                  <form:input path="mobile_number"  class="form-control" value="${studentpinfo.mobile_number}" readonly="true"/>
                  
                </div>
<%-- 				</c:if> --%>
              </div>
			   <div class="form-group">
					<label>Gender:</label>
					 <c:if test="${!empty studentpinfo.gender}">
						<div class="form-group">
							<label>
							<form:radiobutton path="gender" name="Male" class="flat-red" checked="true" value="Male" disabled="true"/>
							Male
							</label>
							&nbsp;
							<label>
							<form:radiobutton path="gender" name="Female" class="flat-red" value="Female" disabled="true"/>
							Female
							</label>
							&nbsp;
							<label>
							<form:radiobutton path="gender" name="Transgender" class="flat-red" value="Other" disabled="true"/>
							other
					</label>
					</c:if>
					<c:if test="${empty studentpinfo.gender}">
						<div class="form-group">
							<label>
							<form:radiobutton path="gender" name="Male" class="flat-red" checked="true" value="Male"/>
							Male
							</label>
							&nbsp;
							<label>
							<form:radiobutton path="gender" name="Female" class="flat-red" value="Female"/>
							Female
							</label>
							&nbsp;
							<label>
							<form:radiobutton path="gender" name="Transgender" class="flat-red" value="Other"/>
							other
					</label>
					</c:if>
				</div>
			  </div>

              <!-- /.form-group -->
            </div>
            <!-- /.col -->
            <div class="col-md-6">
              <div class="form-group">
                 <div class="form-group">
                <label>Religion :</label>
                <c:if test="${!empty studentpinfo.religion}">
                <form:select path="religion" class="form-control select2" style="width: 100%;" disabled="true">
                  <form:option value="-10" selected="selected">Choose Your Religion</form:option>
				   <form:option value="Hinduism">Hinduism</form:option>
                  <form:option value="Islam">Islam</form:option>
                  <form:option value="Christianity">Christianity</form:option>
                  <form:option value="Sikhism">Sikhism</form:option>
                  <form:option value="Buddhism">Buddhism</form:option>
                  <form:option value="Jainism">Jainism</form:option>
                  <form:option value="Others">Others1111</form:option>
                </form:select>
                </c:if>
                 <c:if test="${empty studentpinfo.religion}">
                <form:select path="religion" class="form-control select2" style="width: 100%;">
                  <form:option value="-10" selected="selected">Choose Your Religion</form:option>
				   <form:option value="Hinduism">Hinduism</form:option>
                  <form:option value="Islam">Islam</form:option>
                  <form:option value="Christianity">Christianity</form:option>
                  <form:option value="Sikhism">Sikhism</form:option>
                  <form:option value="Buddhism">Buddhism</form:option>
                  <form:option value="Jainism">Jainism</form:option>
                  <form:option value="Others">Others</form:option>
                </form:select>
                </c:if>
                
              </div>

              </div>
              <!-- /.form-group -->
              <div class="form-group">
			   <div class="form-group">
                <label>Caste :</label>
                <c:if test="${!empty studentpinfo.caste}">
                <form:select path="caste" class="form-control select2" style="width: 100%;" disabled="true">
                  <form:option value="-10" selected="selected">Choose Your Caste</form:option>
				   <form:option value="General">General</form:option>
                  <form:option value="OBC_MOBC">OBC/MOBC</form:option>
                  <form:option value="ST(P)">ST(P)</form:option>
                  <form:option value="ST(H)">ST(H)</form:option>
                  <form:option value="SC">SC</form:option>
                  <form:option value="Others">Others</form:option>
                </form:select>
                 </c:if>
                <c:if test="${empty studentpinfo.caste}">
                <form:select path="caste" class="form-control select2" style="width: 100%;">
                  <form:option value="-10" selected="selected">Choose Your Caste</form:option>
				   <form:option value="General">General</form:option>
                  <form:option value="OBC_MOBC">OBC/MOBC</form:option>
                  <form:option value="ST(P)">ST(P)</form:option>
                  <form:option value="ST(H)">ST(H)</form:option>
                  <form:option value="SC">SC</form:option>
                  <form:option value="Others">Others</form:option>
                </form:select>
                 </c:if>
              </div>

				<div class="form-group">
                <label>Nationality :</label>
                 <c:if test="${!empty studentpinfo.nationality}">
               <form:select path="nationality" class="form-control select2" style="width: 100%;" disabled="true">
                  <form:option value="-10" selected="selected">Choose Your Nationality</form:option>
				    <form:option value="INDIAN">INDIAN</form:option>
                  <form:option value="Others">Others</form:option>
                </form:select>
                </c:if>
                <c:if test="${empty studentpinfo.nationality}">
               <form:select path="nationality" class="form-control select2" style="width: 100%;">
                  <form:option value="-10" selected="selected">Choose Your Nationality</form:option>
				    <form:option value="INDIAN">INDIAN</form:option>
                  <form:option value="Others">Others</form:option>
                </form:select>
                </c:if>
              </div>
			  <!-- /.form-group -->
			  <div class="form-group">
                <label>Blood Group :</label>
                 <c:if test="${!empty studentpinfo.blood_group}">
                <form:select path="blood_group" class="form-control select2" style="width: 100%;" disabled="true">
                  <form:option value="-10" selected="selected">Choose Your Blood Group</form:option>
				   <form:option value="A+">A+</form:option>
                  <form:option value="A-">A-</form:option>
                  <form:option value="B+">B+</form:option>
                  <form:option value="B-">B-</form:option>
                  <form:option value="AB+">AB+</form:option>
                  <form:option value="AB-">AB-</form:option>
				  <form:option value="O+">O+</form:option>
                  <form:option value="O-">O-</form:option>
                </form:select>
                </c:if>
                <c:if test="${empty studentpinfo.blood_group}">
                <form:select path="blood_group" class="form-control select2" style="width: 100%;">
                  <form:option value="-10" selected="selected">Choose Your Blood Group</form:option>
				   <form:option value="A+">A+</form:option>
                  <form:option value="A-">A-</form:option>
                  <form:option value="B+">B+</form:option>
                  <form:option value="B-">B-</form:option>
                  <form:option value="AB+">AB+</form:option>
                  <form:option value="AB-">AB-</form:option>
				  <form:option value="O+">O+</form:option>
                  <form:option value="O-">O-</form:option>
                </form:select>
                </c:if>
              </div>
              </div>

            </div>
            <!-- /.col -->

          </div>
          <!-- /.row -->
        </div>
        <!-- /.box-body -->
        
        
        
          <div class="box-footer"> 
        
        
        
        
        <c:set var="now" value="<%=new java.util.Date()%>"/>
        <fmt:formatDate pattern="dd/MM/yyyy hh:mm:ss" value="${now}" var="fmdtt"/>
        <form:hidden path="date_time" value="${fmdtt}"/>
         <form:hidden path="status" value="Completed"/>
         <c:if test="${studentpinfo.student1_id!=0}">
               
				</c:if>
				<c:if test="${studentpinfo.student1_id==0}">
                <button type="submit" class="btn btn-primary">Save</button>
				<button type="reset" class="btn btn-primary">Cancel</button>
				</c:if>
				
	</form:form>
				
              </div>
      </div>
      <!-- /.box -->
	    <!-- PERSONAL INFORMATION OF THE STUDENT PART ENDS HERE-->
	    
	    
	    
	    
	
		 <!-- BRANCH SELECTION OF THE STUDENT PART STARTS HERE-->
 
           <div class="box box-success" >
        <div class="box-header with-border">
		<button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
          <h3 class="box-title">Choose Your Branch</h3>

         <!-- <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
          </div> -->
        </div>
        <!-- /.box-header -->
        <div class="box-body">
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <div class="form-group">
                  <label>1st Preference : </label>
                
            	 <select  class="form-control select2" style="width: 100%;">
                  <option value="-10" selected="selected">Choose Your Nationality</option>
				    <option value="INDIAN">INDIAN</option>
                  <option value="Others">Others</option>
                </select>
               
                </div>
				<div class="form-group">
                 <label>2nd Preference :</label>
                
            	 <select  class="form-control select2" style="width: 100%;">
                  <option value="-10" selected="selected">Choose Your Nationality</option>
				    <option value="INDIAN">INDIAN</option>
                  <option value="Others">Others</option>
                </select>
                </div>
				<div class="form-group">
                 <label>3rd Preference :</label>
                
            	 <select  class="form-control select2" style="width: 100%;">
                  <option value="-10" selected="selected">Choose Your Nationality</option>
				    <option value="INDIAN">INDIAN</option>
                  <option value="Others">Others</option>
                </select>
                </div>
				  
              </div>
              
              <!-- /.form-group -->

              <!--<div class="form-group">
                <label>Disabled</label>

              </div> -->
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
				 <div class="col-md-6">
              <div class="form-group">
                <div class="form-group">
                   <label>4th Preference :</label>
                
            	 <select  class="form-control select2" style="width: 100%;">
                  <option value="-10" selected="selected">Choose Your Nationality</option>
				    <option value="INDIAN">INDIAN</option>
                  <option value="Others">Others</option>
                </select>
                </div>
				<div class="form-group">
                 <label>5th Preference :</label>
                
            	 <select  class="form-control select2" style="width: 100%;">
                  <option value="-10" selected="selected">Choose Your Nationality</option>
				    <option value="INDIAN">INDIAN</option>
                  <option value="Others">Others</option>
                </select>
                </div>
				<div class="form-group">
                <label>6th Preference :</label>
                
            	 <select  class="form-control select2" style="width: 100%;">
                  <option value="-10" selected="selected">Choose Your Nationality</option>
				    <option value="INDIAN">INDIAN</option>
                  <option value="Others">Others</option>
                </select>
                </div>
				 
				
			 
			 
              </div>
              <!-- /.form-group -->

              <!--<div class="form-group">
                <label>Disabled</label>

              </div> -->
              <!-- /.form-group -->
            </div>

            <!-- /.col -->

          </div>
          <!-- /.row -->
        </div>
        <!-- /.box-body -->
        <div class="box-footer">
                <button type="submit" class="btn btn-primary" >Save</button>
				<button type="reset" class="btn btn-primary">Cancel</button>
              </div>
      </div>
      <!-- /.box -->
		 
		  <!-- BRANCH SELECTION OF THE STUDENT PART ENDS HERE-->
		

		<!--PARENTS INFORMATION PART STARTS HERE -->
      <div class="box box-success" >
        <div class="box-header with-border">
		<button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
          <h3 class="box-title">Parents Information</h3>

         <!-- <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
          </div> -->
        </div>
        <!-- /.box-header -->
        <div class="box-body">
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <div class="form-group">
                  <label for="exampleInputEmail1">Fathers Name</label>

                  <div class="row">
					<div class="col-xs-4">
                   <input type="text" class="form-control" placeholder="First Name">
					</div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="Middle Name">
                </div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="Last Name">
                </div>
              </div>
                </div>
				<div class="form-group">
                 <label>Email Id:</label>
                <div class="input-group">
                <span class="input-group-addon"><i class="fa fa-envelope"></i></span>
                <input type="email" class="form-control" placeholder="your@domain.com">
				</div>
                </div>
				<div class="form-group">
                 <label>Mobile Number:</label>

                <div class="input-group">
                  <div class="input-group-addon">
                    <i class="fa fa-phone"></i>
                  </div>
                  <input type="text" class="form-control" data-inputmask='"mask": "+99-9999999999"' data-mask>
                </div>
                </div>
				  
              </div>
              <!-- /.form-group -->

              <!--<div class="form-group">
                <label>Disabled</label>

              </div> -->
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
				 <div class="col-md-6">
              <div class="form-group">
                <div class="form-group">
                  <label for="exampleInputEmail1">Mothers Name</label>

                  <div class="row">
					<div class="col-xs-4">
                   <input type="text" class="form-control" placeholder="First Name">
					</div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="Middle Name">
                </div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="Last Name">
                </div>
              </div>
                </div>
				<div class="form-group">
                 <label>Email Id:</label>
                <div class="input-group">
                <span class="input-group-addon"><i class="fa fa-envelope"></i></span>
                <input type="email" class="form-control" placeholder="your@domain.com">
				</div>
                </div>
				<div class="form-group">
                 <label>Mobile Number:</label>

                <div class="input-group">
                  <div class="input-group-addon">
                    <i class="fa fa-phone"></i>
                  </div>
                  <input type="text" class="form-control" data-inputmask='"mask": "+99-9999999999"' data-mask>
                </div>
                </div>
				 
				
			 
			 
              </div>
              <!-- /.form-group -->

              <!--<div class="form-group">
                <label>Disabled</label>

              </div> -->
              <!-- /.form-group -->
            </div>

            <!-- /.col -->

          </div>
          <!-- /.row -->
        </div>
        <!-- /.box-body -->
        <div class="box-footer">
                <button type="submit" class="btn btn-primary" >Save</button>
				<button type="reset" class="btn btn-primary">Cancel</button>
              </div>
      </div>
      <!-- /.box -->
	    <!-- PARENTS INFORMATION PART ENDS HERE -->
		
		<!--Address INFORMATION PART STARTS HERE -->
      <div class="box box-success" >
        <div class="box-header with-border">
		<button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
          <h3 class="box-title">Address Information</h3>

         <!-- <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
          </div> -->
        </div>
        <!-- /.box-header -->
        <div class="box-body">
          <div class="row">
            <div class="col-md-6">
              <div class="form-group">
               
				  <div class="form-group">
                  <label>Permanent Address :</label>
                  <textarea class="form-control" rows="3" name="a1" placeholder="Enter Your Permanent Address"></textarea>
                </div>
				<div class="row">
					<div class="col-xs-4">
                   <input type="text" class="form-control" placeholder="State">
					</div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="District">
                </div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="Town/City">
                </div>
              </div>
			  <br>
			  <div class="row">
					<div class="col-xs-4">
                   <input type="text" class="form-control" placeholder="Street/Bye lane">
					</div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="Police Station">
                </div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="Post Office">
                </div>

              </div>
			  <br>
			  <div class="row">
					<div class="col-xs-4">
                   <input type="text" class="form-control" placeholder="Pin Code">
					</div>

              </div>
              </div>
              <!-- /.form-group -->

              <!--<div class="form-group">
                <label>Disabled</label>

              </div> -->
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
				 <div class="col-md-6">
              <div class="form-group">
                
				  <div class="form-group">
                  <label>Communication Address :  <input type="checkbox" class="minimal-red">(Tick <i class="fa fa-check-square-o" aria-hidden="true"></i> if same as permanent address)</label>
                  <textarea class="form-control" rows="3" placeholder="Enter Your Communication Address"></textarea>
                </div>
				<div class="row">
					<div class="col-xs-4">
                   <input type="text" class="form-control" placeholder="State">
					</div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="District">
                </div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="Town/City">
                </div>
              </div>
			  <br>
			  <div class="row">
					<div class="col-xs-4">
                   <input type="text" class="form-control" placeholder="Street/Bye lane">
					</div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="Police Station">
                </div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="Post Office">
                </div>

              </div>
			  <br>
			  <div class="row">
					<div class="col-xs-4">
                   <input type="text" class="form-control" placeholder="Pin Code">
					</div>

              </div>
              </div>
              <!-- /.form-group -->

              <!--<div class="form-group">
                <label>Disabled</label>

              </div> -->
              <!-- /.form-group -->
            </div>

            <!-- /.col -->

          </div>
          <!-- /.row -->
        </div>
        <!-- /.box-body -->
        <div class="box-footer">
                <button type="submit" class="btn btn-primary" >Save</button>
				<button type="reset" class="btn btn-primary">Cancel</button>
              </div>
      </div>
      <!-- /.box -->
	    <!-- Address INFORMATION PART ENDS HERE -->

		<!-- EDUCATIONAL INFORMATION PART STARTS HERE -->
      <div class="box box-success">
        <div class="box-header with-border">
		<button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
          <h3 class="box-title">Educational Information Class X (H.S.L.C) & Class XII (Higher Secondary ) </h3>

         <!-- <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
          </div> -->
        </div>
        <!-- /.box-header -->
        <div class="box-body">
        <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <div class="form-group">
				<label for="exampleInputEmail1">Enter Your CLass X (H.S.L.C) Details :</label><br>
                  <label for="exampleInputEmail1">School Name :</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter Your (Class X) Full School Name With Location">
                </div>
				<div class="form-group">
                  <label for="exampleInputEmail1">Board :</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter Your (Class X) Full Board/University Name With Location">
                </div>
				<div class="form-group">
                  <label for="exampleInputEmail1">Year of Passing :</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter Your Year of Passing">
                </div>
				<div class="form-group">
                  <label for="exampleInputEmail1">Percentage/CGPA :</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter Your (Class X) Percentage or CGPA">
                </div>
              </div>
              <!-- /.form-group -->

              <!--<div class="form-group">
                <label>Disabled</label>

              </div> -->
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
            <div class="col-md-6">
              <div class="form-group">

               <div class="form-group">
                <div class="form-group">
				<label for="exampleInputEmail1">Enter Your CLass XII (Higher Secondary) Details :</label><br>
                  <label for="exampleInputEmail1">College/Institute Name</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter Your (Class XII) Full School Name With Location">
                </div>
				<div class="form-group">
                  <label for="exampleInputEmail1">Board :</label>
                 <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter Your (Class XII) Full Board/University Name With Location">
                </div>
				<div class="form-group">
                 <label for="exampleInputEmail1">Year of Passing :</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter Your Year of Passing">
                </div>
				<div class="form-group">
                  <label for="exampleInputEmail1">Percentage/CGPA :</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter Your (Class XII) Percentage or CGPA">
                </div>
              </div>
              </div>
            </div>
            <!-- /.col -->
          </div>
          <!-- /.row -->
        </div>
        <!-- /.box-body -->
        <div class="box-footer">
                <button type="submit" class="btn btn-primary" >Save</button>
				<button type="reset" class="btn btn-primary">Cancel</button>
              </div>
      </div>
      <!-- /.box -->
	   <!-- EDUCATIONAL INFORMATION PART ENDS HERE -->

		<!-- EDUCATIONAL INFORMATION PART STARTS HERE -->
      <div class="box box-success">
        <div class="box-header with-border">
		<button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
          <h3 class="box-title">Educational Information ( GRADUATION/DIPLOMA & ENTRANCE ( JEE MAIN & CEE ) )</h3>

         <!-- <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
          </div> -->
        </div>
        <!-- /.box-header -->
        <div class="box-body">
        <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                <div class="form-group">
				<label for="exampleInputEmail1">Enter Your Graduation/Diploma (Degree) Details :</label><br>
                  <label for="exampleInputEmail1">College/Institute Name :</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter Your (Degree) Full College Name With Location">
                </div>
				<div class="form-group">
                  <label for="exampleInputEmail1">Board/University :</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter Your (Degree) Full Board/University Name With Location">
                </div>
				<div class="form-group">
                  <label for="exampleInputEmail1">Year of Passing :</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter Your Year of Passing">
                </div>
				<div class="form-group">
                  <label for="exampleInputEmail1">Percentage/CGPA :</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter Your (Degree) Percentage or CGPA">
                </div>
              </div>
              <!-- /.form-group -->

              <!--<div class="form-group">
                <label>Disabled</label>

              </div> -->
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
            <div class="col-md-6">
              <div class="form-group">

               <div class="form-group">
                <div class="form-group">
				<label for="exampleInputEmail1">Enter Your Entrance Examination Details :</label><br>
                  <label for="exampleInputEmail1">JEE MAIN :</label>
                  <div class="row">
					<div class="col-xs-4">
                   <input type="text" class="form-control" placeholder="ROLL NUMBER">
					</div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="MARKS OBTAINED">
                </div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="RANK">
                </div>
              </div>

            </div>
              </div>

              </div>

			   <div class="form-group">
                  <label for="exampleInputEmail1">CEE :</label>
                  <div class="row">
					<div class="col-xs-4">
                   <input type="text" class="form-control" placeholder="ROLL NUMBER">
					</div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="MARKS OBTAINED">
                </div>
                <div class="col-xs-4">
                  <input type="text" class="form-control" placeholder="RANK">
                </div>
              </div>

            </div>
			 <div class="form-group">
                  <label for="exampleInputEmail1">Other Certifications if Completed :</label>
                  <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Certification Name,Organisation & Location">
                </div>
				<br>
				<div class="form-group">
                  <label for="exampleInputEmail1">***Note :UG Courses student donot fiilup the degree examination part.</p>
            <p>***Note :UG & PG Lateral and PG Courses student fiilup the degree examination part.</label>

                </div>
            </div>
            <!-- /.col -->
          </div>
          <!-- /.row -->
        </div>
        <!-- /.box-body -->
        <div class="box-footer">
                <button type="submit" class="btn btn-primary" >Save</button>
				<button type="reset" class="btn btn-primary">Cancel</button>
              </div>
      </div>
      <!-- /.box -->
	   <!-- EDUCATIONAL INFORMATION PART ENDS HERE -->
	   
	   <!-- OTHER FACILITIES PART STARTS HERE -->
      <div class="box box-success">
        <div class="box-header with-border">
		<button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
          <h3 class="box-title">FACILITIES (BUS & HOSTEL)</h3>

         <!-- <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
          </div> -->
        </div>
        <!-- /.box-header -->
        <div class="box-body">
        <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                 <div class="form-group">
					<label>Do you want to avail Bus Service?</label>
						<div class="form-group">
						<br>
							<label>
							<input type="radio" name="r3" class="flat-red" checked>
							Yes
							</label>
							&nbsp;
							<label>
							<input type="radio" name="r3" class="flat-red">
							No
							</label>
						</div>
				</div>
				
              </div>
              <!-- /.form-group -->

              <!--<div class="form-group">
                <label>Disabled</label>

              </div> -->
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
            <div class="col-md-6">
              <div class="form-group">

               <div class="form-group">
				 <div class="form-group">
					<label>Do you want to avail Hostel Facility?</label>
						<div class="form-group">
						<br>
							<label>
							<input type="radio" name="r4" class="flat-red" checked>
							Boys Hostel
							</label>
							&nbsp;
							<label>
							<input type="radio" name="r4" class="flat-red">
							Girls Hostel
							</label>
							<label>
							<input type="radio" name="r4" class="flat-red">
							Not Required
							</label>
						</div>
				</div>
              </div>

              </div>

			   
            </div>
            <!-- /.col -->
          </div>
          <!-- /.row -->
        </div>
        <!-- /.box-body -->
        <div class="box-footer">
                <button type="submit" class="btn btn-primary" >Save</button>
				<button type="reset" class="btn btn-primary">Cancel</button>
              </div>
      </div>
      <!-- /.box -->
	   <!-- EDUCATIONAL INFORMATION PART ENDS HERE -->

		<!-- UPLOAD DOCUMENT PART STARTS HERE -->
      <div class="box box-success">
        <div class="box-header with-border">
		<button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
          <h3 class="box-title">Upload Documents</h3>

         <!-- <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
          </div> -->
        </div>
        <!-- /.box-header -->
        <div class="box-body">
        <div class="row">
            <div class="col-md-6">
              <div class="form-group">
               <div class="form-group">
                <label>Upload :</label>
                <select class="form-control select2" style="width: 100%;">
				<option id="button">Choose your option</option>
                  <option id="show">Photo</option>
                  <option id="show1">Signature</option>
                </select>
              </div>
                
				<div class="form-group">
                 
                </div>
				<div class="form-group">
                  
                </div>
				<div class="form-group">
                 
                </div>
              </div>
              <!-- /.form-group -->

              <!--<div class="form-group">
                <label>Disabled</label>

              </div> -->
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
            <div class="col-md-6">
              <div class="form-group">

               <div class="form-group">
                <div class="form-group" >
                  <label for="exampleInputFile" id="hid">File input</label>
                  <input type="file" id="hid1">

                  <p class="help-block" id="hid2">Document size should be between 10kb-100kb</p>
                </div>
				<div class="form-group">
                 
                </div>
				<div class="form-group">
                 
                </div>
				<div class="form-group">
                  
                </div>
              </div>
              </div>
            </div>
            <!-- /.col -->
          </div>
          <!-- /.row -->
        </div>
        <!-- /.box-body -->
        <div class="box-footer">
                <button type="submit" class="btn btn-primary" >Save</button>
				<button type="reset" class="btn btn-primary">Cancel</button>
              </div>
      </div>
      <!-- /.box -->
	  <!-- UPLOAD DOCUMENT PART ENDS HERE -->

	   <!-- OTHER FACILITIES PART STARTS HERE -->
      <div class="box box-success">
        <div class="box-header with-border">
		<button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
          <h3 class="box-title">FACILITIES (BUS & HOSTEL)</h3>

         <!-- <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
          </div> -->
        </div>
        <!-- /.box-header -->
        <div class="box-body">
        <div class="row">
            <div class="col-md-6">
              <div class="form-group">
                 <div class="form-group">
					<label>Do you want to avail Bus Service?</label>
						<div class="form-group">
						<br>
							<label>
							<input type="radio" name="r3" class="flat-red" checked>
							Yes
							</label>
							&nbsp;
							<label>
							<input type="radio" name="r3" class="flat-red">
							No
							</label>
						</div>
				</div>
				
              </div>
              <!-- /.form-group -->

              <!--<div class="form-group">
                <label>Disabled</label>

              </div> -->
              <!-- /.form-group -->
            </div>
            <!-- /.col -->
            <div class="col-md-6">
              <div class="form-group">

               <div class="form-group">
				 <div class="form-group">
					<label>Do you want to avail Hostel Facility?
<span class="sr-only">Loading...</span></label>
						<div class="form-group">
						<br>
							<label>
							<input type="radio" name="r4" class="flat-red" checked>
							Boys Hostel
							</label>
							&nbsp;
							<label>
							<input type="radio" name="r4" class="flat-red">
							Girls Hostel
							</label>
							<label>
							<input type="radio" name="r4" class="flat-red">
							Not Required
							</label>
						</div>
				</div>
              </div>

              </div>

			   
            </div>
            <!-- /.col -->
          </div>
          <!-- /.row -->
        </div>
        <!-- /.box-body -->
		<center>
        <div class="box-footer">
                <button style="width:px;" type="submit" class="btn btn-primary"  >Save</button>
				<button type="submit" class="btn btn-primary" >Save</button>
				<button type="reset" class="btn btn-primary">Cancel</button>
              </div>
			  </center>
      </div>
      <!-- /.box -->
	   <!-- EDUCATIONAL INFORMATION PART ENDS HERE -->

    </section>
    <!-- /.content -->
<!--   </div> -->
  </div>
  <!-- /.content-wrapper -->
     

      <!-- Main row -->
      <div class="row">
        <!-- Left col -->
        <div class="col-md-8">
         
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
 </div> 
  <!-- /.content-wrapper -->

  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 2.3.8
    </div>
    <strong>Copyright &copy; 2014-2016</strong> All rights
    reserved.
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Create the tabs -->
    <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
    
     
    </ul>
    <!-- Tab panes -->
    <div class="tab-content">
      <!-- Home tab content -->
      <div class="tab-pane" id="control-sidebar-home-tab">
        <h3 class="control-sidebar-heading">Recent Activity</h3>
        <ul class="control-sidebar-menu">
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-birthday-cake bg-red"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Langdon's Birthday</h4>

                <p>Will be 23 on April 24th</p>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-user bg-yellow"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Frodo Updated His Profile</h4>

                
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-envelope-o bg-light-blue"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Nora Joined Mailing List</h4>

               
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <i class="menu-icon fa fa-file-code-o bg-green"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Cron Job 254 Executed</h4>

             
              </div>
            </a>
          </li>
        </ul>
        <!-- /.control-sidebar-menu -->

        <h3 class="control-sidebar-heading">Tasks Progress</h3>
        <ul class="control-sidebar-menu">
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Custom Template Design
                <span class="label label-danger pull-right">70%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-danger" style="width: 70%"></div>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Update Resume
                <span class="label label-success pull-right">95%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-success" style="width: 95%"></div>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Laravel Integration
                <span class="label label-warning pull-right">50%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-warning" style="width: 50%"></div>
              </div>
            </a>
          </li>
          <li>
            <a href="javascript:void(0)">
              <h4 class="control-sidebar-subheading">
                Back End Framework
                <span class="label label-primary pull-right">68%</span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-primary" style="width: 68%"></div>
              </div>
            </a>
          </li>
        </ul>
        <!-- /.control-sidebar-menu -->

    

    
      <!-- /.tab-pane -->
    </div>
  </aside>
  <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>

</div>
<!-- ./wrapper -->

<!-- jQuery 2.2.3 -->
<script src="<%=request.getContextPath()%>/resources/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="<%=request.getContextPath()%>/resources/bootstrap/js/bootstrap.min.js"></script>
<!-- Select2 -->
<script src="<%=request.getContextPath()%>/resources/plugins/select2/select2.full.min.js"></script>
<!-- InputMask -->
<script src="<%=request.getContextPath()%>/resources/plugins/input-mask/jquery.inputmask.js"></script>
<script src="<%=request.getContextPath()%>/resources/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="<%=request.getContextPath()%>/resources/plugins/input-mask/jquery.inputmask.extensions.js"></script>
<!-- date-range-picker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/plugins/daterangepicker/daterangepicker.js"></script>
<!-- bootstrap datepicker -->
<script src="<%=request.getContextPath()%>/resources/plugins/datepicker/bootstrap-datepicker.js"></script>
<!-- bootstrap color picker -->
<script src="<%=request.getContextPath()%>/resources/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<!-- bootstrap time picker -->
<script src="<%=request.getContextPath()%>/resources/plugins/timepicker/bootstrap-timepicker.min.js"></script>
<!-- SlimScroll 1.3.0 -->
<script src="<%=request.getContextPath()%>/resources/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- iCheck 1.0.1 -->
<script src="<%=request.getContextPath()%>/resources/plugins/iCheck/icheck.min.js"></script>
<!-- FastClick -->
<script src="<%=request.getContextPath()%>/resources/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="<%=request.getContextPath()%>/resources/dist/js/app.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="<%=request.getContextPath()%>/resources/dist/js/demo.js"></script>
<!-- Page script -->
<script>
  $(function () {
    //Initialize Select2 Elements
    $(".select2").select2();

    //Datemask dd/mm/yyyy
    $("#datemask").inputmask("dd/mm/yyyy", {"placeholder": "dd/mm/yyyy"});
    //Datemask2 mm/dd/yyyy
    $("#datemask2").inputmask("dd/mm/yyyy", {"placeholder": "dd/mm/yyyy"});
    //Money Euro
    $("[data-mask]").inputmask();

    //Date range picker
    $('#reservation').daterangepicker();
    //Date range picker with time picker
    $('#reservationtime').daterangepicker({timePicker: true, timePickerIncrement: 30, format: 'DD/MM/YYYY h:mm A'});
    //Date range as a button
    $('#daterange-btn').daterangepicker(
        {
          ranges: {
            'Today': [moment(), moment()],
            'Yesterday': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
            'Last 7 Days': [moment().subtract(6, 'days'), moment()],
            'Last 30 Days': [moment().subtract(29, 'days'), moment()],
            'This Month': [moment().startOf('month'), moment().endOf('month')],
            'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
          },
          startDate: moment().subtract(29, 'days'),
          endDate: moment()
        },
        function (start, end) {
          $('#daterange-btn span').html(start.format('DDDD M, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
        }
    );

    //Date picker
    $('#datepicker').datepicker({
      autoclose: true
    });

    //iCheck for checkbox and radio inputs
    $('input[type="checkbox"].minimal, input[type="radio"].minimal').iCheck({
      checkboxClass: 'icheckbox_minimal-blue',
      radioClass: 'iradio_minimal-blue'
    });
    //Red color scheme for iCheck
    $('input[type="checkbox"].minimal-red, input[type="radio"].minimal-red').iCheck({
      checkboxClass: 'icheckbox_minimal-red',
      radioClass: 'iradio_minimal-red'
    });
    //Flat red color scheme for iCheck
    $('input[type="checkbox"].flat-red, input[type="radio"].flat-red').iCheck({
      checkboxClass: 'icheckbox_flat-green',
      radioClass: 'iradio_flat-green'
    });

    //Colorpicker
    $(".my-colorpicker1").colorpicker();
    //color picker with addon
    $(".my-colorpicker2").colorpicker();

    //Timepicker
    $(".timepicker").timepicker({
      showInputs: false
    });
  });
</script>
</body>
</html>
