<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="false"%>

<% HttpSession session = request.getSession(); %>

<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="<%=request.getContextPath()%>/resources/dist/img/avatar5.png" class="img-circle" alt="User Image">
        </div>
        
        
        <div class="pull-left info">
        
          <p><% if(session.getAttribute("enrol_id")!=null){ %>
                	  <% out.print(session.getAttribute("enrol_id")); %>
                  <% }else{ %>
                	 <%  out.print("You are not logged in!"); %>
                 <%  } %></p> 
         
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
        
      </div>
      <!-- search form -->
     
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu">
        <li class="header">MAIN NAVIGATION</li>
        <li>
          <a href="index">
            <i class="fa fa-dashboard"></i> <span>Dashboard</span>
            <span class="pull-right-container"> </span>
          </a>
        </li>
         <li class="treeview">
          <a href="#">
            <i class="fa fa-database" aria-hidden="true"></i>
            <span>Add Master Data</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
             <li><a href="degreePage"><i class="fa fa-circle-o text-aqua"></i>Add Degree</a></li>
            <li><a href="coursePage"><i class="fa fa-circle-o text-aqua"></i>Add Course</a></li>
			<li><a href="branchPage"><i class="fa fa-circle-o text-aqua"></i>Add Branch</a></li>
			<li><a href="categoryPage"><i class="fa fa-circle-o text-aqua"></i>Add Catagory</a></li>
			<li><a href="cutoffpercentagePage"><i class="fa fa-circle-o text-aqua"></i>Add Cutt of Percentage</a></li>
			<li><a href="seatdetailsPage"><i class="fa fa-circle-o text-aqua"></i>Add Seat Details</a></li>
          </ul>
        </li>
        <li role="presentation" class="divider"></li>
      	<li class="treeview">
          <a href="#">
            <i class="fa fa-pie-chart"></i>
            <span>View Master Entries</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="viewDegreemaster"><i class="fa fa-circle-o text-aqua"></i>Degree Master Entries</a></li>
            <li><a href="viewCoursemaster"><i class="fa fa-circle-o text-aqua"></i>Course Master Entries</a></li>
            <li><a href="viewBranchmaster"><i class="fa fa-circle-o text-aqua"></i>Branch Master Entries</a></li>
            <li><a href="viewCategorymaster"><i class="fa fa-circle-o text-aqua"></i>Category Master Entries</a></li>
			<li><a href="viewCutoffpercentage"><i class="fa fa-circle-o text-aqua"></i>Cut off Percentage Entries</a></li>
			<li><a href="viewSeatdetails"><i class="fa fa-circle-o text-aqua"></i>Seat Details Entries</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-users" aria-hidden="true"></i>
            <span>Student Details</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
             <li><a href=viewapplicantregister><i class="fa fa-circle-o text-aqua"></i>Candidate Registration</a></li>
            <li><a href="coursePage"><i class="fa fa-circle-o text-aqua"></i>Candidate Full Registration</a></li>
<!-- 			<li><a href="branchPage"><i class="fa fa-circle-o text-aqua"></i>Add Branch</a></li> -->
<!-- 			<li><a href="categoryPage"><i class="fa fa-circle-o text-aqua"></i>Add Catagory</a></li> -->
<!-- 			<li><a href="cutoffpercentagePage"><i class="fa fa-circle-o text-aqua"></i>Add Cutt of Percentage</a></li> -->
<!-- 			<li><a href="seatdetailsPage"><i class="fa fa-circle-o text-aqua"></i>Add Seat Details</a></li> -->
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-credit-card-alt" aria-hidden="true"></i>
            <span>Fee Structure</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
             <li><a href=viewapplicantregister><i class="fa fa-circle-o text-aqua"></i>Registration Fees</a></li>
<!--             <li><a href="coursePage"><i class="fa fa-circle-o text-aqua"></i>Candidate Full Registration</a></li> -->
<!-- 			<li><a href="branchPage"><i class="fa fa-circle-o text-aqua"></i>Add Branch</a></li> -->
<!-- 			<li><a href="categoryPage"><i class="fa fa-circle-o text-aqua"></i>Add Catagory</a></li> -->
<!-- 			<li><a href="cutoffpercentagePage"><i class="fa fa-circle-o text-aqua"></i>Add Cutt of Percentage</a></li> -->
<!-- 			<li><a href="seatdetailsPage"><i class="fa fa-circle-o text-aqua"></i>Add Seat Details</a></li> -->
          </ul>
        </li>
      </ul>
   
    </section>
    <!-- /.sidebar -->
  </aside>
