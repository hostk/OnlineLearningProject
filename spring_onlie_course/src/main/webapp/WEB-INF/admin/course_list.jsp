<%@ include file="/WEB-INF/common/include.jsp"%>
<%@ include file="/WEB-INF/bootstrap.jsp"%>



<div class="content-wrapper">
<div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6 col-6">
            <h1 class="m-0">Course List</h1><br>
           <h6> <a href="<c:url value='/create_course'/>">Create New</a></h6>
          </div><!-- /.col -->
          <div class="col-sm-6 col-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">List</li>
            </ol>
          </div><!-- /.col -->
         <!--<a href="/category/category_list" class="btn btn-primary mt-4">Course List</a>  --> 
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
<div class="container">

<div class="card-body">
                <table class="table table-bordered">
                  <thead>
                    <tr>
                      <th style="width: 10px">No</th>
                     	<th>Name</th>
						<th>Description</th>
						<th>Photo</th>
                      <th style="width: 40px">Action</th>
                    </tr>
                  </thead>
                  <tbody>
                   <c:forEach items="${courseList }" var="its" varStatus="row">
			<tr>
				<td>${row.count}</td>
				<td>${its.course_name}</td>
				<td>${its.course_description}</td>
				<td><img src="./images/${its.photopath}" width="80" height="80" style="border:1px solid red;" /></td>
			<td><a href="${pageContext.request.contextPath}/department/edit/${d.id}">Edit</a>
				<a href="${pageContext.request.contextPath}/delete/${d.id}">Delete</a>
				</td>
				     
			</tr>
		</c:forEach>
                  </tbody>
                </table>
              </div>



</div>
</div>






