<%@ include file="/WEB-INF/common/include.jsp"%>
<%@ include file="/WEB-INF/bootstrap.jsp"%>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6 col-6">
            <h1 class="m-0">Manage Level</h1>
          </div><!-- /.col -->
          <div class="col-sm-6 col-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Create</li>
            </ol>
          </div><!-- /.col -->
         <!--<a href="/category/category_list" class="btn btn-primary mt-4">Course List</a>  --> 
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <div class="container">
	<div class="col-lg-6">
 	<form:form action="save_level" method="POST" modelAttribute="level" >
                <div class="card-body">
                  <div class="form-group">
                   <label for="price">Course_name:</label>
                   <form:select path="course.course_id" class="form-control">
	<c:forEach items="${courseList}" var="course">
	<form:option value="${course.course_id }">${course.course_name }</form:option>
	</c:forEach></form:select>
                  </div>
                  <div class="form-group">
                 <label for="level_name">Level_Name:</label>
                    <form:input path="level_name" class="form-control" placeholder="Enter level"/>
                  </div>
                 
                  
                </div>
                <!-- /.card-body -->

                <div class="card-footer">
                  <button type="submit" class="btn btn-primary">Submit</button>
                     <button type="cancle" class="btn btn-primary">Cancle</button>
                </div>
              </form:form>
              </div>
              </div>
</div>
