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
  <title>Seat Details Master</title>
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
  <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/plugins/colorpicker/bootstrap-colorpicker.min.css">
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

  
  <jsp:include page="commonFiles/adminheader.jsp"></jsp:include>

  <!-- Left side column. contains the logo and sidebar -->
  
  <jsp:include page="commonFiles/adminsidebar.jsp"></jsp:include>
  

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Dashboard
        <small></small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="index"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Dashboard</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <!-- Info boxes -->
      <div class="row">
        <div class="col-md-3 col-sm-6 col-xs-12">
          <div class="info-box">
            <span class="info-box-icon bg-aqua"><i class="ion ion-ios-gear-outline"></i></span>

            <div class="info-box-content">
              <span class="info-box-text">CPU Traffic</span>
              <span class="info-box-number">90<small>%</small></span>
            </div>
            <!-- /.info-box-content -->
          </div>
          <!-- /.info-box -->
        </div>
        <!-- /.col -->
        <div class="col-md-3 col-sm-6 col-xs-12">
          <div class="info-box">
            <span class="info-box-icon bg-red"><i class="fa fa-google-plus"></i></span>

            <div class="info-box-content">
              <span class="info-box-text">Likes</span>
              <span class="info-box-number">41,410</span>
            </div>
            <!-- /.info-box-content -->
          </div>
          <!-- /.info-box -->
        </div>
        <!-- /.col -->

        <!-- fix for small devices only -->
        <div class="clearfix visible-sm-block"></div>

        <div class="col-md-3 col-sm-6 col-xs-12">
          <div class="info-box">
            <span class="info-box-icon bg-green"><i class="ion ion-ios-cart-outline"></i></span>

            <div class="info-box-content">
              <span class="info-box-text">Sales</span>
              <span class="info-box-number">760</span>
            </div>
            <!-- /.info-box-content -->
          </div>
          <!-- /.info-box -->
        </div>
        <!-- /.col -->
        <div class="col-md-3 col-sm-6 col-xs-12">
          <div class="info-box">
            <span class="info-box-icon bg-yellow"><i class="ion ion-ios-people-outline"></i></span>

            <div class="info-box-content">
              <span class="info-box-text">New Members</span>
              <span class="info-box-number">2,000</span>
            </div>
            <!-- /.info-box-content -->
          </div>
          <!-- /.info-box -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->

     
<div class="box box-success">
    <div class="box-header with-border">
        <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
        <h3 class="box-title">Add Seat Details</h3>
        </div>
         <c:url var="addAction" value="/addmaster8"></c:url>
<form:form role="form" action="${addAction}" modelAttribute="seatdetail" commandName="seatdetail">
    <div class="box-body">
     <div class="col-lg-12">
            <div class="row">
            
          
               
               	 <div class="col-md-6">
                <div class="form-group">
                    <label>Degree List</label>
                     <div class="input-group">
                  <div class="input-group-addon">
                    <i class="fa fa-user" aria-hidden="true"></i>
                         </div>
                    <form:select path="degree_id" class="form-control select2" style="width: 100%;" data-placeholder="Select ROle">   
                        <form:option value="0">Select an Option</form:option>
						<c:if test="${!empty listdegree}">
						<c:forEach items="${listdegree}" var="DegreeMaster">
						<form:option value="${DegreeMaster.degree_id}">${DegreeMaster.degree_name}</form:option>
						</c:forEach>
						</c:if>
						</form:select>
                    </div>
                    </div>
                    </div>
                
                   
               	 <div class="col-md-6">
                <div class="form-group">
                    <label>Course List</label>
                     <div class="input-group">
                  <div class="input-group-addon">
                    <i class="fa fa-user" aria-hidden="true"></i>
                         </div>
                    <form:select path="course_id" class="form-control select2" style="width: 100%;" data-placeholder="Select ROle">   
       					 <form:option value="0">Select an Option</form:option>
						<c:if test="${!empty listcourse}">
						<c:forEach items="${listcourse}" var="CourseMaster">
						<form:option value="${CourseMaster.course_id}">${CourseMaster.course_name}</form:option>
						</c:forEach>
						</c:if>
						</form:select>
                    </div>
                    </div>
                    </div>
                
	 <div class="col-md-6">
                <div class="form-group">
                    <label>Branch List</label>
                     <div class="input-group">
                  <div class="input-group-addon">
                    <i class="fa fa-user" aria-hidden="true"></i>
                         </div>
                    <form:select path="branch_id" class="form-control select2" style="width: 100%;" data-placeholder="Select ROle">   
                        <form:option value="0">Select an Option</form:option>
						<c:if test="${!empty listbranch}">
						<c:forEach items="${listbranch}" var="BranchMaster">
						<form:option value="${BranchMaster.branch_id}">${BranchMaster.branch_name}</form:option>
						</c:forEach>
						</c:if>
						</form:select>
                    </div>
                    </div>
                    </div>
	 <div class="col-md-6">
                <div class="form-group">
                    <label>Category List</label>
                     <div class="input-group">
                  <div class="input-group-addon">
                    <i class="fa fa-user" aria-hidden="true"></i>
                         </div>
                    <form:select path="category_id" class="form-control select2" style="width: 100%;" data-placeholder="Select ROle">   
                       <form:option value="0">Select an Option</form:option>
						<c:if test="${!empty listCategory}">
						<c:forEach items="${listCategory}" var="CategoryMaster">
						<form:option value="${CategoryMaster.category_id}">${CategoryMaster.category_name}</form:option>
						</c:forEach>
						</c:if>
						</form:select>
                    </div>
                    </div>
                    </div>					
                    
                    <div class="col-md-6">                  
                        <div class="form-group">
                            <label>Session(Current Year)</label>
                             <div class="input-group">
                                <div class="input-group-addon">
                            <i class="fa fa-code" aria-hidden="true"></i>
                                 </div>
                            <form:input path="session_s" class="form-control" placeholder="Current Year" required="required"/>
                        </div>
                        </div>
                    </div>
                     <div class="col-md-6">
                        <div class="form-group">
							 <label>Total Seats</label>	
                            <div class="input-group">
                                <div class="input-group-addon">
                            <i class="fa fa-bars" aria-hidden="true"></i>
                                </div>
                            <form:input path="total_seats" class="form-control" placeholder="Total Seats" required="required"/>
                        </div>
                    </div>
                    </div>
                  
                    <div class="col-md-6">
                        <div class="form-group">
							 <label>Seats Alloted</label>	
                            <div class="input-group">
                                <div class="input-group-addon">
                            <i class="fa fa-bars" aria-hidden="true"></i>
                                </div>
                            <form:input path="seats_alloted" class="form-control" placeholder="Seats Alloted" required="required"/>
                        </div>
                    </div>
                    </div>
  					 <div class="col-md-6">
                        <div class="form-group">
							 <label>Quota</label>	
                            <div class="input-group">
                                <div class="input-group-addon">
                            <i class="fa fa-bars" aria-hidden="true"></i>
                                </div>
                            <form:input path="quota" class="form-control" placeholder="Quota" required="required"/>
                        </div>
                    </div>
                    </div>					
                 <div class="col-md-6">
                <div class="form-group">
                    <label>Status</label>
                    <div class="input-group">
                                 <div class="input-group-addon">
                    <i class="fa fa-bars" aria-hidden="true"></i>
                        </div>
                    <form:select path="status" class="form-control select2" style="width: 100%;" data-placeholder="Select ROle">  
                        <form:option value="-10">Select An Option</form:option>
                        <form:option value="Active">Active</form:option>
                        <form:option value="Inactive">Inactive</form:option>                     
                    </form:select>
                    </div>
                    </div>
                    </div>
                       
            	  <div class="col-md-6">
                        <div class="form-group">
							 <label>Entry Date & Time</label>	
                            <div class="input-group">
                                <div class="input-group-addon">
                            <i class="fa fa-calendar" aria-hidden="true"></i>
                                </div>
                                <c:set var="now" value="<%=new java.util.Date()%>"/>
        <fmt:formatDate pattern="dd/MM/yyyy hh:mm:ss" value="${now}" var="fmdtt"/>
       
                            <form:input path="date_time" value="${fmdtt}"  class="form-control" placeholder="Branch Code" readonly="true"/>
                        </div>
                    </div>
                    </div>
                    </div>
        </div>
   		 <input type="submit" value="Save" class="btn btn-primary" >
            </form:form>
        </div>
     
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
    $("#datemask2").inputmask("mm/dd/yyyy", {"placeholder": "mm/dd/yyyy"});
    //Money Euro
    $("[data-mask]").inputmask();

    //Date range picker
    $('#reservation').daterangepicker();
    //Date range picker with time picker
    $('#reservationtime').daterangepicker({timePicker: true, timePickerIncrement: 30, format: 'MM/DD/YYYY h:mm A'});
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
          $('#daterange-btn span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
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
