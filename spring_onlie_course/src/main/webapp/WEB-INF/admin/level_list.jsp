<%@ include file="/WEB-INF/common/include.jsp"%>
<%@ include file="/WEB-INF/bootstrap.jsp"%>



<div class="content-wrapper">
<div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6 col-6">
            <h1 class="m-0">Level List</h1>
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
						
                      <th style="width: 40px">Action</th>
			
					</tr>
                  </thead>
                  <tbody>
                   <c:forEach items="${levelList }" var="its" varStatus="row">
				<tr>
				<td>${row.count}</td>
				<td>${its.level_name}</td>
				     
				</tr>
					</c:forEach>
                  </tbody>
                </table>
              </div>

			</div>


</div>


