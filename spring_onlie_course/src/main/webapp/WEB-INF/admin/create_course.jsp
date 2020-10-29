<%@ include file="/WEB-INF/common/include.jsp"%>
<%@ include file="/WEB-INF/bootstrap.jsp"%>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6 col-6">
            <h1 class="m-0">Manage Course</h1>
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
 	<form:form action="save_course" method="POST" modelAttribute="course" enctype="multipart/form-data" >

                <div class="card-body">
                  <div class="form-group">
                     <label for="course_name">Course_name:</label>
     					 <form:input path="course_name" class="form-control" placeholder="Enter course_name"/>
      
                  </div>
                  <div class="form-group">
                  <label for="Course_Description">Description:</label>
      					<form:input path="course_description" class="form-control" placeholder="Enter Description"/>
    			  </div>
                   <div class="form-group">
                   <label for="file">Photo</label>
     				 <form:input  type="file" path="file"/>  </div>
                  
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
