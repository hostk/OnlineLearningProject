<%@ include file="/WEB-INF/common/include.jsp"%>
<%@ include file="/WEB-INF/bootstrap.jsp"%>



<div class="content-wrapper">
<div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6 col-6">
            <h1 class="m-0">Level Material List</h1>
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
						<th>Type</th>
						
                      <th style="width: 40px">Action</th>
                    </tr>
                  </thead>
                  <tbody>
                  <c:forEach items="${levelmaterialList }" var="m" varStatus="row">
			<tr>
				<td>${row.count}</td>
				<td>${m.name}</td>
			<td><a href="/show/vedio/${m.vedioPath}">Video</a>
				<a href="/show/pdf/${m.pdfPath}">PDF</a></td></tr>
				
		</c:forEach>
                  </tbody>
                </table>
              </div>




</div>


</div>



